import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.BuyActions;
import actions.CreateAccountAction;
import utils.Constants;
import utils.DriverContext;
import utils.Generator;
import utils.Screenshot;

class TestAutomationPractice {
	WebDriver driver;
	CreateAccountAction account;
	BuyActions buy;
	
    @Rule
	    public TestName test = new TestName();
	
	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);
		driver = new ChromeDriver()	;
		driver.get("http://automationpractice.com/index.php"); // Acessa o site
		driver.manage().window().maximize(); //Maximiza a tela
		DriverContext.setDriver(driver);
		account = new CreateAccountAction();
		buy = new BuyActions();
		
		
	}

	//@Test
	void testCadastroCliente() {
		account.clicarSignIn();
		account.preencherEmail("fulana1569588@fulana.com");
		account.clicarCreateAccount();
		account.clicarGender();
		account.preencherNome("Maria");
		account.preencherSobrenome("dos Santos");
		account.preencherSenha("123456");
		account.selecionarDay("10");
		account.selecionarMonth("6");
		account.selecionarYear("1952");
		account.clicarNewsletter();
		account.clicarOfertas();
		account.preencherEndereco("Rua das Flores, 47");
		account.preencherCidade("São Paulo");
		account.selecionarEstado("8");
		account.preencherCep("11380");
		account.selecionarPais("United States");
		account.preencherNumeroCelular("1199998888");
		account.preencherEmailAlternativo("fulana@alternativo.com");
		account.clicarRegister();
		account.validarCadastro("Welcome to your account. Here you can manage all of your personal information and orders.");
   
	}
	
	@Test
	void testCompra() {
		buy.clicarSignIn();
		buy.preencherEmail("fulana86@fulana.com");
		buy.preencherSenha("123456");
		buy.ClicarBtnSignIn();
		assertEquals("My account - My Store", driver.getTitle());
		buy.clicarBtnWomen();
		assertEquals("Women - My Store", driver.getTitle());
		buy.clicarVestido1();
		assertEquals("Printed Summer Dress - My Store", driver.getTitle());
		buy.selecionarTamanho("2");
		buy.selecionarCor();
		buy.clicarBtnAddCarrinho();
		buy.fazerCheckOut();
		assertEquals("Order - My Store", driver.getTitle());
		buy.fazerCheckOutAbaResumo();
		buy.fazerCheckOutAbaEndereco();
		buy.checkTermosdeServicos();
		buy.fazerCheckOutAbaEnvio();
		buy.escolherFormaDePagemento();
		buy.confirmarPedido();
		assertEquals("Order confirmation - My Store", driver.getTitle());
		
		String screenshotArquivo = Constants.PATH_SCREENSHOT + Generator.dataHoraParaArquivo() + "_" + test.getMethodName() + ".png";
        Screenshot.tirar(driver, screenshotArquivo);
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}


}
