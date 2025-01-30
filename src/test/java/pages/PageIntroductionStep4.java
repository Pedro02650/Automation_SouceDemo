package pages;

import methods.Methods;

public class PageIntroductionStep4 extends Methods {

	public void dadosStep4() {

		escrever(fieldFirstName, "Pedro");
		escrever(fieldLastName, "Cisne");
		escrever(fieldPostalCode, "37136012");

	}

	public void clicarContinuar() {
		scrollthrough(btnContinue);
		clicar(btnContinue);
	}

}
