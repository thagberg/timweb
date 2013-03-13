package com.timhagberg.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import com.timhagberg.misc.CharacterFilter;

public class TextFileAboutDAO implements AboutDAO {

	private String textFileLocation;
	
	public String getTextFileLocation() {
		return textFileLocation;
	}

	public void setTextFileLocation(String textFileLocation) {
		this.textFileLocation = textFileLocation;
	}

	@Override
	public String getAboutText() {
		
		StringBuilder sb = new StringBuilder();
		String aboutText, line;
		
		try {
			URL location = getClass().getClassLoader().getResource(textFileLocation);
			BufferedReader in = new BufferedReader(new InputStreamReader(location.openStream()));
			
			while ((line = in.readLine()) != null) {
				sb.append(line + "\n");
			}
			
			aboutText = sb.toString();
			
		} catch (FileNotFoundException e) {
			// TODO: add logging
			System.out.println("About: File Not Found");
			e.printStackTrace();
			aboutText = "";
		} catch (IOException e) {
			// TODO: add logging
			System.out.println("About: IO Problem");
			e.printStackTrace();
			aboutText = "";
		}
		
		aboutText = CharacterFilter.filterOutput(aboutText);
		
		return aboutText;
	}
	
}
