package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMPackage.POMCreateAcc;
import basePackage.BaseAmazonClass;

public class CreateAcc extends BaseAmazonClass{
	
	POMCreateAcc sess;
	public CreateAcc() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
		sess=new POMCreateAcc();
	}
	@Test
	public void Title() {
		String actual=sess.verify();
		Assert.assertEquals(actual, "Amazon.com. Spend less. Smile more.");
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
}
