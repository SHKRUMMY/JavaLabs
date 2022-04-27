package com.lviv.iot.lab2.models;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Writer {
	
	public void writeToFile(List<Securities> securities, String fileName){
	File file = new File(fileName + ".csv");
	
	
	try {
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		writer.write(securities.get(0).getHeaders() + "\n");
		for (Securities security : securities) {
			writer.write(security.toCSV() + "\n");
			
		}
		writer.close();
		
	}
	catch(IOException e){
		e.printStackTrace();
	}
	}
}
