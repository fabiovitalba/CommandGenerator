package org.sattelite.command;

public class Main {
	
	public static void main(String[] args){
		TurnCommand command = new TurnCommand("SLOW", 180, 60, 45); 

		// What if we wanted to create something like this:
		// Compressed + Properties
		// ... but we want to avoid duplicate code!

		CompressedXMLSerializer cxs = new CompressedXMLSerializer();
		cxs.generateFile("command.zip", command);
		
		CryptoPropertiesSerializer sps = new CryptoPropertiesSerializer(5);
		sps.generateFile("command.txt", command);
		
	}

}
