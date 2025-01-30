package resources;

import org.openqa.selenium.By;

public class Elementos extends URLs {

	protected static By Field_Login_username = By.xpath("//input[@id='user-name']");
	protected static By Field_firstName = By.xpath("//input[@id='first-name']");
	protected static By Field_lastName = By.id("last-name");
	protected static By Field_PostalCode = By.id("postal-code");
	protected static By Field_Login_password = By.id("password");
	protected static By Field_ErrorMassage = By.xpath("//h3[@data-test='error']");
	
	
	protected static By BTN_Login = By.xpath("//input[@id='login-button']");
	protected static By BTN_Continue = By.id("continue");
	protected static By BTN_Cancel = By.xpath("cancel");
	protected static By BTN_AddToCart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	protected static By BTN_Checkout = By.xpath("//button[@class='btn btn_action btn_medium checkout_button ']");
	protected static By BTN_FinalizePurchase = By.id("finish");
	protected static By BTN_Checkout_Cancel = By.xpath("//button[@id='cancel']");
	protected static By BTN_Cart = By.xpath("//a[@class='shopping_cart_link']");
	
	
	protected static By MSG_Accomplished_purchase = By.xpath("//h2[text()='Thank you for your order!']");
	protected static By BTN_ContinueShopping = By.xpath("//button[@id='continue-shopping']");
	protected static By DIV_ShoppingInformation = By.xpath("//div[@data-test='shipping-info-label']");
	protected static By IMG_backpack = By.xpath("//img[@data-test='inventory-item-sauce-labs-backpack-img']");
	
	
}
