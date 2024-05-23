package org.sattelite.postprocessor;

public class Encriptor implements PostProcessor {

    private int delay;

    public Encriptor(int delay) {
        this.delay = delay;
    }

    @Override
    public byte[] postProcess(byte[] bytes) throws Exception {
        byte[] newBytes = new byte[bytes.length];
        for(int i=0;i<bytes.length;i++){
            newBytes[i]= (byte) ((bytes[i]+delay) % Byte.MAX_VALUE);
        }
        return newBytes;
    }
}
