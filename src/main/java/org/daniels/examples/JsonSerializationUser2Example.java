package org.daniels.examples;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.daniels.examples.model.User2;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializationUser2Example {
	private static final transient Log logger = LogFactory.getLog(JsonSerializationUser2Example.class);
	
    public static void main(String args[]) {
    	
        User2 user = new User2();
        user.setName("daniels");
        user.setAge(21);
        user.setHeight(5.6);
        user.setMarried(Boolean.TRUE);
        
        System.out.println("User: " + user);
 
        try {
            ObjectMapper mapper = new ObjectMapper();
            
    
            String jsonString = mapper.writeValueAsString(user);
 
            logger.info("JSON string: " + jsonString);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}