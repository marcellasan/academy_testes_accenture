package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.BuyPage;
import utils.DriverContext;

public class BuyActions extends BuyPage {
	protected WebDriverWait wait;
	JavascriptExecutor jse = (JavascriptExecutor)DriverContext.getDriver();

	public BuyActions() {
		wait =  new WebDriverWait(DriverContext.getDriver() , 50);
	}
	
	public void clicarSignIn() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSignIn)).click();
		
	}
	
	public void preencherEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email);
	}
	
	public void preencherSenha(String senha) {
		wait.until(ExpectedConditions.visibilityOf(txtSenha)).sendKeys(senha);
		
	}
	
	public void ClicarBtnSignIn() {
		wait.until(ExpectedConditions.elementToBeClickable(btnSignIn)).click();
	}
	
	public void clicarBtnWomen() {
		wait.until(ExpectedConditions.elementToBeClickable(btnWomen)).click();
		
	}
	
	public void clicarVestido1() {
		jse.executeScript("window.scrollBy (0,document.body.scrollHeight)");
		wait.until(ExpectedConditions.elementToBeClickable(imgVestido)).click();
		
		}
	
		
	public void selecionarTamanho(String size) {
		Select boxSize = new Select(boxSizes);
		boxSize.selectByValue(size);		
	}
	
	public void selecionarCor() {
		wait.until(ExpectedConditions.elementToBeClickable(choiceColor)).click();
	}
	
	public void clicarBtnAddCarrinho() {
		wait.until(ExpectedConditions.elementToBeClickable(btnAddToCart)).click();
	}
	
	public void fazerCheckOut() {
		wait.until(ExpectedConditions.elementToBeClickable(btnProceedToCheckout)).click();
	}
	
	public void fazerCheckOutAbaResumo() {
		wait.until(ExpectedConditions.elementToBeClickable(btnProceedToCheckoutSummary)).click();
	}
	
	public void fazerCheckOutAbaEndereco() {
		jse.executeScript("window.scrollBy (0,document.body.scrollHeight)");
		wait.until(ExpectedConditions.elementToBeClickable(btnProceedToCheckoutAddress)).click();
	}
	
	public void checkTermosdeServicos() {
		jse.executeScript("window.scrollBy (0,document.body.scrollHeight)");
		wait.until(ExpectedConditions.elementToBeClickable(checkTermosDeServico)).click();
	}
	public void fazerCheckOutAbaEnvio() {
		wait.until(ExpectedConditions.elementToBeClickable(btnProceedToCheckoutShipping)).click();
	}
	
	public void escolherFormaDePagemento() {
		wait.until(ExpectedConditions.elementToBeClickable(clickBank)).click();
	}
	
	public void confirmarPedido() {
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirmMyOrder)).click();
	}
	
	
}
