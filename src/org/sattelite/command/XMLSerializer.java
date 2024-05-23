package org.sattelite.command;

import org.sattelite.postprocessor.PostProcessor;

import java.util.Map;

public class XMLSerializer extends AbstractSerializer {

	public XMLSerializer(PostProcessor postProcessor) {
		super(postProcessor);
	}

	@Override
	protected byte[] formatInformation(Map<String, Object> props) {
		StringBuilder propFileBuilder = new StringBuilder();
		propFileBuilder.append("<properties>");
		for(String prop : props.keySet()){
			propFileBuilder.append("<"+prop + ">"+props.get(prop)+"</"+prop + ">");
		}
		propFileBuilder.append("</properties>");
		byte[] bytes = propFileBuilder.toString().getBytes();
		return bytes;
	}

}
