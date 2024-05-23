package org.sattelite.command;

import org.sattelite.postprocessor.PostProcessor;
import java.io.FileOutputStream;
import java.util.Map;

public abstract class AbstractSerializer {
    private PostProcessor postProcessor;

    public AbstractSerializer(PostProcessor postProcessor) {
        this.postProcessor = postProcessor;
    }

    public void generateFile(String filename, PropertiesGetter propGetter) {
        byte[] bytes = formatInformation(propGetter.getPropertiesList());

        try {
            bytes = postProcessor.postProcess(bytes);
            FileOutputStream fileout = new FileOutputStream(filename);
            fileout.write(bytes);
            fileout.close();
        } catch (Exception e) {
            throw new RuntimeException("Problems writing the file", e);
        }
    }

    protected abstract byte[] formatInformation(Map<String, Object> props);
}
