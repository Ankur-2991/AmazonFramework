package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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
import basePackage.BaseAmazonClass;
import testData.ExcelSheet;

public class SearchFunctionality extends BaseAmazonClass {

	POMRegister session;
	POMRegPage regSes;
	POMSignIn SignINSes;
	POMAccount creatAccSess;
	POMNewAdd newAddress;
	POMLoginSecurity loginSecurity;
	POMPayment payment;
	POMGuestUser guestSession;
	POMSearch searchSession;
	
	public SearchFunctionality() {
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
	}
	
	@DataProvider
	public Object[][] Details(){
		Object result[][]=ExcelSheet.readdata("Sheet1");
		return result;
	}
	
	@Test(dataProvider="Details")
	public void searchNameTC49(String searchTitle) {
		searchSession.dynamicSrchBox(searchTitle);
		searchSession.searchClick();
//		String check=searchSession.computerVerify();
//		Assert.assertEquals(check,'"'+searchTitle+'"' );
		
	}
	
	@Test
	public void searchCategoryTC50() {
		searchSession.searchDropDown();
		searchSession.searchClick();
		boolean check=searchSession.categoryVerify();
		Assert.assertEquals(check, true );	
	}
	
	@Test
	public void searchDetailsTC51() {
		searchSession.searchbox();
		searchSession.searchClick();
		boolean check=searchSession.productDetails();
		Assert.assertEquals(check, true );	
	}
	
	@Test
	public void searchPaginationTC52() {
		searchSession.searchbox();
		searchSession.searchClick();
		searchSession.nextButton();
		String check=searchSession.paginationCheck();
		Assert.assertEquals(check, "17-32 of over 10,000 results for" );	
	}
	
	@Test
	public void newArrivalTC53() {
		guestSession.hamMenu();
		guestSession.computMenu();
		guestSession.computSubCat();
		searchSession.newArrival();	
	}
	
	@Test
	public void custRatingTC54() {
		guestSession.hamMenu();
		guestSession.computMenu();
		guestSession.computSubCat();
		searchSession.custRating();	
	}
	
	@Test
	public void brandFilterTC55() {
		guestSession.hamMenu();
		guestSession.computMenu();
		guestSession.computSubCat();
		searchSession.brandFilter();	
	}
	
	@Test
	public void priceRangeTC56() {
		guestSession.hamMenu();
		guestSession.computMenu();
		guestSession.computSubCat();
		searchSession.priceRange();	
	}
	
	@Test
	public void selectSellerTC57() {
		guestSession.hamMenu();
		guestSession.computMenu();
		guestSession.computSubCat();
		searchSession.selectSeller();	
	}
	
	
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
}
