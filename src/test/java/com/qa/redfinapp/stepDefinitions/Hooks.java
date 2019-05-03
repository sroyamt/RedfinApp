package com.qa.redfinapp.stepDefinitions;

import com.qa.redfinapp.cucumber.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;
	}

	@Before
	public void beforeScenario(Scenario scenario) {
		testContext.getWebDriverManager().maximizeWindow();
	}

	@After
	public void AfterSteps(Scenario scenario) {
		testContext.getWebDriverManager().quitDriver();
	}
}