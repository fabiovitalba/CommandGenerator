package org.sattelite.command;

import java.io.FileOutputStream;
import java.util.Map;

public abstract class AbstractSerializer {
    public void generateFile(String filename, PropertiesGetter propGetter) {
        byte[] bytes = formatInformation(propGetter.getPropertiesList());

        try {
            bytes = postProcess(bytes);
            FileOutputStream fileout = new FileOutputStream(filename);
            fileout.write(bytes);
            fileout.close();
        } catch (Exception e) {
            throw new RuntimeException("Problems writing the file", e);
        }
    }

    protected abstract byte[] postProcess(byte[] bytes) throws Exception;

    protected abstract byte[] formatInformation(Map<String, Object> props);
}
