package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import POMPackage.POMAccount;
import POMPackage.POMLoginSecurity;
import POMPackage.POMNewAdd;
import POMPackage.POMRegPage;
import POMPackage.POMRegister;
import POMPackage.POMSignIn;
import basePackage.BaseAmazonClass;

public class LoginSecurity extends BaseAmazonClass {

	POMRegister session;
	POMRegPage regSes;
	POMSignIn SignINSes;
	POMAccount creatAccSess;
	POMNewAdd newAddress;
	POMLoginSecurity loginSecurity;
	
	public LoginSecurity() {
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
	}
	
	public void securityNameTC42() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		loginSecurity.securityPage();
		loginSecurity.nameSecurity();
		loginSecurity.newNameSecurity();
		boolean txtChecker=loginSecurity.nameChangeSucc();
		Assert.assertEquals(txtChecker, true);
	}
	
	public void securityPassTC43() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		loginSecurity.securityPage();
		loginSecurity.passSecurity();
		loginSecurity.oldpassSecurity();
		loginSecurity.newpassSecurity();
		loginSecurity.repassSecurity();
		boolean txtChecker=loginSecurity.nameChangeSucc();
		Assert.assertEquals(txtChecker, true);
	}
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
