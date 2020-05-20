package com.example.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ObjectToJson {

	private static ObjectMapper mapper = new ObjectMapper();

	static {
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
	}

	public static String convertToJson(Object o) {
		String json = null;
		try {
			json = mapper.writeValueAsString(o);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return json;
	}
}
