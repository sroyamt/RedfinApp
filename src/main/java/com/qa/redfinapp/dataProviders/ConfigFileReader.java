package com.qa.redfinapp.dataProviders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

import com.qa.redfinapp.enums.DriverType;

public class ConfigFileReader {

	Properties prop;
	String configFilePath = ".\\config\\Config.properties";
	BufferedReader reader;
	
	public ConfigFileReader() {
		try {
			prop = new Properties();
			reader = new BufferedReader(new FileReader(configFilePath));
			prop.load(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getUrl() {
		String url = prop.getProperty("url");
		if(url!=null) return url;
		else throw new RuntimeException("Url not specified in the config file");
	}
	
	public String getChromeDriverPath() {
		String driverPath = prop.getProperty("chromeDriverPath");
		if(driverPath!=null) return driverPath;
		else throw new RuntimeException("chromeDriverPath not specified in the config file");
	}
	
	public String getFirefoxDriverPath() {
		String driverPath = prop.getProperty("firefoxDriverPath");
		if(driverPath!=null) return driverPath;
		else throw new RuntimeException("firefoxDriverPath not specified in the config file");
	}
	
	public DriverType getBrowser() {
		String browser = prop.getProperty("browser");
		if((browser == null) || browser.equalsIgnoreCase("chrome"))
			return DriverType.CHROME;
		else if(browser.equalsIgnoreCase("firefox"))
			return DriverType.FIREFOX;
		else throw new RuntimeException("Browser property is not set");
	}
	
}
