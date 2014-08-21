package org.daniels.examples.serializer;

import java.io.IOException;

import org.codehaus.jettison.json.JSONObject;
import org.daniels.examples.model.Limit;
import org.daniels.examples.model.User;
import org.daniels.examples.model.User2;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;


public class UserSerializer extends JsonSerializer<User>{

	@Override
	public void serialize(User value, JsonGenerator generator,
			SerializerProvider provider) throws IOException,
			JsonProcessingException {

			generator.writeStartObject();
			
		    generator.writeFieldName("name");
	        generator.writeString(value.getName());
	        generator.writeStringField("anotherName", value.getName());
	        
	        generator.writeFieldName("data");
	        ObjectMapper mapper = new ObjectMapper();
            String jsonString = "{\"id\":123,\"value\":0.0,\"currency\":\"PLN\",\"limit\":{\"value\":11.22,\"isDirectionUp\":true}}";
            Limit limit = mapper.readValue(jsonString, Limit.class);
            generator.writeObject(limit);
            
            
            JSONObject obj = new JSONObject();
            
            
            
	        generator.writeEndObject();
	        
	       
		
	}

}
