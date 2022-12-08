package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basePackage.BaseAmazonClass;

public class POMSort extends BaseAmazonClass {

	@FindBy(id="s-result-sort-select")
	WebElement newArrival;
	
	
	
	
	
	
	public POMSort(){
		PageFactory.initElements(driver, this);
	}
	
	public void newArrival() {
		Select drop=new Select(newArrival);
		drop.selectByValue("date-desc-rank");
	}
	public void avgCustomer() {
		Select drop=new Select(newArrival);
		drop.selectByValue("review-rank");
	}
	public void highToLow() {
		Select drop=new Select(newArrival);
		drop.selectByValue("price-desc-rank");
	}
	
	
	
}
