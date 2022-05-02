package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContext;

public class CreateAccountPage {
	
	public CreateAccountPage() {
		PageFactory.initElements(DriverContext.getDriver(), this);
		
	}
	@FindBy(how=How.LINK_TEXT , using="Sign in")
	protected WebElement linkSignIn;
	
	@FindBy(how=How.ID , using="email_create")
	protected WebElement txtEmail;
	
	@FindBy(how=How.ID , using="SubmitCreate")
	protected WebElement btnCreateAccount;
	
	@FindBy(how=How.ID , using="uniform-id_gender2")
	protected WebElement checkGender;
	
	@FindBy(how=How.ID_OR_NAME , using="customer_firstname")
	protected WebElement txtNome;
	
	@FindBy(how=How.ID_OR_NAME , using="customer_lastname")
	protected WebElement txtSobrenome;
	
	@FindBy(how=How.ID , using="passwd")
	protected WebElement txtSenha;
	
	@FindBy(how=How.ID , using="days")
	protected WebElement boxDays;
	
	@FindBy(how=How.ID , using="months")
	protected WebElement boxMonths;
	
	@FindBy(how=How.ID , using="years")
	protected WebElement boxYears;
	
	@FindBy(how=How.ID , using="uniform-newsletter")
	protected WebElement boxNews;
	
	@FindBy(how=How.ID , using="uniform-optin")
	protected WebElement boxOptin;
	
	@FindBy(how=How.ID , using="address1")
	protected WebElement txtEndereco;
	
	@FindBy(how=How.ID , using="city")
	protected WebElement txtCidade;
	
	@FindBy(how=How.ID , using="id_state")
	protected WebElement boxState;
	
	@FindBy(how=How.ID , using="postcode")
	protected WebElement txtCep;
	
	@FindBy(how=How.ID , using="id_country")
	protected WebElement boxCountry;
	
	@FindBy(how=How.ID , using="phone_mobile")
	protected WebElement txtNumCelular;
	
	@FindBy(how=How.ID , using="alias")
	protected WebElement txtEmailAlt;
	
	@FindBy(how=How.ID , using="submitAccount")
	protected WebElement btnRegister;
	
	@FindBy(how=How.ID , using="submitAccount")
	protected WebElement txtMensagem;
	
	@FindBy (how=How.CLASS_NAME, using="info-account")
	protected WebElement txtValidate;
	
		

}



