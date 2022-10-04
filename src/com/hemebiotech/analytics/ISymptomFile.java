package com.hemebiotech.analytics;

import java.util.TreeMap;

public interface ISymptomFile {
	
	/**
     * Generates the file from a map
     * @throws IOException
     */
	public void getFileOutput(TreeMap<String, Integer> tmap, String nameFile); 

}
