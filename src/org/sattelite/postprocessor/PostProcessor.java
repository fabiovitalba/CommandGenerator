package org.sattelite.postprocessor;

public interface PostProcessor {
    public byte[] postProcess(byte[] bytes) throws Exception;

}
