package com.mahait.strings;

import java.io.IOException;
import java.net.URL;

public class WDSDLTesting {

	public static void main(String[] args) {
		
		try {
		      @SuppressWarnings("deprecation")
			/* String wsdl = org.apache.commons.io.IOUtils.toString(new 
					URL("http://panchayatrajsevarth.maharashtra.gov.in/services/CMPIntegrationService.CMPIntegrationServiceHttpsSoap11Endpoint/"));
		      System.out.println("WSDL => "+wsdl); 
		      */
		     /*String wsdl = org.apache.commons.io.IOUtils.toString(new 
						URL("http://localhost:8080/dcps/services/CMPIntegrationService.CMPIntegrationServiceHttpsSoap11Endpoint/"));
		     
		      System.out.println("WSDL => "+wsdl); */
		      
		    /*  String wsdl2 = org.apache.commons.io.IOUtils.toString(new 
		    		  URL("http://samajsevaarth.maharashtra.gov.in/services/CMPIntegrationService.CMPIntegrationServiceHttpsSoap11Endpoint/"));
		      System.out.println("WSDL => "+wsdl2);*/
		      
		      /* String wsdl3 = org.apache.commons.io.IOUtils.toString(new 
		    		  URL("http://sausevarth.maharashtra.gov.in/services/CMPIntegrationService.CMPIntegrationServiceHttpsSoap11Endpoint/"));*/
		     /* String wsdl3 = org.apache.commons.io.IOUtils.toString(new 
		    		  URL("http://103.23.150.204/services/CMPIntegrationService.CMPIntegrationServiceHttpsSoap11Endpoint/"));
		      System.out.println("WSDL => "+wsdl3);*/ 
		      
		      String wsdl4 = org.apache.commons.io.IOUtils.toString(new 
		    		  URL("http://mafsuarth.maharashtra.gov.in/services/CMPIntegrationService.CMPIntegrationServiceHttpsSoap11Endpoint/"));
		      System.out.println("WSDL => "+wsdl4); 
		      
		      /*Sevvarth URL*/
		     /* String wsdl1 = org.apache.commons.io.IOUtils.toString(new 
		    		  URL("http://sevaarth.mahakosh.gov.in/services/CMPIntegrationService.CMPIntegrationServiceHttpsSoap11Endpoint/"));
		      
		      System.out.println("WSDL => "+wsdl1);*/
		      
		       /*String wsdl1 = org.apache.commons.io.IOUtils.toString(new 
    		  URL("http://ashramshalarth.maharashtra.gov.in/services/CMPIntegrationService.CMPIntegrationServiceHttpsSoap11Endpoint/"));
      System.out.println("WSDL => "+wsdl1); */
		  } catch (IOException e) {
		         e.printStackTrace();
		  }
	}
	

}


