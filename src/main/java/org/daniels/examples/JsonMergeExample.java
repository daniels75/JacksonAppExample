package org.daniels.examples;

import java.io.IOException;

import org.daniels.examples.model.User;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonMergeExample {
	 
    public static void main(String args[]) throws ParseException {
    	
        User user = new User();
        user.setName("daniels");
        user.setAge(21);
        user.setHeight(5.6);
        user.setMarried(Boolean.TRUE);
        
 
        try {

            ObjectMapper mapper = new ObjectMapper();
    
            // serialize userList to JSON format and write to file
            String jsonString = mapper.writeValueAsString(user);
 
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject)parser.parse(jsonString);
            obj.put("test", "myvalue");
            
            
            
            org.codehaus.jettison.json.JSONObject obj2 = new org.codehaus.jettison.json.JSONObject();
            
            
            System.out.println("JSON string: " + jsonString + " obj: " + obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}