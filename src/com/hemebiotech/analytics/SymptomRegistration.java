package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class SymptomRegistration implements ISymptomAnalysis{
	
	/**
	 * Determines the number of occurrences obtained from a list
	 * 
	 * @param list a collection list with all the symptoms data stored
	 * @return return a TreeMap
	 */
	public TreeMap<String, Integer> generateOutput(ArrayList<String> list){
		TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
		try {
				for (String symptoms : list) {
					Integer n = tmap.get(symptoms);
		            if (n == null) {
		            	tmap.put((String) symptoms, 1);
		            }
		            else {
		              tmap.put((String) symptoms, ++n);
		            }
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return tmap;
	}

}
