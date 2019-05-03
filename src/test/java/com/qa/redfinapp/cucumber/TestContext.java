package com.qa.redfinapp.cucumber;

import org.openqa.selenium.WebDriver;

import com.qa.redfinapp.managers.PageObjectManager;
import com.qa.redfinapp.managers.WebDriverManager;

public class TestContext {
	
	WebDriver driver;
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	
	public TestContext() {
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	
	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}

}
