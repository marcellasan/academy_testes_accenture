package stepdefinitions;


import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import actions.BuyActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Constants;
import utils.DriverManager;
import utils.Generator;
import utils.Screenshot;



public class compraStep  {
	
	DriverManager manager = new DriverManager();
	WebDriver driver = manager.AbrirUrl();
	BuyActions action = PageFactory.initElements(driver, BuyActions.class);
	
	
	public compraStep() throws Exception {
		
	}
	
	@Rule
	   public TestName test = new TestName();
	
	
	
	@Given("o usuario queira fazer compras no site {string}")
			public void o_usuario_queira_fazer_compras_no_site(String url) {
		driver.get(url); 
		driver.manage().window().maximize();
	
	}

	@And("faz login preenchendo o campo {string}")
	public void faz_login_preenchendo_o_campo_fulana86_fulana_com(String email) {
	    action.clicarSignIn();
		action.preencherEmail(email);
	}
	
	@And("preenchendo o campo {string}")
	public void preenchendo_o_campo(String senha) {
		action.preencherSenha(senha);
	   
	}

	@And("clicar no botao Sign In")
	public void clicar_no_bot_o_sign_in() {
	   action.ClicarBtnSignIn();
	}

	@And("seleciona a secao Women")
	public void seleciona_a_se_o_women() {
	    action.clicarBtnWomen();
	}

	@And("escolhe seu vestido")
	public void escolhe_seu_vestido() {
	   action.clicarVestido1();
	}

	@And("seleciona seus atributos como {string}")
	public void seleciona_seus_atributos_como(String tamanho) {
	    action.selecionarTamanho(tamanho);
	    action.selecionarCor();
	    
	}

	@When("ele clicar no botao ADD TO CART")
	public void ele_clicar_no_bot_o_add_to_cart() {
		action.clicarBtnAddCarrinho();
	  
	}

	@And("clicar no botao PROCEED TO CHECKOUT")
	public void clicar_no_bot_o_proceed_to_checkout() {
		action.fazerCheckOut();
	   
	}

	@And("for direcionado para a pagina ORDER")
	public void for_direcionado_para_a_p_gina_order() {
		action.fazerCheckOutAbaResumo();
	}
	
	@And("confirma o endereco e clica em PROCEED TO CHECKOUT")
	public void confirmar_seu_endere_o_clicando_em_proceed_to_checkout() {
	    action.fazerCheckOutAbaEndereco();
	}

	@And("concordar com a checkbox TERMS OF SERVICES")
	public void concordar_com_a_checkbox_terms_of_services() {
	   action.checkTermosdeServicos();
	}

	@And("escolher o metodo de entrega clicando em PROCEED TO CHECKOUT")
	public void escolher_o_m_todo_de_entrega_clicando_em_proceed_to_checkout() {
	   action.fazerCheckOutAbaEnvio();
	}

	@And("escolher o metodo de pagamento")
	public void escolher_o_m_todo_de_pagamento() {
	   action.escolherFormaDePagemento();
	}

	@And("clicar no botao COFIRM MY ORDER")
	public void clicar_no_bot_o_cofirm_my_order() {
		action.confirmarPedido();
	  
	}

	@Then("seu pedido e realizado com sucesso")
	public void seu_pedido_realizado_com_sucesso() {
		assertEquals("Order confirmation - My Store", driver.getTitle());
	}

	@And("sua tela de confirmacao e printada e o navegador fecha")
	public void sua_tela_de_confirma_o_printada() {
		String screenshotArquivo = Constants.PATH_SCREENSHOT + Generator.dataHoraParaArquivo() + "_" + test.getMethodName() + ".png";
        Screenshot.tirar(driver, screenshotArquivo);
        driver.quit();
	}

	@And("faz login preenchendo o campo fulana1569588@fulana.com")
	public void faz_login_preenchendo_o_campo_fulana1569588_fulana_com(String email) {
	    action.clicarSignIn();
		action.preencherEmail(email);
		
	    
	}

	
}
