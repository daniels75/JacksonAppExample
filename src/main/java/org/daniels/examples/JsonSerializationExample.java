package org.daniels.examples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.daniels.examples.model.User;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializationExample {
	 
    public static void main(String args[]) {
    	
        User user = new User();
        user.setName("daniels");
        user.setAge(21);
        user.setHeight(5.6);
        user.setMarried(Boolean.TRUE);
        
        System.out.println("User: " + user);
 
        try {
            // ObjectMapper provides functionality for data binding between
            // Java Bean Objects/POJO and JSON constructs/string
            ObjectMapper mapper = new ObjectMapper();
    
            // serialize userList to JSON format and write to file
            String jsonString = mapper.writeValueAsString(user);
 
            System.out.println("JSON string: " + jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}