package POMPackage;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class POMGuestUser extends BaseAmazonClass {
	
	@FindBy(id="nav-hamburger-menu")
	WebElement hamMenu;
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[8]/a")
	WebElement computMenu;
	@FindBy(linkText="Computer Accessories & Peripherals")
	WebElement computSubCat;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[1]/div/span/div/div/span")
	WebElement resultPage;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[1]/h2/a")
	WebElement selectProduct;
	@FindBy(id="buy-now-button")
	WebElement buyNow;
	@FindBy(xpath="//*[@id=\"header\"]/div/div[3]/h1")
	WebElement checkoutPage;
	
	
	
	
	
	public POMGuestUser(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void hamMenu() {
		hamMenu.click();
	}
	public void computMenu() {
		computMenu.click();
	}
	public void computSubCat() {
		computSubCat.click();
	}
	public boolean resultPage() {
		boolean check=resultPage.isDisplayed();
		return check;
	}
	public void selectProduct() {
		selectProduct.click();
	}
	public void buyNow() {
		buyNow.click();
	}
	public boolean checkoutPage() {
		boolean check=checkoutPage.isDisplayed();
		return check;
	}
	
	
	
}
