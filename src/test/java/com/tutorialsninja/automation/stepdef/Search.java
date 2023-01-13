package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.Headerssection;
import com.tutorialsninja.automation.pages.SearchResultsPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Search {
	
	Headerssection headersection = new Headerssection();
	SearchResultsPage searchresultspage = new SearchResultsPage();
	
	@When("^I search for a product \"([^\"]*)\"$")
	public void i_search_for_a_product(String product)  {
	  
		Elements.TypeText(Headerssection.SearchBox,product);
		Elements.click(Headerssection.SearchButton);
		
	}

	@Then("^I should see the products in the search results$")
	public void i_should_see_the_products_in_the_search_results() {
		
		Assert.assertTrue(Elements.isDisplayed(SearchResultsPage.SamsungProduct));
	   
	}

	@Then("^I should see a message informing \"([^\"]*)\"$")
	public void i_should_see_a_message_informing(String message){
		
		Assert.assertTrue(Elements.VerifyTextEquals(SearchResultsPage.noResultsMessage, message));
	    
	}
	
	
	
	

}
