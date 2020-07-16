package com.sunset.utils;

import java.io.BufferedReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HttpUtils {
	
	private String value;
	
	public HttpUtils() {
		
	}
	
	public <T> T  toModel(Class<T> tclass) {		
		try {
			return new ObjectMapper().readValue(value, tclass);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public static JSONObject toJSONObject(BufferedReader reader) {
		StringBuilder sb = new StringBuilder();
		try {
			String line;
		    while ((line = reader.readLine()) != null) {
		        sb.append(line);
		    }
		    System.out.print("respond from client: "+ sb.toString());
		    
		    JSONParser parser = new JSONParser(); 
		    JSONObject json = (JSONObject) parser.parse(sb.toString());

		    //System.out.print("\n chieu test: "+ json.get("title"));
		    //System.out.print("\n chieu test: "+ json.get("content"));
		    //System.out.print("\n chieu test: "+ json.get("categoryId"));
		    
		    return  json;
		} catch (IOException e) {
			System.out.print(e.getMessage());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
