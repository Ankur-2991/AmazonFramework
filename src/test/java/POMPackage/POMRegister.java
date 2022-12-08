package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class POMRegister extends BaseAmazonClass{
	
	@FindBy(xpath="//*[@id=\"nav-flyout-anchor\"]/div[13]")
	WebElement signDrop;
	@FindBy(linkText="Start here.")
	WebElement register;
//	@FindBy(xpath="//*[@id=\"ap_register_form\"]/div/div/h1")
//	WebElement heading;
	@FindBy(id="nav-link-accountList")
	WebElement accountDrop;
	@FindBy(id="nav-flyout-ya-newCust")
	WebElement newCust;
	
	
	public POMRegister(){
		PageFactory.initElements(driver, this);
	}
	public boolean signDrop() {
		boolean check=signDrop.isDisplayed();
		if(check==true) {
			return check;
		}
		else if(check==false){
			Actions action=new Actions(driver);
			action.moveToElement(accountDrop).build().perform();
			boolean checkAgain=newCust.isDisplayed();
			check= checkAgain;
		}
		return check;
	}
	public void clickStart() {
		register.click();
	}
	public String H1check() {
		return driver.getTitle();
	}
}
