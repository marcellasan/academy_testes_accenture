package actions;

import static org.junit.Assert.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.CreateAccountPage;
import utils.DriverContext;



public class CreateAccountAction extends CreateAccountPage {
	
	protected WebDriverWait wait;
	JavascriptExecutor jse = (JavascriptExecutor)DriverContext.getDriver();
	
	
	public CreateAccountAction() {
		wait =  new WebDriverWait(DriverContext.getDriver() , 10);
		
		//PageFactory.initElements(DriverContext.getDriver(), this); //CHAMA O DRIVER
	}
	
	public void clicarSignIn() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSignIn)).click();
		
	}
	
	public void preencherEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email);
	}
	
	
	public void clicarCreateAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(btnCreateAccount)).click();
	}
  	
	public void clicarGender() {
		wait.until(ExpectedConditions.elementToBeClickable(checkGender)).click();
	}

	public void preencherNome(String nome) {
		wait.until(ExpectedConditions.visibilityOf(txtNome)).sendKeys(nome);
	}
	
	public void preencherSobrenome(String sobrenome) {
		wait.until(ExpectedConditions.visibilityOf(txtSobrenome)).sendKeys(sobrenome);
	}
	
	public void preencherSenha(String senha) {
		wait.until(ExpectedConditions.visibilityOf(txtSenha)).sendKeys(senha);
		jse.executeScript("window.scrollBy (0,500)");
		
	}
	
	public void selecionarDay(String day) {
		Select boxDay = new Select(boxDays);
		boxDay.selectByValue(day);
	}
	
	public void selecionarMonth(String month) {
		Select boxMonth = new Select(boxMonths);
		boxMonth.selectByValue(month);
	}
	
	public void selecionarYear(String year) {
		Select boxYear = new Select(boxYears);
		boxYear.selectByValue(year);
	}

	public void clicarNewsletter() {
		wait.until(ExpectedConditions.elementToBeClickable(boxNews)).click();
	}
	
	public void clicarOfertas() {
		wait.until(ExpectedConditions.elementToBeClickable(boxOptin)).click();
	}
	
	public void preencherEndereco(String endereco) {
		wait.until(ExpectedConditions.visibilityOf(txtEndereco)).sendKeys(endereco);
	}
	
	public void preencherCidade(String cidade) {
		wait.until(ExpectedConditions.visibilityOf(txtCidade)).sendKeys(cidade);
	}
	
	public void selecionarEstado(String estado) {
		Select boxStates = new Select(boxState);
		boxStates.selectByValue(estado);
		
		jse.executeScript("window.scrollBy (0,1000)");
	}
	
	public void preencherCep(String cep) {
		wait.until(ExpectedConditions.visibilityOf(txtCep)).sendKeys(cep);
	}
	
	public void selecionarPais(String pais) {
		Select boxCountries = new Select(boxCountry);
		boxCountries.selectByVisibleText(pais);
	}
	
	public void preencherNumeroCelular(String num_celular) {
		wait.until(ExpectedConditions.visibilityOf(txtNumCelular)).sendKeys(num_celular);
	}
	
	public void preencherEmailAlternativo(String email_alternativo) {
		wait.until(ExpectedConditions.visibilityOf(txtEmailAlt)).sendKeys(email_alternativo);
	}
	
	public void clicarRegister() {
		wait.until(ExpectedConditions.elementToBeClickable(btnRegister)).click();
	}
	
	 public void validarCadastro(String mensagem) {
				 
		assertEquals(txtValidate.getText(), mensagem);
		

		 
	 }	 
} 
	 
	 
	 
	
