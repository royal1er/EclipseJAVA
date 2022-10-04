package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */
public interface ISymptomReader{
	
	/**
	 * The method used for get symptoms with the duplicates it return a List 
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 * @return a listing of Symptoms obtained from an List, with the duplicates 
	 */
	public ArrayList<String> GetSymptomData (String filepath);
	
}

