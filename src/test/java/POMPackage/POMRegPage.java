package POMPackage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basePackage.BaseAmazonClass;

public class POMRegPage extends BaseAmazonClass{
	
	@FindBy(id="ap_customer_name")
	WebElement RegName;
	@FindBy(id="ap_email")
	WebElement RegEmail;
	@FindBy(id="ap_password")
	WebElement Regpass;
	@FindBy(id="ap_password_check")
	WebElement RegRePass;
	@FindBy(id="continue")
	WebElement contbutton;
	@FindBy(id="auth-customerName-missing-alert")
	WebElement nameError;
	@FindBy(id="auth-email-missing-alert")
	WebElement mobError;
	@FindBy(id="auth-continue-announce")
	WebElement contText;
	@FindBy(id="auth-password-missing-alert")
	WebElement passError;
	@FindBy(id="auth-password-mismatch-alert")
	WebElement repassError;
	@FindBy(xpath="//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/div/div/h4")
	WebElement returningCust;
	
	public POMRegPage(){
		PageFactory.initElements(driver, this);
	}
	//Field related Methods
	
	public void RegName() {
		RegName.sendKeys("Ankur Bansal");
	}
	
	public void clearName() {
		RegName.clear();
	}
	
	public void RegMob() {
		RegEmail.sendKeys("4379860000");
	}
	
	public void RegPartialMob() {
		RegEmail.sendKeys("43798");
	}
	
	public void clearMob() {
		RegEmail.clear();
	}
	
	public void RegPass() {
		Regpass.sendKeys("B@nsalankur834");
	}
	
	public void RegrePass() {
		RegRePass.sendKeys("B@nsalankur834");
	}
	
	public void wrongRegrePass() {
		RegRePass.sendKeys("B@nsalankur");
	}
	
	public void RegPartialEmail() {
		RegEmail.sendKeys("bansal");
	}
	
	public void RegEmail() {
		RegEmail.sendKeys("bansalankur834@gmail.com");
	}
	
	public String returnCust() {
		String rtrnCustcheck=returningCust.getText();
		return rtrnCustcheck;
	}
	
	
	//error related methods
	public boolean NameErr() {
		boolean nameCheck=nameError.isDisplayed();
		return nameCheck;
	}
	
	public boolean MobErr() {
		boolean mobCheck=mobError.isDisplayed();
		return mobCheck;
	}
	
	public boolean PassErr() {
		boolean passCheck=passError.isDisplayed();
		return passCheck;
	}
	
	public boolean rePassErr() {
		boolean repassCheck=repassError.isDisplayed();
		return repassCheck;
	}
	
	//Continue button related method
	public void regCust() {
		contbutton.click();
	}
	
	public String contText() {
		String textCheck=contText.getText();
		return textCheck;
	}

}

