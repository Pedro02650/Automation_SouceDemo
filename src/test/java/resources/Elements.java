package resources;

import org.openqa.selenium.By;

public class Elements extends URLs {

	protected static By fieldLoginUsername = By.xpath("//input[@id='user-name']");
	protected static By fieldFirstName = By.xpath("//input[@id='first-name']");
	protected static By fieldLastName = By.id("last-name");
	protected static By fieldPostalCode = By.id("postal-code");
	protected static By fieldLoginPassword = By.id("password");
	protected static By fieldErrorMessage = By.xpath("//h3[@data-test='error']");
	protected static By btnLogin = By.xpath("//input[@id='login-button']");
	protected static By btnContinue = By.id("continue");
	protected static By btnCancel = By.xpath("cancel");
	protected static By btnAddToCart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	protected static By btnCheckout = By.xpath("//button[@class='btn btn_action btn_medium checkout_button ']");
	protected static By btnFinalizePurchase = By.id("finish");
	protected static By btnCheckout_Cancel = By.xpath("//button[@id='cancel']");
	protected static By btnCheckoutCancel = By.xpath("//button[@id='cancel']");
	protected static By btnCart = By.xpath("//a[@class='shopping_cart_link']");

	protected static By msgAccomplishedPurchase = By.xpath("//h2[text()='Thank you for your order!']");
	protected static By btnContinueShopping = By.xpath("//button[@id='continue-shopping']");
	protected static By divShoppingInformation = By.xpath("//div[@data-test='shipping-info-label']");
	protected static By imgBackPack = By.xpath("//img[@data-test='inventory-item-sauce-labs-backpack-img']");

}
