package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;
import com.tutorialsninja.automation.pages.AIvaluationpage;
import com.tutorialsninja.automation.pages.HeaderSection;

import cucumber.api.java.en.*;

public class AIvaluation {
	
	HeaderSection headersSection = new HeaderSection();
	AIvaluationpage aivaluationpage = new AIvaluationpage();
	
	@Given("^I launch the application$")
	public void i_launch_the_application()  {
		
		Base.driver.get(Base.reader.getUrl());
	   
	}

	@And("^I go to AI valuation page$")
	public void i_go_to_AI_valuation_page() {
	    Base.driver.get("https://dev.deals.houzenx.co.uk/ai-valuation");
	}

	@When("^I provide Zoopla link for valuation$")
	public void i_provide_Zoopla_link_for_valuation() {
	    AIvaluationpage.evaluateZooplaLink();
	}

	@Then("^I should get AI valuation for the property$")
	public void i_should_get_AI_valuation_for_the_property() {
	    Assert.assertTrue(Waits.isPageLoaded());
	}

	
}
