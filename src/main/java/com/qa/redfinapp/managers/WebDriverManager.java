package com.qa.redfinapp.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.redfinapp.enums.DriverType;

public class WebDriverManager {
	
	WebDriver driver;
	DriverType driverType;
	private String CHROMEDRIVER_PROPERTIES = "webdriver.chrome.driver";
	private String FIREFOXDRIVER_PROPERTIES = "webdriver.gecko.driver";
	
	public WebDriverManager() {
		driverType = FileReaderManager.getInstance().getConfigFileRdr().getBrowser();
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public WebDriver getDriver() {
		if(driverType == DriverType.CHROME) {
			System.setProperty(CHROMEDRIVER_PROPERTIES, FileReaderManager.getInstance().getConfigFileRdr().getChromeDriverPath());
			driver = new ChromeDriver();
		}
		else if(driverType == DriverType.FIREFOX) {
			System.setProperty(FIREFOXDRIVER_PROPERTIES, FileReaderManager.getInstance().getConfigFileRdr().getFirefoxDriverPath());
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public void quitDriver() {
		driver.quit();
	}

}
