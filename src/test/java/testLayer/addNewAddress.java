package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMPackage.POMAccount;
import POMPackage.POMNewAdd;
import POMPackage.POMRegPage;
import POMPackage.POMRegister;
import POMPackage.POMSignIn;
import basePackage.BaseAmazonClass;

public class addNewAddress extends BaseAmazonClass {
	
	POMRegister session;
	POMRegPage regSes;
	POMSignIn SignINSes;
	POMAccount creatAccSess;
	POMNewAdd newAddress;
	
	public addNewAddress() {
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
	}
	
	@Test
	public void yourAddrssTC25() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		newAddress.yourAddPage();
		String txtChecker=newAddress.yourAddCheck();
		Assert.assertEquals(txtChecker, "Your Addresses");
	}
	
	@Test
	public void addAddrssTC26() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		newAddress.yourAddPage();
		newAddress.addNewAddress();
		String txtChecker=newAddress.addPageCheck();
		Assert.assertEquals(txtChecker, "Add a new address");
	}
	
	@Test
	public void cntryCanadaTC27() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		newAddress.yourAddPage();
		newAddress.addNewAddress();
		String txtChecker=newAddress.CanadaCheck();
		Assert.assertEquals(txtChecker, "Canada");
	}
	
	@Test
	public void selectCanadaTC28() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		newAddress.yourAddPage();
		newAddress.addNewAddress();
		newAddress.selectCountry();
		String txtChecker=newAddress.CanadaCheck();
		Assert.assertEquals(txtChecker, "Canada");
	}
	
	@Test
	public void addressNoNameTC29() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		newAddress.yourAddPage();
		newAddress.addNewAddress();
		newAddress.selectCountry();
		newAddress.nameOnAddress();
		newAddress.addressSubmit();
		boolean txtChecker=newAddress.nameError();
		Assert.assertEquals(txtChecker, true);
	}
	
	@Test
	public void addressNameTC30() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		newAddress.yourAddPage();
		newAddress.addNewAddress();
		newAddress.selectCountry();
		newAddress.nameAddress();
		newAddress.addressSubmit();
		boolean txtChecker=newAddress.nameError();
		Assert.assertEquals(txtChecker, false);
	}
	
	@Test
	public void addressNoPhoneTC31() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		newAddress.yourAddPage();
		newAddress.addNewAddress();
		newAddress.selectCountry();
		newAddress.nameAddress();
		newAddress.phoneOnAddress();
		newAddress.addressSubmit();
		boolean txtChecker=newAddress.phoneError();
		Assert.assertEquals(txtChecker, true);
	}
	
	@Test
	public void addressPhoneTC32() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		newAddress.yourAddPage();
		newAddress.addNewAddress();
		newAddress.selectCountry();
		newAddress.nameAddress();
		newAddress.phoneAddress();
		newAddress.addressSubmit();
		boolean txtChecker=newAddress.phoneError();
		Assert.assertEquals(txtChecker, false);
	}
	
	@Test
	public void addressnoAddTC33() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		newAddress.yourAddPage();
		newAddress.addNewAddress();
		newAddress.selectCountry();
		newAddress.nameAddress();
		newAddress.phoneAddress();
		newAddress.addOnAddress();
		newAddress.addressSubmit();
		boolean txtChecker=newAddress.addError();
		Assert.assertEquals(txtChecker, true);
	}
	
	@Test
	public void addressAddTC34() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		newAddress.yourAddPage();
		newAddress.addNewAddress();
		newAddress.selectCountry();
		newAddress.nameAddress();
		newAddress.phoneAddress();
		newAddress.addAddress();
		newAddress.addressSubmit();
		boolean txtChecker=newAddress.addError();
		Assert.assertEquals(txtChecker, false);
	}
	
	@Test
	public void addressnoCityTC35() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		newAddress.yourAddPage();
		newAddress.addNewAddress();
		newAddress.selectCountry();
		newAddress.nameAddress();
		newAddress.phoneAddress();
		newAddress.addAddress();
		newAddress.cityOnAddress();
		newAddress.addressSubmit();
		boolean txtChecker=newAddress.cityError();
		Assert.assertEquals(txtChecker, true);
	}
	
	@Test
	public void addresscityTC36() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		newAddress.yourAddPage();
		newAddress.addNewAddress();
		newAddress.selectCountry();
		newAddress.nameAddress();
		newAddress.phoneAddress();
		newAddress.addAddress();
		newAddress.cityAddress();
		newAddress.addressSubmit();
		boolean txtChecker=newAddress.cityError();
		Assert.assertEquals(txtChecker, false);
	}
	
	@Test
	public void addressProvinceTC37() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		newAddress.yourAddPage();
		newAddress.addNewAddress();
		newAddress.selectCountry();
		newAddress.nameAddress();
		newAddress.phoneAddress();
		newAddress.addAddress();
		newAddress.cityAddress();
		newAddress.selectstate();
		newAddress.addressSubmit();
		String txtChecker=newAddress.stateCheck();
		Assert.assertEquals(txtChecker, "Ontario");
	}
	
	@Test
	public void addressNoProvinceTC38() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		newAddress.yourAddPage();
		newAddress.addNewAddress();
		newAddress.selectCountry();
		newAddress.nameAddress();
		newAddress.phoneAddress();
		newAddress.addAddress();
		newAddress.cityAddress();
		newAddress.addressSubmit();
		boolean txtChecker=newAddress.stateError();
		Assert.assertEquals(txtChecker, true);
	}
	
	@Test
	public void addressNoPostalTC39() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		newAddress.yourAddPage();
		newAddress.addNewAddress();
		newAddress.selectCountry();
		newAddress.nameAddress();
		newAddress.phoneAddress();
		newAddress.addAddress();
		newAddress.cityAddress();
		newAddress.selectstate();
		newAddress.addressSubmit();
		boolean txtChecker=newAddress.postalError();
		Assert.assertEquals(txtChecker, true);
	}
	
	@Test
	public void addressPostalTC40() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		newAddress.yourAddPage();
		newAddress.addNewAddress();
		newAddress.selectCountry();
		newAddress.nameAddress();
		newAddress.phoneAddress();
		newAddress.addAddress();
		newAddress.cityAddress();
		newAddress.selectstate();
		newAddress.postalCode();
		newAddress.defaultadd();
		newAddress.gateCode();
		newAddress.deliveryInst();
		newAddress.addressSubmit();
		String txtChecker=newAddress.addSaved();
		Assert.assertEquals(txtChecker, "Address saved");
	}
	
	@Test
	public void wrongaddressTC41() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		newAddress.yourAddPage();
		newAddress.addNewAddress();
		newAddress.selectCountry();
		newAddress.nameAddress();
		newAddress.phoneAddress();
		newAddress.addAddress();
		newAddress.wrgcityAddress();
		newAddress.selectstate();
		newAddress.postalCode();
		newAddress.defaultadd();
		newAddress.gateCode();
		newAddress.deliveryInst();
		newAddress.addressSubmit();
		boolean txtChecker=newAddress.suggestedAdd();
		Assert.assertEquals(txtChecker, true);
	}
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
}
