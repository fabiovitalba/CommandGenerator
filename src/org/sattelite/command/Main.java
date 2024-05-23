package org.sattelite.command;

import org.sattelite.postprocessor.CompositePostProcessor;
import org.sattelite.postprocessor.Compressor;
import org.sattelite.postprocessor.Encriptor;
import org.sattelite.postprocessor.PostProcessor;

public class Main {
	
	public static void main(String[] args){
		//TurnCommand command = new TurnCommand("SLOW", 180, 60, 45);
		ForwardCommand command = new ForwardCommand("FULL",1000, "MySuperSecretCode");

		// Given Example
		/*
		XMLSerializer cxs = new XMLSerializer(new Compressor());
		cxs.generateFile("command.zip", command);
		
		PropertiesSerializer sps = new PropertiesSerializer(new Encriptor((byte)5));
		sps.generateFile("command.txt", command);
		*/


		// Part #2
		// What if we wanted to create something like this:
		// Compressed + Properties
		// ... but we want to avoid duplicate code!
		/*
		PropertiesSerializer sps = new PropertiesSerializer(new Compressor());
		sps.generateFile("new_command.zip", command);
		*/


		// Part #3
		// What if we want to use multiple post processors?
		/*
		PostProcessor combinedPostProcessor = new CompositePostProcessor(new Encriptor((byte)5), new Compressor());
		PropertiesSerializer sps = new PropertiesSerializer(combinedPostProcessor);
		sps.generateFile("new_command.zip", command);
		*/


		// Part #4
		// What if we want to introduce a new Command?
		// But we do not want to implement the PropertiesGetter class.
		PropertiesSerializer sps = new PropertiesSerializer(new Compressor());
		sps.generateFile("reflectioncommand.zip", command);
	}

}
