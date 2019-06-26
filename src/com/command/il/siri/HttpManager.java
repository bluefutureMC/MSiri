package com.command.il.siri;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class HttpManager {
	
	private static final String[] INTERNAL_IP_DEFINERS = {"10.", "192.168.", "127.", "169.254."};
	
	public static String getTimeByIP(String ip) {
		
		String dateTime;
		
		if( isInternal(ip) ) dateTime = sendRequest("http://worldtimeapi.org/api/ip/", "datetime");
		else dateTime = sendRequest("http://worldtimeapi.org/api/ip/" + ip, "datetime");
		
		if( dateTime != null ) {
			
			String time = dateTime.split("T")[1];
			String[] parts = time.split(":");
			
			return parts[0] + ":" + parts[1];
			
		} else return null;
		
	}
	
	private static boolean isInternal(String ip) {
		
		for( int i = 0 ; i<INTERNAL_IP_DEFINERS.length ; i++ ) {
			
			if( ip.startsWith(INTERNAL_IP_DEFINERS[i]) ) {
				return true;
			}
			
		}
		
		return false;
		
	}
	
	private static String sendRequest( String urlHttp, String arg ) {
		
		JSONParser jp = new JSONParser();
		
		BufferedReader reader;
		String line;
		StringBuffer responseContent = new StringBuffer();
		
		try {
			
			URL url = new URL(urlHttp);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			
			//Request setup
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);
			
			int status = connection.getResponseCode();
			
			if(status > 299) {
				
				System.out.println("HTTP ERROR");
				
				reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
				while( (line = reader.readLine()) != null ) {
					responseContent.append(line);
				}
				reader.close();
				
			} else {
				
				System.out.println("HTTP OK");
				
				reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				while( (line = reader.readLine()) != null ) {
					responseContent.append(line);
				}
				reader.close();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Response: " + responseContent.toString());
		
		JSONObject response = null;
		
		try {
			response = (JSONObject) jp.parse(responseContent.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		if( response == null ) return null;
		
		return (String) response.get(arg);
		
	}
	
}
