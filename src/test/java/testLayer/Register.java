package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMPackage.POMRegister;
import basePackage.BaseAmazonClass;

public class Register extends BaseAmazonClass {

	POMRegister session;
	public Register() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
		session=new POMRegister();
	}
	@Test
	public void RegExection() {
		boolean check=session.signDrop();
		if(check==true) {
			session.clickStart();
		}
		String actual=session.H1check();
		Assert.assertEquals(actual, "Amazon Registration");
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
}
