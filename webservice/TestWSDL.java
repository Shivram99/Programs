package com.mahait.webservice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class TestWSDL {
	public static void main(String args[]) {
		//String urlStr = "http://www.example.com:8080/helloService?wsdl";
		String urlStr = "https://panchayatrajsevarth.maharashtra.gov.in/services/CMPIntegrationService?wsdl";
		//String urlStr = "https://ayurvedarth.maharashtra.gov.in/services/CMPIntegrationService?wsdl";
		//String urlStr = "https://sevaarth.mahakosh.gov.in/services/CMPIntegrationService?wsdl";
		
		/*Beams Testing Url*/
		//String urlStr = "https://panchayatrajsevarth.maharashtra.gov.in/services/BEAMSIntegrationService?wsdl";
		URL url = null;
		URLConnection urlConnection = null;
		try {
			url = new URL(urlStr);
			urlConnection = url.openConnection();
		
			if(urlConnection.getContent() != null) {
				System.out.println("GOOD URL");
			} else {
				System.out.println("BAD URL");
			}
		} catch (MalformedURLException ex) {
			System.out.println("bad URL");
		} catch (IOException ex) {
			System.out.println("Error is : "+ex);
			System.out.println("Failed opening connection. Perhaps WS is not up?");
		} 
	}

}
