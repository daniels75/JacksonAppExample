package org.daniels.examples.serializer;

import java.io.IOException;

import org.daniels.examples.model.User;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
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
	        
	        generator.writeEndObject();
		
	}

}
