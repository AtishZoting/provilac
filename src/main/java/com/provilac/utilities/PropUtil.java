package com.provilac.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	
	public String readingPropertiesFile(String filepath, String key) throws IOException {
		String baseDir=System.getProperty("user.dir");
		FileInputStream fis=  new FileInputStream(baseDir+ filepath) ;
		
		Properties prop= new Properties();
		prop.load(fis);
		return prop.getProperty(key);
			
		
	}

}
