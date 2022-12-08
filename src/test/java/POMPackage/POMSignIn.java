package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class POMSignIn extends BaseAmazonClass{
	
	
	
	@FindBy(linkText="Sign in")
	WebElement signIn;
	@FindBy(id="ap_email")
	WebElement userName;
	@FindBy(xpath="//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/h1")
	WebElement signInH1;
	@FindBy(id="continue")
	WebElement contButton;
	@FindBy(id="auth-error-message-box")
	WebElement SignInErr;
	@FindBy(id="ap_password")
	WebElement SignInPass;
	@FindBy(xpath="//*[@id=\"authportal-main-section\"]/div[2]/div/div/div/form/div/div[2]/div/div/label/div/label/input")
	WebElement keepSignIn;
	@FindBy(id="signInSubmit")
	WebElement SignButton;
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement helloTxt;
	
	
	
	public POMSignIn(){
		PageFactory.initElements(driver, this);
	}
	
	public void SignIn() {
		signIn.click();
	}
	
	public String SignInH1() {
		String signPageH1=signInH1.getText();
		return signPageH1;
	}
	
	public void wrongSignInID() {
		userName.sendKeys("bansal834@gmail.com");
		
	}
	
	public void SignInID() {
		//userName.sendKeys("bansalankur834@gmail.com");
		userName.sendKeys(username());
	}
	
	public void wrongMob() {
		userName.sendKeys("437");
	}
	
	public void corrMob() {
		userName.sendKeys("4379867511");
	}
	
	public boolean checkPass() {
		boolean checkPass=SignInPass.isDisplayed();
		return checkPass;
	}
	
	public void wrngPass() {
		SignInPass.sendKeys("B@nsal834");
		
	}
	
	public void rghtPass() {
		//SignInPass.sendKeys("B@nsalankur834");
		SignInPass.sendKeys(defaultPassword());
	}
	
	public void contButton() {
		contButton.click();
	}
	
	public void keepSignIn() {
		keepSignIn.click();
	}
	
	public void SignButton() {
		SignButton.click();
	}
	
	public String helloTxt() {
		String helloVerify=helloTxt.getText();
		return helloVerify;
	}
	
	public boolean SignInErr() {
		boolean wrngEmailErr= SignInErr.isDisplayed();
		return wrngEmailErr;
	}
}
