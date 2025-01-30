package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import browsers.Navegador;
import pages.HomePage;


@SuppressWarnings("static-access")
public class LoginFeature extends HomePage {

	Navegador chrome = new Navegador();

	
	@BeforeEach
	public void OpenBrowser() {
		chrome.openChrome();

	}

	@AfterEach
	public void fechatnavegador() {
		chrome.fecharNavegador();

	}

	//@Test
	public void login() {

	Home_login();

	}

}
