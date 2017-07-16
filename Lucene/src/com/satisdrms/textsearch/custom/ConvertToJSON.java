package com.satisdrms.textsearch.custom;

public class ConvertToJSON {
	private static ConvertToJSON instance = null;

	private ConvertToJSON() {
		// Dummy constructor with access modifier as private for singleton design
	}

	public static ConvertToJSON getInstance() {
		if (instance == null)
			instance = new ConvertToJSON();
		return instance;
	}

	public String convert(TLocations found) {
		
		return null;
	}
}
