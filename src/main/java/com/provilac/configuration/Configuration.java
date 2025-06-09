package com.provilac.configuration;

import java.io.IOException;

import com.provilac.utilities.PropUtil;

public class Configuration {
	
	PropUtil prop= new PropUtil();
	
	public String getBrowserName() throws IOException {
		 return prop.readingPropertiesFile("/src/main/resources/confiq.properties","browser");
		
	}

	public String getUrl() throws IOException {
		return prop.readingPropertiesFile("/src/main/resources/confiq.properties","url");
	}
}
