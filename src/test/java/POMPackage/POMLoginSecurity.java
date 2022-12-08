package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class POMLoginSecurity extends BaseAmazonClass {
	
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[2]/div[2]/a")
	WebElement securityPage;
	@FindBy(id="auth-cnep-edit-name-button")
	WebElement nameSecurity;
	@FindBy(id="ap_customer_name")
	WebElement newNameSecurity;
	@FindBy(id="auth-success-message-box")
	WebElement nameChangeSucc;
	@FindBy(id="auth-cnep-edit-password-button")
	WebElement passSecurity;
	@FindBy(id="ap_password")
	WebElement oldpassSecurity;
	@FindBy(id="ap_password_new")
	WebElement newpassSecurity;
	@FindBy(id="ap_password_new_check")
	WebElement repassSecurity;
	
	
	public POMLoginSecurity(){
		PageFactory.initElements(driver, this);
	}
	
	public void securityPage() {
		securityPage.click();
	}
	public void nameSecurity() {
		nameSecurity.click();
	}
	public void newNameSecurity() {
		newNameSecurity.clear();
		newNameSecurity.sendKeys("Rohit");
	}
	public boolean nameChangeSucc() {
		boolean check=nameChangeSucc.isDisplayed();
		return check;
	}
	public void passSecurity() {
		passSecurity.click();
	}
	public void oldpassSecurity() {
		oldpassSecurity.sendKeys("B@nsalankur834");
	}
	public void newpassSecurity() {
		oldpassSecurity.sendKeys("ankurB@nsal834");
	}
	public void repassSecurity() {
		repassSecurity.sendKeys("ankurB@nsal834");
	}
}
