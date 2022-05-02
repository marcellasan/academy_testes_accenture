package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContext;

public class BuyPage {
	
	public BuyPage() {
		PageFactory.initElements(DriverContext.getDriver(), this);
	}
	
	
	@FindBy(how=How.LINK_TEXT , using="Sign in")
	protected WebElement linkSignIn;
	
	@FindBy(how=How.ID , using="email")
	protected WebElement txtEmail;
	
	@FindBy(how=How.ID , using="passwd")
	protected WebElement txtSenha;
	
	@FindBy(how=How.ID, using="SubmitLogin")
	protected WebElement btnSignIn;

	@FindBy(how=How.LINK_TEXT, using="Women")
	protected WebElement btnWomen;
	
	@FindBy(how=How.XPATH, using="//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[5]/div[1]/div[2]/h5[1]/a[1]")
	protected WebElement imgVestido;
	
		
	@FindBy(how=How.XPATH, using="//*[@id=\"group_1\"]")
	protected WebElement boxSizes;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"attributes\"]/div/following-sibling::fieldset[2]/div/ul/li[1]")
	protected WebElement choiceColor;
	
	@FindBy(how=How.XPATH, using="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[3]/div[1]/p[1]/button[1]")
	protected WebElement btnAddToCart;
	
	@FindBy(how=How.XPATH, using="//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]\r\n")
	protected WebElement btnProceedToCheckout;
	
	@FindBy(how=How.XPATH, using="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]\r\n")
	protected WebElement btnProceedToCheckoutSummary;
	
	@FindBy(how=How.XPATH, using="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
	protected WebElement btnProceedToCheckoutAddress;
	
	@FindBy(how=How.XPATH, using="//div[@id='uniform-cgv']")
	protected WebElement checkTermosDeServico;
	
	@FindBy(how=How.XPATH, using="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]")
	protected WebElement btnProceedToCheckoutShipping;
	
	@FindBy(how=How.CLASS_NAME, using="bankwire")
	protected WebElement clickBank;
		
	@FindBy(how=How.XPATH, using="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
	protected WebElement btnConfirmMyOrder;
	
	}	
	
	
	
	
	
	
