package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basePackage.BaseAmazonClass;

public class POMNewAdd extends BaseAmazonClass {
	
	@FindBy(linkText="Your addresses")
	WebElement yourAddButton;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/h1")
	WebElement yourAddchck;
	@FindBy(id="ya-myab-address-add-link")
	WebElement addNewAddress;
	@FindBy(id="address-ui-widgets-reload-url")
	WebElement addPageCheck;
	@FindBy(id="address-ui-widgets-countryCode")
	WebElement CanadaCheck;
	@FindBy(id="address-ui-widgets-countryCode-dropdown-nativeId")
	WebElement countryCanada;
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	WebElement addressFullName;
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	WebElement addressPhoneNumber;
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement addressAdd;
	@FindBy(id="address-ui-widgets-enterAddressCity")
	WebElement addressCity;
	@FindBy(id="address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId")
	WebElement addressState;
	@FindBy(id="address-ui-widgets-enterAddressStateOrRegion")
	WebElement stateCheck;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	WebElement postalCode;
	@FindBy(id="address-ui-widgets-use-as-my-default")
	WebElement defaultadd;
	@FindBy(id="address-ui-widgets-addr-details-gate-code")
	WebElement gateCode;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressFormContainer\"]/div[9]/div[5]/span/select")
	WebElement deliveryInst;
	@FindBy(xpath="//*[@id=\"yaab-alert-box\"]/div/h4")
	WebElement addSaved;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-suggested-address-block_id-outer\"]/label/span/div/span")
	WebElement suggestedAdd;
	
	
	
	@FindBy(id="address-ui-widgets-form-submit-button")
	WebElement addressSubmit;
	@FindBy(id="address-ui-widgets-enterAddressFullName-full-validation-alerts")
	WebElement nameError;
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber-full-validation-alerts")
	WebElement phoneError;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressFormContainer\"]/div[7]/div/div[10]/div")
	WebElement addressError;
	@FindBy(id="address-ui-widgets-enterAddressCity-full-validation-alerts")
	WebElement cityError;
	@FindBy(id="address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId-full-validation-alerts")
	WebElement stateError;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode-full-validation-alerts")
	WebElement postalError;
	
	
	public POMNewAdd(){
		PageFactory.initElements(driver, this);
	}
	
	public void yourAddPage() {
		yourAddButton.click();
	}
	public String yourAddCheck() {
		String txtchecker=yourAddchck.getText();
		return txtchecker;
	}
	public void addNewAddress() {
		addNewAddress.click();
	}
	public String addPageCheck() {
		String txtchecker=addPageCheck.getText();
		return txtchecker;
	}
	public String CanadaCheck() {
		String txtchecker=CanadaCheck.getText();
		return txtchecker;
	}
	public void selectCountry() {
		Select drop=new Select(countryCanada);
		drop.selectByValue("CA");
	}
	public void nameOnAddress() {
		addressFullName.clear();
	}
	public void nameAddress() {
		addressFullName.sendKeys("Ankur Bansal");
	}
	public void addressSubmit() {
		addressSubmit.click();
	}
	public boolean nameError() {
		boolean error=nameError.isDisplayed();
		return error;
	}
	public void phoneOnAddress() {
		addressPhoneNumber.clear();
	}
	public boolean phoneError() {
		boolean error=phoneError.isDisplayed();
		return error;
	}
	public void phoneAddress() {
		addressFullName.sendKeys("4379860000");
	}
	public void addOnAddress() {
		addressAdd.clear();
	}
	public boolean addError() {
		boolean error=addressError.isDisplayed();
		return error;
	}
	public void addAddress() {
		addressAdd.sendKeys("26 swans acre trail");
	}
	public void cityOnAddress() {
		addressCity.clear();
	}
	public boolean cityError() {
		boolean error=cityError.isDisplayed();
		return error;
	}
	public void cityAddress() {
		addressCity.sendKeys("Brampton");
	}
	public void wrgcityAddress() {
		addressCity.sendKeys("Delhi");
	}
	public void selectstate() {
		Select drop=new Select(addressState);
		drop.selectByValue("Ontario");
	}
	public String stateCheck() {
		String txtchecker=stateCheck.getText();
		return txtchecker;
	}
	public boolean stateError() {
		boolean error=stateError.isDisplayed();
		return error;
	}
	public boolean postalError() {
		boolean error=postalError.isDisplayed();
		return error;
	}
	public void postalCode() {
		addressAdd.sendKeys("L6R 0B3");
	}
	public void defaultadd() {
		defaultadd.click();
	}
	public void gateCode() {
		gateCode.sendKeys("buzz 2233");
	}
	public void deliveryInst() {
		Select drop=new Select(deliveryInst);
		drop.selectByValue("BOTH");
		deliveryInst.click();
	}
	public String addSaved() {
		String txtchecker=addSaved.getText();
		return txtchecker;
	}
	public boolean suggestedAdd() {
		boolean error=suggestedAdd.isDisplayed();
		return error;
	}
	
}
