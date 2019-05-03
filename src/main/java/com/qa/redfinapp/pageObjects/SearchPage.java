package com.qa.redfinapp.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.redfinapp.utilities.TestUtils;

public class SearchPage {
	
WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='button Button wideSidepaneFilterButton v3 compact text']")
	WebElement btnMoreFilters;
	
	@FindBy(xpath="//div[@title='Exclude short sale listings.']")
	WebElement cbExcludeShortSales;
	
	@FindBy(xpath="//span[text()='Redfin Listings Only']")
	WebElement cbRedfinListingsOnly;
	
	@FindBy(xpath="//span[text()='Fixer-Uppers Only']")
	WebElement cbFixerUppersOnly;
	
	@FindBy(xpath="//span[text()='Apply Filters']")
	WebElement btnApplyFilters;
	
	@FindBy(xpath="//a[@class='address']")
	WebElement txtAddressOfProperty;
	
	@FindBy(xpath="//span[text()='Table']")
	WebElement table;

	public void clickMoreFiltersBtn() {
		TestUtils.wait(driver, btnMoreFilters);
		btnMoreFilters.click();
		
	}

	public void clickExcludeShortSalesCb() {
		TestUtils.waitForElementToBeClickable(driver, cbExcludeShortSales);
		TestUtils.scrollAndFindElement(driver, cbExcludeShortSales);
		cbExcludeShortSales.click();
	}

	public void clickRedfinListingsOnlyCb() {
		cbRedfinListingsOnly.click();
	}

	public void clickFixerUppersOnlyCb() {
		cbFixerUppersOnly.click();
	}

	public void clickApplyFiltersBtn() {
		btnApplyFilters.click();
	}

	public void clickTableBtn() {
		table.click();
	}

	public String getPropertyAddress() {
		TestUtils.wait(driver, txtAddressOfProperty);
		return txtAddressOfProperty.getText();
	}

}
