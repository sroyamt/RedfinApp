package com.qa.redfinapp.stepDefinitions;

import org.junit.Assert;

import com.qa.redfinapp.cucumber.TestContext;
import com.qa.redfinapp.pageObjects.HomePage;
import com.qa.redfinapp.pageObjects.SearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchPageTests {

	TestContext testContext;
	SearchPage search;
	HomePage home;

	public SearchPageTests(TestContext context) {
		testContext = context;
		home = testContext.getPageObjectManager().getHomePage();
		search = testContext.getPageObjectManager().getSearchPage();
	}

	@Given("^User is on the Home page$")
	public void user_is_on_the_Home_page() {
		home.getUrl();
	}

	@When("^user enters \"([^\"]*)\" into the search field$")
	public void user_enters_cityname_into_the_search_field(String cityName) {
		home.enterCityName(cityName);
	}

	@When("^clicks the Search icon$")
	public void clicks_the_Search_icon() {
	    home.clickSearch();
	}

	@When("^clicks the More filters button$")
	public void clicks_the_More_filters_button() {
		search.clickMoreFiltersBtn();
	}
	
	@When("^selects Exclude Short Sales checkbox$")
	public void selects_Exclude_Short_Sales_checkbox() {
	    search.clickExcludeShortSalesCb();
	}

	@When("^selects Redfin Listings Only checkbox$")
	public void selects_Redfin_Listings_Only_checkbox() {
		search.clickRedfinListingsOnlyCb();
	}

	@When("^selects Fixer-Uppers Only checkbox$")
	public void selects_Fixer_Uppers_Only_checkbox() {
		search.clickFixerUppersOnlyCb();
	}

	@When("^clicks Apply Filters$")
	public void clicks_Apply_Filters() {
	    search.clickApplyFiltersBtn();
	}

	@When("^selects the Table button$")
	public void selects_the_Table_button() {
	    search.clickTableBtn();
	}

	@Then("^the property with the selected filters should be displayed$")
	public void the_property_with_the_selected_filters_should_be_displayed() {
		String add = search.getPropertyAddress();
		Assert.assertEquals("Address is incorrect", "826 E 57 St", add);
		System.out.println("Testing Passed" + "\n" + "Expected Result: 826 E 57 St" + "\n" + "Actual Result: " + add);
	}

}
