package testLayer;

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
import POMPackage.POMSearch;
import POMPackage.POMSignIn;
import POMPackage.POMSort;
import basePackage.BaseAmazonClass;

public class SortFunctionality extends BaseAmazonClass{

	POMRegister session;
	POMRegPage regSes;
	POMSignIn SignINSes;
	POMAccount creatAccSess;
	POMNewAdd newAddress;
	POMLoginSecurity loginSecurity;
	POMPayment payment;
	POMGuestUser guestSession;
	POMSearch searchSession;
	POMSort sortSession;
	
	
	
	public SortFunctionality() {
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
		searchSession=new POMSearch();
		sortSession=new POMSort();
	}
	
	@Test
	public void newArrivalTC58() {
		guestSession.hamMenu();
		guestSession.computMenu();
		guestSession.computSubCat();
		sortSession.newArrival();	
	}
	
	@Test
	public void avgCustomerTC59() {
		guestSession.hamMenu();
		guestSession.computMenu();
		guestSession.computSubCat();
		sortSession.avgCustomer();	
	}
	
	@Test
	public void highToLowTC60() {
		guestSession.hamMenu();
		guestSession.computMenu();
		guestSession.computSubCat();
		sortSession.highToLow();	
	}
	
	@Test
	public void sortFilterTC61() {
		guestSession.hamMenu();
		guestSession.computMenu();
		guestSession.computSubCat();
		sortSession.newArrival();
		searchSession.priceRange();
	}
	
	@Test
	public void sortFilterPageTC62() {
		guestSession.hamMenu();
		guestSession.computMenu();
		guestSession.computSubCat();
		sortSession.newArrival();
		searchSession.priceRange();
		searchSession.nextButton();
	}
	
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
