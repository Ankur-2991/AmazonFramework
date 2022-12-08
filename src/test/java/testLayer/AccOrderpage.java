package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMPackage.POMAccount;
import POMPackage.POMRegPage;
import POMPackage.POMRegister;
import POMPackage.POMSignIn;
import basePackage.BaseAmazonClass;

public class AccOrderpage extends BaseAmazonClass{
	
	POMRegister session;
	POMRegPage regSes;
	POMSignIn SignINSes;
	POMAccount creatAccSess;
	public AccOrderpage() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
		session=new POMRegister();
		regSes=new POMRegPage();
		SignINSes=new POMSignIn();
		creatAccSess=new POMAccount();
	}
	
	
	@Test
	public void accPageTC20() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		String txtChecker=creatAccSess.AccpageCheck();
		Assert.assertEquals(txtChecker, "Your Account");		
	}
	
	@Test
	public void ordPageTC20() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		creatAccSess.ordPage();	
		String txtChecker=creatAccSess.ordpageCheck();
		Assert.assertEquals(txtChecker, "Your Orders");
	}
	
	@Test
	public void ordFiltyearTC21() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		creatAccSess.ordPage();	
		creatAccSess.ordFilterYear();
		String txtChecker=creatAccSess.filtCheck();
		Assert.assertEquals(txtChecker, "2022");
	}
	
	@Test
	public void ordFiltArchTC22() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		creatAccSess.ordPage();	
		creatAccSess.ordFilterArch();
		String txtChecker=creatAccSess.archCheck();
		Assert.assertEquals(txtChecker, "Archived Orders");
	}
	
	@Test
	public void buyAgainTC23() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		creatAccSess.ordPage();	
		creatAccSess.buyAgainPage();
		boolean txtChecker=creatAccSess.buyAgainCheck();
		Assert.assertEquals(txtChecker, true);
	}
	
	@Test
	public void cancelOrdTC25() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		creatAccSess.ordPage();	
		creatAccSess.cancelordPage();
		boolean txtChecker=creatAccSess.cancelOrdCheck();
		Assert.assertEquals(txtChecker, true);
	}
	
	@Test
	public void notShippedTC24() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		creatAccSess.dropdown();
		creatAccSess.clickAcc();
		creatAccSess.ordPage();	
		creatAccSess.notShipPage();
		boolean txtChecker=creatAccSess.notshipCheck();
		Assert.assertEquals(txtChecker, true);
	}
	
	
	@AfterMethod
	public void close() {
		//driver.close();
	}
	
}
