package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class GenerateFile implements ISymptomFile {
	
	/**
	 * The method used for create the file listing all the recurrences of the symptoms
	 * 
	 * @param tmap the TreeMap to keep the items in sorted order.
	 * @param namefile the came of the file that will be created
	 */

	@Override
	public void getFileOutput(TreeMap<String, Integer> tmap,String nameFile) {
		try {
			FileWriter writer = new FileWriter (nameFile);
			for (Map.Entry<String,Integer> m:tmap.entrySet()) {
        	writer.write("Frequency of " + m.getKey() + " is " + m.getValue()+"\n");
			}
			writer.close();
			}
		 catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}

