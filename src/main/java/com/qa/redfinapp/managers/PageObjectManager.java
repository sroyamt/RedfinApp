package com.qa.redfinapp.managers;

import org.openqa.selenium.WebDriver;

import com.qa.redfinapp.pageObjects.HomePage;
import com.qa.redfinapp.pageObjects.SearchPage;

public class PageObjectManager {
	
	WebDriver driver;
	SearchPage search;
	HomePage home;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public SearchPage getSearchPage() {
		return (search==null) ? new SearchPage(driver) : search;
	}
	
	public HomePage getHomePage() {
		return (home==null) ? new HomePage(driver) : home;
	}

}
