package org.sattelite.command;

public interface PostProcessor {
    public byte[] postProcess(byte[] bytes) throws Exception;
    
}
