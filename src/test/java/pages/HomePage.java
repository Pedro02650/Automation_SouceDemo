package pages;

import browsers.Chrome;
import methods.Methods;

public class HomePage extends Methods {

	public Chrome navegador = new Chrome();

	public void homeLogin() {

		write(fieldLoginUsername, "standard_user");
		write(fieldLoginPassword, "secret_sauce");
		click(btnLogin);
		write(fieldLoginUsername, "standard_user");
		write(fieldLoginPassword, "secret_sauce");
		click(btnLogin);

	} 

}