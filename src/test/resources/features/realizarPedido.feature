
Feature: Realizar pedido

	How usuario
	Want efetuar cadastro
	To ter acessoa as funcinalidades do site
	

  Scenario: Realizar pedido
    Given que estou na página logado do Saucedemo
    When Clico no botao adicionar ao carrinho 
    And clico no botão Carrinho
    And devo ser direcionado ao meu carrinho
    And clico no botao Checkout
    And sou direcinado a colcaor meus dados, nome, sobrenome, cep.
    And recebo as informacoes do meu pedido
    Then clico em finalizar e sou direcionado para pagina de compra feita

	
	
