package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class POMShipCart extends BaseAmazonClass {

	@FindBy(id="addToCart_feature_div")
	WebElement addToCart;
	@FindBy(id="attach-sidesheet-view-cart-button")
	WebElement cartButton;
	@FindBy(xpath="//*[@id=\"sc-active-cart\"]/div/div/div[1]/h1")
	WebElement shoppingCartCheck;
	
	@FindBy(id="sc-buy-box-ptc-button")
	WebElement checkoutButton;
	@FindBy(xpath="//*[@id=\"sc-active-C22bebebb-9473-4b41-b1b1-5526cde07eba\"]/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span[1]/span/span[2]")
	WebElement productDetails;
	@FindBy(xpath="//*[@id=\"a-autoid-0-announce\"]/span[2]")
	WebElement initialQuantity;
	@FindBy(xpath="//*[@id=\"sc-subtotal-amount-activecart\"]/span")
	WebElement initialPrice;
	@FindBy(xpath="//*[@id=\"sc-active-C22bebebb-9473-4b41-b1b1-5526cde07eba\"]/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a")
	WebElement productLink;
	@FindBy(xpath="//*[@id=\"a-autoid-0-announce\"]/span[2]")
	WebElement finalQuantity;
	@FindBy(xpath="//*[@id=\"sc-subtotal-amount-activecart\"]/span")
	WebElement finalPrice;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a")
	WebElement secondProd;
	@FindBy(xpath="//*[@id=\"a-autoid-2-announce\"]/span[2]")
	WebElement oldProdQuant;
	@FindBy(id="nav-cart")
	WebElement homepagecartButton;
	@FindBy(xpath="//*[@id=\"sc-active-Cf67a10d5-17c5-4849-a57e-3f57abbc3879\"]/div[4]/div/div[1]/div/div/div[2]/div[1]/span[2]/span/input")
	WebElement dltFirstProd;
	@FindBy(xpath="//*[@id=\"sc-active-Cf67a10d5-17c5-4849-a57e-3f57abbc3879\"]/div[4]/div/div[1]/div/div/div[2]/div[1]/span[2]/span/input")
	WebElement dltSecProd;
	@FindBy(xpath="//*[@id=\"sc-active-cart\"]/div/div/div/h1")
	WebElement emptyCart;
	
	
	
	String initialQuant;
	String initialpric;
	String finalQuant;
	String finalpric;
	public POMShipCart(){
		PageFactory.initElements(driver, this);
	}
	public void addToCart() {
		addToCart.click();
	}
	public void cartButton() {
		cartButton.click();
	}
	public boolean shoppingCartCheck() {
		boolean check=shoppingCartCheck.isDisplayed();
		return check;
	}
	public void checkoutButton() {
		checkoutButton.click();
	}
	public boolean productDetails() {
		boolean check=productDetails.isDisplayed();
		return check;
	}
	public int initialQuantity() {
		initialQuant=initialQuantity.getText();
		int check=Integer.parseInt(initialQuant);
		check=check*2;
		return check;
	}
	public int initialPrice() {
		initialpric=initialPrice.getText();
		int check=Integer.parseInt(initialpric);
		check=check*2;
		return check;
	}
	public void productLink() {
		productLink.click();
	}
	public int newQuantity() {
		finalQuant=initialQuantity.getText();
		int check=Integer.parseInt(finalQuant);
		return check;
	}
	public int newPrice() {
		finalpric=initialPrice.getText();
		int check=Integer.parseInt(finalpric);
		return check;
	}
	public void secondProd() {
		secondProd.click();
	}
	public int newProdQuant() {
		int check=Integer.parseInt(initialQuantity.getText());
		return check;
	}
	public int oldProdQuant() {
		int check=Integer.parseInt(oldProdQuant.getText());
		return check;
	}
	public void homepagecartButton() {
		homepagecartButton.click();
	}
	public void dltFirstProd() {
		dltFirstProd.click();
	}
	public void dltSecProd() {
		dltSecProd.click();
	}
	public String emptyCart() {
		String check=emptyCart.getText();
		return check;
	}
}
