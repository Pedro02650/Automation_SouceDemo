package pages;

import browsers.Navegador;
import metodos.Metodos;

public class HomePage extends Metodos{
	
	
	public Navegador navegador = new Navegador();
	
	public void Home_login() {
		
		escrever(Field_Login_username, "standard_user");
		escrever(Field_Login_password, "secret_sauce");
		clicar(BTN_Login);
		
	}
	
	
	

}
