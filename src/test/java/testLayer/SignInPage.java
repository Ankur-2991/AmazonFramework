package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMPackage.POMRegPage;
import POMPackage.POMRegister;
import POMPackage.POMSignIn;
import basePackage.BaseAmazonClass;

public class SignInPage extends BaseAmazonClass{
	
	POMRegister session;
	POMRegPage regSes;
	POMSignIn SignINSes;
	public SignInPage() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
		session=new POMRegister();
		regSes=new POMRegPage();
		SignINSes=new POMSignIn();
	}
	
	@Test
	public void SignInPageTC13() {
		session.signDrop();
		SignINSes.SignIn();
		String signPageH1=SignINSes.SignInH1();
		Assert.assertEquals(signPageH1, "Sign in");
	}
	
	@Test
	public void SignInIDTC14() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.wrongSignInID();
		SignINSes.contButton();
		boolean wrngEmailErr=SignINSes.SignInErr();
		Assert.assertEquals(wrngEmailErr, true);
	}
	
	@Test
	public void rightIDTC15() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		boolean checkPass=SignINSes.checkPass();
		Assert.assertEquals(checkPass, true);
	}
	
	@Test
	public void wrngmobTC16() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.wrongMob();
		SignINSes.contButton();
		boolean wrngEmailErr=SignINSes.SignInErr();
		Assert.assertEquals(wrngEmailErr, true);
	}
	
	@Test
	public void rgtMobTC17() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.corrMob();
		SignINSes.contButton();
		boolean checkPass=SignINSes.checkPass();
		Assert.assertEquals(checkPass, true);
	}
	
	@Test
	public void wrngpassTC18() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.corrMob();
		SignINSes.contButton();
		SignINSes.wrngPass();
		SignINSes.SignButton();
		boolean wrngEmailErr=SignINSes.SignInErr();
		Assert.assertEquals(wrngEmailErr, true);
	}
	
	@Test
	public void rghtpassTC19() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		String helloVerify=SignINSes.helloTxt();
		Assert.assertEquals(helloVerify, "Hello, Ankur");
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
