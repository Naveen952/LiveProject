package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {
	
	@Given("^I launch the application$")
	public void i_launch_the_application() throws Throwable {
		
		Base.driver.get(Base.reader.getUrl());
	   
	}

	@Given("^I navigate to account register page$")
	public void i_navigate_to_account_register_page() throws Throwable {
	    
	}

	@When("^I provide all the below details$")
	public void i_provide_all_the_below_details(DataTable arg1) throws Throwable {
	    
	}

	@When("^I select the privacy policy$")
	public void i_select_the_privacy_policy() throws Throwable {
	   
	}

	@When("^I click on continue button$")
	public void i_click_on_continue_button() throws Throwable {
	    
	}

	@Then("^I should see the user account has successfully created$")
	public void i_should_see_the_user_account_has_successfully_created() throws Throwable {
	   
	}


	
	
	
}
