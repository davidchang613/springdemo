package com.dchang.shared;

import java.nio.charset.StandardCharsets;

import org.json.JSONException;
import org.json.JSONObject;

import com.dchang.exception.BadInputException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UtilFunction {

	// https://www.baeldung.com/java-string-encode-utf-8
	public static String sanitizedString(String input) {
		return new String(input.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
	}
	
	public static JSONObject stringToJSONObject(String jsonString) {
		if (jsonString.isEmpty())
			jsonString = "{}";
		try {
			return new JSONObject(jsonString);
		}
		catch(JSONException ex) {
			throw new BadInputException(ex.getMessage());
		}
	}
}
