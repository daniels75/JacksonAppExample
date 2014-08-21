package org.daniels.examples;

import java.io.IOException;

import org.daniels.examples.model.User;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonMergeExampleTest {
	 
    public static void main(String args[]) throws Exception {
    	
        User user = new User();
        user.setName("daniels");
        user.setAge(21);
        user.setHeight(5.6);
        user.setMarried(Boolean.TRUE);
        
 
   
            ObjectMapper mapper = new ObjectMapper();
    
            // serialize userList to JSON format and write to file
            String jsonString1 = mapper.writeValueAsString(user);
            String jsonString2 = "{\"foo\":\"bar\",\"age\":21}";
            
            JSONParser parser = new JSONParser();
            JSONObject obj1 = (JSONObject)parser.parse(jsonString1);
            JSONObject obj2 = (JSONObject)parser.parse(jsonString2);
            // obj.put("test", "myvalue");
	    	
	    	JSONObject combined = new JSONObject();
	    	combined.put("Object1", obj1);
	    	combined.put("Object2", obj2);
	    	
	    	System.out.println(combined);
    }
}