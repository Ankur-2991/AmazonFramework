package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basePackage.BaseAmazonClass;

public class POMPayment extends BaseAmazonClass{
	
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[2]/a")
	WebElement paymentPage;
	@FindBy(xpath="//*[@id=\"cpefront-mpo-widget\"]/div/div[2]/div[2]/span")
	WebElement payPageCheck;
	@FindBy(id="pp-fE1qhc-10")
	WebElement addPayment;
	@FindBy(id="pp-WZdFMv-54")
	WebElement addCard;
	@FindBy(id="pp-5VcFYi-16")
	WebElement cardNum;
	@FindBy(id="pp-5VcFYi-18")
	WebElement cardName;
	@FindBy(id="pp-5VcFYi-19")
	WebElement cardMonth;
	@FindBy(id="pp-5VcFYi-21")
	WebElement cardYear;
	@FindBy(id="pp-5VcFYi-21")
	WebElement saveCard;
	@FindBy(id="pp-jNT3wW-18")
	WebElement defaultCard;
	@FindBy(xpath="//*[@id=\"pp-jNT3wW-17\"]/div/div/form/div/div[2]/div/span[2]/span/input")
	WebElement finalSaveCard;
	@FindBy(xpath="//*[@id=\"cpefront-mpo-widget\"]/div/div[2]/div[3]/div/div[2]/div/div/div[1]")
	WebElement cardAdded;
	
	public POMPayment(){
		PageFactory.initElements(driver, this);
	}
	
	public void paymentPage() {
		paymentPage.click();
	}
	public String payPageCheck() {
		String check=payPageCheck.getText();
		return check;
	}
	public void addPayment() {
		addPayment.click();
	}
	public void cardNum() {
		cardNum.sendKeys("4012888888881881");
	}
	public void cardName() {
		cardName.sendKeys("Ankur");
	}
	public void cardMonth() {
		Select drop=new Select(cardMonth);
		drop.selectByValue("7");
	}
	public void cardYear() {
		Select drop=new Select(cardYear);
		drop.selectByValue("2025");
	}
	public void saveCard() {
		saveCard.click();
	}
	public boolean defaultCard() {
		boolean error=defaultCard.isDisplayed();
		return error;
	}
	public void defaultCardClick() {
		defaultCard.click();
	}
	public void finalSaveCard() {
		finalSaveCard.click();
	}
	public boolean cardAdded() {
		boolean error=cardAdded.isDisplayed();
		return error;
	}
	
	
}
