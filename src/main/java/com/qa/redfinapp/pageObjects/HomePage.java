package com.qa.redfinapp.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.redfinapp.managers.FileReaderManager;
import com.qa.redfinapp.utilities.TestUtils;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@title='City, Address, School, Agent, ZIP']")
	WebElement tbSearch;
	
	@FindBy(xpath="//button[@title='Search' and @tabindex='0']")
	WebElement btnSearch;

	public void getUrl() {
		driver.get(FileReaderManager.getInstance().getConfigFileRdr().getUrl());
	}

	public void enterCityName(String cityName) {
		TestUtils.waitForElementToBeClickable(driver, tbSearch);
		tbSearch.clear();
		tbSearch.sendKeys(cityName);
	}

	public void clickSearch() {
		TestUtils.wait(driver, btnSearch);
		btnSearch.click();
	}

}
