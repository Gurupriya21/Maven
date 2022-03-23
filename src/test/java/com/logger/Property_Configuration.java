package com.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_Configuration {
	
	//Factory Design Pattern
	
	static Logger log = Logger.getLogger(Property_Configuration.class);
	public static void main(String[] args) {
		
	//Configuration
		
		PropertyConfigurator.configure("log4j.properties");
		log.debug("Debug");
		log.info("Information");
		log.warn("Warning");
		log.error("Error");
		log.fatal("Fatal");
	}

}
