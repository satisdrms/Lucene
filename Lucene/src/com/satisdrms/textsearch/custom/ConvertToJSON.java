package com.satisdrms.textsearch.custom;

import org.json.simple.JSONObject;

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

	@SuppressWarnings("unchecked")
	public String convert(TLocations found) {
		JSONObject obj = new JSONObject();
		
		
		System.out.println(obj.toJSONString());
		return null;
	}
}
