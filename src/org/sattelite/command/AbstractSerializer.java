package org.sattelite.command;

import org.sattelite.postprocessor.PostProcessor;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractSerializer {
    private PostProcessor postProcessor;

    public AbstractSerializer(PostProcessor postProcessor) {
        this.postProcessor = postProcessor;
    }

    public void generateFile(String filename, Object command) {
        try {
            byte[] bytes = formatInformation(getPropertiesList(command));
            bytes = postProcessor.postProcess(bytes);
            FileOutputStream fileout = new FileOutputStream(filename);
            fileout.write(bytes);
            fileout.close();
        } catch (Exception e) {
            throw new RuntimeException("Problems writing the file", e);
        }
    }

    protected abstract byte[] formatInformation(Map<String, Object> props);

    private Map<String, Object> getPropertiesList(Object command) throws InvocationTargetException, IllegalAccessException {
        Map<String, Object> properties = new HashMap<>();

        Class<?> clazz = command.getClass();
        CommandType cmdtype = clazz.getAnnotation(CommandType.class);
        properties.put("CommandType",cmdtype.value());

        for (Method m : clazz.getMethods()) {
            if (includeInGetterPropMap(m)) {
                String propertyName = m.getName().substring(3);
                Object propertyValue = m.invoke(command);
                properties.put(propertyName,propertyValue);
            }
        }

        return properties;
    }

    private static boolean includeInGetterPropMap(Method m) {
        return m.getName().startsWith("get")
                && (m.getParameterCount() == 0)
                && (!m.getName().equals("getClass"))
                && (!m.isAnnotationPresent(IgnoreInSerialization.class));
    }
}
