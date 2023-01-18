package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class Headerssection {
	
	
	public Headerssection() {
		
		
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(xpath="//span[text()='My Account']")
	public static WebElement myAccountLink;
	
	
	@FindBy(xpath="//a[text()='Register']")
	public static WebElement Register;
	
	
	@FindBy(xpath="//a[text()='Login']")
	public static WebElement Login;
	
	@FindBy(name="search")
	public static WebElement SearchBox;
	
	@FindBy(css="button[class$='btn-lg']")
	public static WebElement SearchButton;
	
	
	@FindBy(linkText="Shopping Cart")
	public static WebElement ShoppingCart;
	
	public static void navigateToLoginPage() {
		
		Elements.click(Headerssection.myAccountLink);
		Elements.click(Headerssection.Login);
		
	}
	
	public static void searchProduct() {
		
		Elements.TypeText(Headerssection.SearchBox, Base.reader.getProduct());
		Elements.click(Headerssection.SearchButton);			
	}
	
	public static void navigateToShoppingCart() {
		
		Elements.click(Headerssection.ShoppingCart);
		
	}
}
