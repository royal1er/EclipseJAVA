package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;

public class AnalyticsCounter {
	static SymptomRegistration data = new SymptomRegistration();
	static ReadSymptomDataFromFile mydata = new ReadSymptomDataFromFile();
	static GenerateFile outputFile = new GenerateFile();
	
	public static void main(String args[]) throws Exception {

		System.out.println(data.generateOutput(mydata.GetSymptomData("symptoms.txt")));
		outputFile.getFileOutput(data.generateOutput(mydata.GetSymptomData("symptoms.txt")), "results.out");		
		
	}
	

}
