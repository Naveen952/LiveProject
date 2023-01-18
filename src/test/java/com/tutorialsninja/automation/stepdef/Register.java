package com.tutorialsninja.automation.stepdef;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.Headerssection;
import com.tutorialsninja.automation.pages.RegisterPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Register {
	
	Headerssection headerSection = new Headerssection();
	RegisterPage registerPage = new RegisterPage();
	AccountSuccessPage accountSuccessPage = new AccountSuccessPage();
	
	@Given("^I launch the application$")
	public void i_launch_the_application() throws Throwable {
		
		Base.driver.get(Base.reader.getUrl());
	   
	}

	@Given("^I navigate to account register page$")
	public void i_navigate_to_account_register_page() throws Throwable {
		
		Elements.click(Headerssection.myAccountLink);
	    Elements.click(Headerssection.Register);
	}

	@When("^I provide all the below details$")
	public void i_provide_all_the_below_details(DataTable dataTable) throws Throwable {
	    
	RegisterPage.EnterAllDetails(dataTable,"unique");
		
	}

	@When("^I select the privacy policy$")
	public void i_select_the_privacy_policy() throws Throwable {
		
		Elements.click(RegisterPage.privacyPolicy);
		   
	}

	@When("^I click on continue button$")
	public void i_click_on_continue_button() throws Throwable {
			Elements.click(RegisterPage.continueButton);
	    }

	@Then("^I should see the user account has successfully created$")
	public void i_should_see_the_user_account_has_successfully_created() throws Throwable {
		
		Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.SuccessMessage));
		
	}


	@Then("^I should not see the user account is not created$")
	public void i_should_not_see_the_user_account_is_not_created() {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.register));
	    
	}

	@And("^I should see the error messages informing the user to fill the mandatory fields$")
	public void i_should_see_the_error_messages_informing_the_user_to_fill_the_mandatory_fields() {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.firstNameWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.lastNameWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.emailWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.passwordWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.telephoneWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.mainWarning));
	    
	}

	@And("^I subscribe to news letter$")
	public void i_subscribe_to_news_letter() {
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.yesToNewsLetter));	   
	}
	
	@When("^I provide the duplicate details$")
	public void i_provide_the_duplicate_details(DataTable dataTable) {
	    
		RegisterPage.EnterAllDetails(dataTable,"duplicate");
			
	}
	
	@Then("^I should see the user is restricted from creating duplicate account$")
	public void i_should_see_the_user_is_restricted_from_creating_duplicate_account() {
		
		Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.mainWarning, "Warning E-mail Address is already registered!"));
	  
	}
	
}
