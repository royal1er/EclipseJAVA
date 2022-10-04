package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;

	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 * @return The List with the symptoms 
	 */
	public ArrayList<String> GetSymptomData (String filepath) {
		ArrayList<String> List = new ArrayList<String>();
		if(filepath != null) {
			try {
				BufferedReader  reader = new BufferedReader (new FileReader(filepath));
				String line = null;
				while ((line = reader.readLine()) != null) {
					System.out.println("symptom from file: " + line);
					List.add(line);
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return List;
	}

}
