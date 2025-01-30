package pages;

import metodos.Metodos;

public class Page_introduction_step4 extends Metodos {

	public void dadosStep4() {

		escrever(Field_firstName, "Pedro");
		escrever(Field_lastName, "Cisne");
		escrever(Field_PostalCode, "37136012");

	}

	public void clicarContinuar() {
		scrollthrough(BTN_Continue);
		clicar(BTN_Continue);
	}

}
