package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;
import com.tutorialsninja.automation.pages.CheckoutPage;
import com.tutorialsninja.automation.pages.Headerssection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.OrderSuccessPage;
import com.tutorialsninja.automation.pages.SearchResultsPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Orders {
	Headerssection headerssection = new Headerssection();
	LoginPage loginpage = new LoginPage();
	SearchResultsPage searchresultspage = new SearchResultsPage();
	ShoppingCartPage shoppingcartpage = new ShoppingCartPage();
	CheckoutPage checkoutpage = new CheckoutPage();
	OrderSuccessPage ordersuccesspage = new OrderSuccessPage();
	
	@Given("^I login to the application$")
	public void i_login_to_the_application(){
		
		Browser.openApplicationURL();
		Headerssection.navigateToLoginPage();
	    LoginPage.doLogin();
	}
	

	@When("^I add a product to bag and check$")
	public void i_add_a_product_to_bag_and_check() {
	    Headerssection.searchProduct();
	    SearchResultsPage.addFirstProductToCart();
	    Headerssection.navigateToShoppingCart();
	    ShoppingCartPage.navigateToCheckoutPage();
	    
	}

	@And("^I place an order$")
	public void i_place_an_order() {
		
	  CheckoutPage.placeOrder();
	    
		
	}

	@Then("^I should see that the order is successfully placed$")
	public void i_should_see_that_the_order_is_successfully_placed() throws InterruptedException {
	    
		Thread.sleep(10000);
		Assert.assertTrue(Elements.isDisplayed(OrderSuccessPage.success));
		
	    
	}


	
	

}
