package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMPackage.POMAccount;
import POMPackage.POMLoginSecurity;
import POMPackage.POMNewAdd;
import POMPackage.POMPayment;
import POMPackage.POMRegPage;
import POMPackage.POMRegister;
import POMPackage.POMSignIn;
import basePackage.BaseAmazonClass;

public class PaymentPage extends BaseAmazonClass{
	
	POMRegister session;
	POMRegPage regSes;
	POMSignIn SignINSes;
	POMAccount creatAccSess;
	POMNewAdd newAddress;
	POMLoginSecurity loginSecurity;
	POMPayment payment;
	
	public PaymentPage() {
		super();
	}
	
	@BeforeMethod
	public void initsetup() {
		initiation();
		session=new POMRegister();
		regSes=new POMRegPage();
		SignINSes=new POMSignIn();
		creatAccSess=new POMAccount();
		newAddress=new POMNewAdd();
		loginSecurity=new POMLoginSecurity();
		payment=new POMPayment();
	}
	
	@Test
	public void paymentPageTC44() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		payment.paymentPage();
		String txtChecker= payment.payPageCheck();
		Assert.assertEquals(txtChecker, "Wallet" );
	}
	
	@Test
	
	public void addCardpaymentTC45() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		payment.paymentPage();
		payment.addPayment();
		payment.cardNum();
		payment.cardName();
		payment.cardMonth();
		payment.cardYear();
		payment.saveCard();
		boolean txtChecker= payment.defaultCard();
		Assert.assertEquals(txtChecker, true );
	}
	
	@Test
	public void addCardpaymentTC46() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		payment.paymentPage();
		payment.addPayment();
		payment.cardNum();
		payment.cardName();
		payment.cardMonth();
		payment.cardYear();
		payment.saveCard();
		payment.defaultCard();
		payment.finalSaveCard();
		boolean txtChecker= payment.cardAdded();
		Assert.assertEquals(txtChecker, true );
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
