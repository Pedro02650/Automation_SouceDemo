package test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.Methods;
import pages.HomePage;
import pages.PageIntroductionStep4;

public class PurchaseFeature extends HomePage {

	PageIntroductionStep4 introducaoDeDados = new PageIntroductionStep4();

	@Before
	public void OpenBrowser() {
		navegador.openChrome();
		homeLogin();

	}

	@After
	public void closeBrowser() {

	}

	@Given("que estou na página logado do Saucedemo")
	public void que_estou_na_página_logado_do_saucedemo() {
		Methods.CurrentURL(LoggedPage);

	}

	@When("Clico no botao adicionar ao carrinho")
	public void clico_no_botao_adicionar_ao_carrinho() {
		Methods.click(btnAddToCart);

	}

	@And("clico no botão Carrinho")
	public void clico_no_botão_carrinho() {
		try {
			System.out.println(" ##### Clicando no botao CARRINHO... ##### ");

			click(btnCart);
		} catch (Exception e) {
			System.err.println("Erro encontrado foi: " + e.getCause());
		}
	}

	@And("devo ser direcionado ao meu carrinho")
	public void devo_ser_direcionado_ao_meu_carrinho() {
		try {
			System.out.println(" ##### verificando URL... ##### ");
			CurrentURL(YourCart);

		} catch (Exception e) {
			System.err.println("Erro encontrado foi: " + e.getCause());
		}
	}

	@And("clico no botao (Checkout)")
	public void clico_no_botao_checkout() {
		try {
			System.out.println(" ##### Clicando no botao CHECKOUT... ##### ");
			Methods.scrollthrough(btnCheckout);
			Methods.click(btnCheckout);
		} catch (Exception e) {
			throw new io.cucumber.java.PendingException();
		}

	}

	@And("sou direcionado a colocar meus dados, nome, sobrenome, cep.")
	public void sou_direcionado_a_colocar_meus_dados_nome_sobrenome_cep() {
		try {
			System.out.println(" ##### Introduzindo nome, sobrenome e cep... ##### ");
			introducaoDeDados.dadosStep4();
			System.out.println(" ##### Clicando no botao continuar... ##### ");
			introducaoDeDados.clicarContinuar();
		} catch (Exception e) {
			throw new io.cucumber.java.PendingException();
		}

	}

	@And("recebo as informacoes do meu pedido")
	public void recebo_as_informacoes_do_meu_pedido() {
		try {
			System.out.println(" ##### Verificando url... ##### ");
			CurrentURL(PurcheseInformation);
			System.out.println(" ##### Clicando no botao finalizar compra ##### ");
			click(btnFinalizePurchase);

		} catch (Exception e) {
			throw new io.cucumber.java.PendingException();

		}

	}

	@Then("clico em finalizar e sou direcionado para pagina de compra feita")
	public void clico_em_finalizar_e_sou_direcionado_para_pagina_de_compra_feita() {
		try {
			ValidElement(msgAccomplishedPurchase, "Thank you for your order!");
			System.out.println("################# teste feito com sucesso ################");
		} catch (Exception e) {
			throw new io.cucumber.java.PendingException();
		}

	}

}
