package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class POMCreateAcc extends BaseAmazonClass{

	@FindBy(id="nav-link-accountList")
	WebElement signinButton;
	@FindBy(id="createAccountSubmit")
	WebElement createAcc;
	@FindBy(id="ap_customer_name")
	WebElement custName;
	@FindBy(id="ap_email")
	WebElement custEmail;
	@FindBy(id="ap_password")
	WebElement password;
	@FindBy(id="ap_password_check")
	WebElement rePassword;
	@FindBy(id="continue")
	WebElement register;
	
	public POMCreateAcc() {
		PageFactory.initElements(driver, this);
	}
	public void clickHello() {
		signinButton.click();
	}
	public void clickCrtAcc() {
		createAcc.click();
	}
	public void custName() {
		custName.sendKeys("Ankur Bansal");
	}
	public void custEmail() {
		custName.sendKeys("bansalankur007@gmail.com");
	}
	public void password() {
		password.sendKeys("B@nsalankur834");
	}
	public void rePassword() {
		rePassword.sendKeys("B@nsalankur834");
	}
	public void register() {
		register.click();
	}
	public String verify() {
		return driver.getTitle();
	}
}
