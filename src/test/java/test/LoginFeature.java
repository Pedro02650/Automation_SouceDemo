package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import browsers.Chrome;
import pages.HomePage;

@SuppressWarnings("static-access")
public class LoginFeature extends HomePage {

	Chrome chrome = new Chrome();

	@BeforeEach
	public void OpenBrowser() {
		chrome.openChrome();

	}

	@AfterEach
	public void fechatnavegador() {
		chrome.fecharNavegador();

	}

	public void login() {

		Home_login();

	}

}
