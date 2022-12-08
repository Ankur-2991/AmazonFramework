package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMPackage.POMAccount;
import POMPackage.POMGuestUser;
import POMPackage.POMLoginSecurity;
import POMPackage.POMNewAdd;
import POMPackage.POMPayment;
import POMPackage.POMRegPage;
import POMPackage.POMRegister;
import POMPackage.POMSignIn;
import basePackage.BaseAmazonClass;

public class GuestUser extends BaseAmazonClass {

	POMRegister session;
	POMRegPage regSes;
	POMSignIn SignINSes;
	POMAccount creatAccSess;
	POMNewAdd newAddress;
	POMLoginSecurity loginSecurity;
	POMPayment payment;
	POMGuestUser guestSession;
	
	
	public GuestUser() {
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
		guestSession=new POMGuestUser();
	}
	
	@Test
	public void guestUserTC47() {
		guestSession.hamMenu();
		guestSession.computMenu();
		guestSession.computSubCat();
		boolean check=guestSession.resultPage();
		Assert.assertEquals(check, true );
	}
	
	@Test
	public void guestUserBuyTC48() {
		guestSession.hamMenu();
		guestSession.computMenu();
		guestSession.computSubCat();
		guestSession.selectProduct();
		guestSession.buyNow();
		boolean check=guestSession.checkoutPage();
		Assert.assertEquals(check, true );
		
	}
	
	

	@AfterMethod
	public void close() {
		driver.close();
	}
}
