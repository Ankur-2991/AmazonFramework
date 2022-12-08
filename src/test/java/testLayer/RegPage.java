package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMPackage.POMRegPage;
import POMPackage.POMRegister;
import basePackage.BaseAmazonClass;

public class RegPage extends BaseAmazonClass {
	
	POMRegister session;
	POMRegPage regSes;
	public RegPage() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
		session=new POMRegister();
		regSes=new POMRegPage();
	}
	@Test
	public void RegExectionTC1() {
		boolean check=session.signDrop();
		if(check==true) {
			session.clickStart();
		}
		String actual=session.H1check();
		Assert.assertEquals(actual, "Amazon Registration");
	}
	
	@Test
	public void RegNameTC2() {
		session.signDrop();
		session.clickStart();
		regSes.RegName();
		regSes.regCust();
		boolean nameErr=regSes.NameErr();
		Assert.assertEquals(nameErr, false);
	}
	
	@Test
	public void RegNameTC3() {
		session.signDrop();
		session.clickStart();
		regSes.clearName();
		regSes.regCust();
		boolean nameErr=regSes.NameErr();
		Assert.assertEquals(nameErr, true);
	}
	
	@Test
	public void RegMobTC4() {
		session.signDrop();
		session.clickStart();
		regSes.RegName();
		regSes.RegMob();
		regSes.regCust();
		boolean mobErr=regSes.MobErr();
		Assert.assertEquals(mobErr, false);
	}
	
	@Test
	public void RegMobTC5() {
		session.signDrop();
		session.clickStart();
		regSes.RegName();
		regSes.clearMob();
		regSes.regCust();
		boolean mobErr=regSes.MobErr();
		Assert.assertEquals(mobErr, true);
	}
	
	@Test
	public void RegPartialMobTC6() {
		session.signDrop();
		session.clickStart();
		regSes.RegName();
		regSes.RegPartialMob();
		regSes.RegPass();
		//regSes.regCust();
		String contText=regSes.contText();
		Assert.assertEquals(contText, "Verify mobile number");
	}
	
	@Test
	public void RegPartialEmailTC7() {
		session.signDrop();
		session.clickStart();
		regSes.RegName();
		regSes.RegPartialEmail();
		regSes.RegPass();
		//regSes.regCust();
		String contText=regSes.contText();
		Assert.assertEquals(contText, "Verify email");
	}
	
	@Test
	public void RegFullEmailTC8() {
		session.signDrop();
		session.clickStart();
		regSes.RegName();
		regSes.RegEmail();
		regSes.RegPass();
		//regSes.regCust();
		String contText=regSes.contText();
		Assert.assertEquals(contText, "Verify email");
	}
	
	@Test
	public void RegPassTC9() {
		session.signDrop();
		session.clickStart();
		regSes.RegName();
		regSes.RegEmail();
		regSes.RegPass();
		regSes.regCust();
		boolean passErr=regSes.PassErr();
		Assert.assertEquals(passErr, false);
	}
	
	@Test
	public void RegrePassTC10() {
		session.signDrop();
		session.clickStart();
		regSes.RegName();
		regSes.RegEmail();
		regSes.RegPass();
		regSes.RegrePass();
		regSes.regCust();
		boolean repassCheck=regSes.rePassErr();
		Assert.assertEquals(repassCheck, false);
	}
	
	@Test
	public void RegrePassTC11() {
		session.signDrop();
		session.clickStart();
		regSes.RegName();
		regSes.RegEmail();
		regSes.RegPass();
		regSes.wrongRegrePass();
		regSes.regCust();
		boolean repassCheck=regSes.rePassErr();
		Assert.assertEquals(repassCheck, true);
	}
	
	@Test
	public void ReturningCustTC12() {
		session.signDrop();
		session.clickStart();
		regSes.RegName();
		regSes.RegEmail();
		regSes.RegPass();
		regSes.RegrePass();
		regSes.regCust();
		String rtrnCustCheck=regSes.returnCust();
		Assert.assertEquals(rtrnCustCheck, "Email address already in use");
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
