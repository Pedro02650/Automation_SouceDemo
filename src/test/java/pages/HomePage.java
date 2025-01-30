package pages;

import browsers.Chrome;
import methods.Methods;

public class HomePage extends Methods {

	public Chrome navegador = new Chrome();

	public void homeLogin() {

		escrever(fieldLoginUsername, "standard_user");
		escrever(fieldLoginPassword, "secret_sauce");
		clicar(btnLogin);

	} 

}