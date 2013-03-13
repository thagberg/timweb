package com.timhagberg.misc;

public class CharacterFilter {

	private static String INPUT_FILTER = "[^a-zA-Z0-9]";
	private static String OUTPUT_FILTER = System.getProperty("line.separator");
	
	public static String filterInput(String toBeFiltered) {
		
		toBeFiltered.replaceAll(INPUT_FILTER, "");
		
		return toBeFiltered;
	}
	
	public static String filterOutput(String toBeFiltered) {
		
		toBeFiltered = toBeFiltered.replaceAll(OUTPUT_FILTER, "<br/>");
		
		return toBeFiltered;
	}
}
