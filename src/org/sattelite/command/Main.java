package org.sattelite.command;

import org.sattelite.postprocessor.Compressor;
import org.sattelite.postprocessor.Encriptor;

public class Main {
	
	public static void main(String[] args){
		TurnCommand command = new TurnCommand("SLOW", 180, 60, 45); 

		// What if we wanted to create something like this:
		// Compressed + Properties
		// ... but we want to avoid duplicate code!

		XMLSerializer cxs = new XMLSerializer(new Compressor());
		cxs.generateFile("command.zip", command);
		
		PropertiesSerializer sps = new PropertiesSerializer(new Encriptor(5));
		sps.generateFile("command.txt", command);
		
	}

}
