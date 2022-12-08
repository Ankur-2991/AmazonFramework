package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basePackage.BaseAmazonClass;

public class POMSearch extends BaseAmazonClass {
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	@FindBy(id="nav-search-submit-button")
	WebElement searchClick;
	@FindBy(xpath="//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")
	WebElement computerVerify;
	@FindBy(xpath="//*[@id=\"searchDropdownBox\"]")
	WebElement searchDropDown;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[1]/div/h1/b")
	WebElement categoryVerify;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
	WebElement productDetails;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[30]/div/div/span/a[3]")
	WebElement nextButton;
	@FindBy(xpath="//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]")
	WebElement paginationCheck;
	@FindBy(xpath="//*[@id=\"p_n_date/1249033011\"]/span/a")
	WebElement newArrival;
	@FindBy(xpath="//*[@id=\"p_72/1248879011\"]/span/a")
	WebElement custRating;
	@FindBy(xpath="//*[@id=\"p_89/Logitech\"]/span/a/div/label/input")
	WebElement brandFilter;
	@FindBy(xpath="//*[@id=\"p_36/1253507011\"]/span/a")
	WebElement priceRange;
	@FindBy(xpath="//*[@id=\"p_6/ATVPDKIKX0DER\"]/span/a/div/label/input")
	WebElement selectSeller;
	
	
	
	
	
	public POMSearch(){
		PageFactory.initElements(driver, this);
	}
	
	public void dynamicSrchBox(String keyword) {
		searchbox.sendKeys(keyword);
	}
	public void searchbox() {
		searchbox.sendKeys("computer");
	}
	public void searchClick() {
		searchClick.click();
	}
	public String computerVerify() {
		String check=computerVerify.getText();
		return check;
	}
	public void searchDropDown() {
		Select drop=new Select(searchDropDown);
		drop.selectByValue("search-alias=computers-intl-ship");
	}
	public boolean categoryVerify() {
		boolean check=categoryVerify.isDisplayed();
		return check;
	}
	public boolean productDetails() {
		boolean check=productDetails.isDisplayed();
		return check;
	}
	public void nextButton() {
		nextButton.click();
	}
	public String paginationCheck() {
		String check=paginationCheck.getText();
		return check;
	}
	public void newArrival() {
		newArrival.click();
	}
	public void custRating() {
		custRating.click();
	}
	public void brandFilter() {
		brandFilter.click();
	}
	public void priceRange() {
		priceRange.click();
	}
	public void selectSeller() {
		selectSeller.click();
	}
	
	
}
