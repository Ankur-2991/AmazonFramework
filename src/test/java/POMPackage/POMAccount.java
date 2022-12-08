package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basePackage.BaseAmazonClass;

public class POMAccount extends BaseAmazonClass {
	
	
	@FindBy(id="nav_youraccount_btn")
	WebElement dropdown;
	@FindBy(linkText="Account")
	WebElement account;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[1]/h1")
	WebElement accuntpageH1;
	@FindBy(linkText="Your Orders")
	WebElement yourOrder;
	@FindBy(xpath="//*[@id=\"a-page\"]/section/div/div[2]/div[1]/h1")
	WebElement ordpageH1;
	@FindBy(id="time-filter")
	WebElement ordHistFilt;
	@FindBy(id="a-autoid-1-announce")
	WebElement verifyFilt;
	@FindBy(xpath="//*[@id=\"yourOrdersContent\"]/div[3]/div/h1")
	WebElement archOrder;
	@FindBy(linkText="Buy Again")
	WebElement buyAgain;
	@FindBy(id="CardInstancesvpDgskAk_789ujnGHyMLA")
	WebElement buyAgainChck;
	@FindBy(linkText="Not Yet Shipped")
	WebElement notShipped;
	@FindBy(id="ordersContainer")
	WebElement notShipchck;
	@FindBy(linkText="Cancelled Orders")
	WebElement canclord;
	@FindBy(linkText="ordersContainer")
	WebElement canclordcheck;
	
	
	public POMAccount(){
		PageFactory.initElements(driver, this);
	}
	
	public void dropdown(){
		Actions action=new Actions(driver);
		action.moveToElement(dropdown).build().perform();
	}
	public void clickAcc() {
		account.click();
	}
	public String AccpageCheck() {
		String txtchecker=accuntpageH1.getText();
		return txtchecker;
	}
	public void ordPage() {
		yourOrder.click();
	}
	public String ordpageCheck() {
		String txtchecker=ordpageH1.getText();
		return txtchecker;
	}
	public void ordFilterYear() {
		Select drop=new Select(ordHistFilt);
		drop.selectByValue("year-2022");
	}
	public void ordFilterArch() {
		Select drop=new Select(ordHistFilt);
		drop.selectByValue("archived");
	}
	public String filtCheck() {
		String txtchecker=verifyFilt.getText();
		return txtchecker;
	}
	public String archCheck() {
		String txtchecker=archOrder.getText();
		return txtchecker;
	}
	public void buyAgainPage() {
		buyAgain.click();
	}
	public boolean buyAgainCheck() {
		boolean txtchecker=buyAgainChck.isDisplayed();
		return txtchecker;
	}
	public void notShipPage() {
		notShipped.click();
	}
	public boolean notshipCheck() {
		boolean txtchecker=notShipchck.isDisplayed();
		return txtchecker;
	}
	public void cancelordPage() {
		canclord.click();
	}
	public boolean cancelOrdCheck() {
		boolean txtchecker=canclordcheck.isDisplayed();
		return txtchecker;
	}
	
}
