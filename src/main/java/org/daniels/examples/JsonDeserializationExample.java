package org.daniels.examples;

import java.io.IOException;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.daniels.examples.model.User;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonDeserializationExample {
 
    public static void main(String args[]) throws JSONException, ParseException {
 
        try {
            // ObjectMapper provides functionality for data binding between
            // Java Bean Objects/POJO and JSON constructs/string
            ObjectMapper mapper = new ObjectMapper();
 
            String jsonString = "{\"userName\":\"name\",\"userAge\":21,\"userHeight\":5.6,\"isUserMarried\":true}";
            System.out.println("JSON String: " + jsonString);
            
//            JSONObject object = new JSONObject();
//            object.getJSONObject(jsonString);
            
//            JSONParser parser = new JSONParser();
//            parser.parse(jsonString);
            
            // serialize userList to JSON format and write to file
            User user = mapper.readValue(jsonString, User.class);
 
            System.out.println("User: " + user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}