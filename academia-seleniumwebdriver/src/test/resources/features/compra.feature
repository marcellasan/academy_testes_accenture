
@compra @Eae
Feature: Compra em E-commerce
  
	Background: Abrir Site
	Given o usuario queira fazer compras no site "http://automationpractice.com/index.php"

  @compra1 @AutomationPractice
  Scenario Outline: Acessar Site
    And faz login preenchendo o campo "fulana86@fulana.com"
    And preenchendo o campo "123456"
    And clicar no botao Sign In 
    And seleciona a secao Women
    And escolhe seu vestido
    And seleciona seus atributos como "3"
    When ele clicar no botao ADD TO CART 
    And clicar no botao PROCEED TO CHECKOUT
    And for direcionado para a pagina ORDER 
    And confirma o endereco e clica em PROCEED TO CHECKOUT
    And concordar com a checkbox TERMS OF SERVICES
    And escolher o metodo de entrega clicando em PROCEED TO CHECKOUT
    And escolher o metodo de pagamento
    And clicar no botao COFIRM MY ORDER
    Then seu pedido e realizado com sucesso
    And sua tela de confirmacao e printada e o navegador fecha

    Examples: 
      |          email           |  senha   |  tamanho |
      | fulana1569588@fulana.com |  123456  |     3    |
