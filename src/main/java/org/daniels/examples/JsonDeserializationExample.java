package org.daniels.examples;

import java.io.IOException;

import org.daniels.examples.model.User;

import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonDeserializationExample {
 
    public static void main(String args[]) {
 
        try {
            // ObjectMapper provides functionality for data binding between
            // Java Bean Objects/POJO and JSON constructs/string
            ObjectMapper mapper = new ObjectMapper();
 
            String jsonString = "{\"userName\":\"name\",\"userAge\":21,\"userHeight\":5.6,\"isUserMarried\":true}";
            System.out.println("JSON String: " + jsonString);
            
            // serialize userList to JSON format and write to file
            User user = mapper.readValue(jsonString, User.class);
 
            System.out.println("User: " + user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}