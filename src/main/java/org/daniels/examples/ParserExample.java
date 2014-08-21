package org.daniels.examples;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ParserExample {

	public static void main(String args[]) throws Exception {

		String jsonString = "{\"id\":123,\"value\":0.0,\"currency\":\"EUR\",\"limit\":{\"value\":11.22,\"isDirectionUp\":true}}";
		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject) parser.parse(jsonString);


		System.out.println(" obj: " + obj);

	}
}