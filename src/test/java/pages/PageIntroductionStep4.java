package pages;

import methods.Methods;

public class PageIntroductionStep4 extends Methods {

	public void dadosStep4() {

		write(fieldFirstName, "Pedro");
		write(fieldLastName, "Cisne");
		write(fieldPostalCode, "37136012");

	}

	public void clicarContinuar() {
		scrollthrough(btnContinue);
		click(btnContinue);

	}

}
