package test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import pages.HomePage;
import pages.Page_introduction_step4;

public class PurcheseFeature extends HomePage {

	Page_introduction_step4 introducaoDeDados = new Page_introduction_step4();

	@Before
	public void OpenBrowser() {
		navegador.openChrome();
		Home_login();

	}

	@After
	public void closeBrowser() {

	}

	@Given("que estou na página logado do Saucedemo")
	public void que_estou_na_página_logado_do_saucedemo() {
		Metodos.CurrentURL(LoggedPage);

	}
	
	

	@When("Clico no botao adicionar ao carrinho")
	public void clico_no_botao_adicionar_ao_carrinho() {
		Metodos.clicar(BTN_AddToCart);

	}
	
	

	@And("clico no botão Carrinho")
	public void clico_no_botão_carrinho() {
		try {
			System.out.println(" ##### Clicando no botao CARRINHO... ##### ");
			clicar(BTN_Cart);
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
			Metodos.scrollthrough(BTN_Checkout);
			Metodos.clicar(BTN_Checkout);
		} catch (Exception e) {
			throw new io.cucumber.java.PendingException();
		}

	}
	
	

	@And("sou direcinado a colcaor meus dados, nome, sobrenome, cep.")
	public void sou_direcinado_a_colcaor_meus_dados_nome_sobrenome_cep() {
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
			clicar(BTN_FinalizePurchase);

		} catch (Exception e) {
			throw new io.cucumber.java.PendingException();

		}

	}
	
	

	@Then("clico em finalizar e sou direcionado para pagina de compra feita")
	public void clico_em_finalizar_e_sou_direcionado_para_pagina_de_compra_feita() {
		try {
			ValidElement(MSG_Accomplished_purchase, "Thank you for your order!");
			System.out.println("################# teste feito com sucesso ################");
		} catch (Exception e) {
			throw new io.cucumber.java.PendingException();
		}

	}

}
