package org.sattelite.command;

import java.util.Map;


public class CryptoPropertiesSerializer extends AbstractSerializer {
	
	private int delay;
	
	public CryptoPropertiesSerializer(int delay) {
		this.delay = delay;
	}

	@Override
	protected byte[] postProcess(byte[] bytes) {
		byte[] newBytes = new byte[bytes.length];
		for(int i=0;i<bytes.length;i++){
			newBytes[i]= (byte) ((bytes[i]+delay) % Byte.MAX_VALUE);
		}
		return newBytes;
	}

	@Override
	protected byte[] formatInformation(Map<String, Object> props) {
		StringBuilder propFileBuilder = new StringBuilder();
		for(String prop : props.keySet()){
			propFileBuilder.append(prop + "="+props.get(prop)+"\n");
		}
		byte[] bytes = propFileBuilder.toString().getBytes();
		return bytes;
	}

}
