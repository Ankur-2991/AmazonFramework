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
import POMPackage.POMSearch;
import POMPackage.POMShipCart;
import POMPackage.POMSignIn;
import POMPackage.POMSort;
import basePackage.BaseAmazonClass;

public class ShippingCart extends BaseAmazonClass {

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
	POMShipCart cartSession;
	
	
	public ShippingCart() {
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
		cartSession=new POMShipCart();
	}
	
	@Test
	public void addtoCartTC63() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		searchSession.searchbox();
		searchSession.searchClick();
		guestSession.selectProduct();
		cartSession.addToCart();
		cartSession.cartButton();
		cartSession.shoppingCartCheck();
		cartSession.checkoutButton();
		boolean check=guestSession.checkoutPage();
		Assert.assertEquals(check, true );
	}
	
	@Test
	public void checkCartDetailTC64() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		searchSession.searchbox();
		searchSession.searchClick();
		guestSession.selectProduct();
		cartSession.addToCart();
		cartSession.cartButton();
		cartSession.shoppingCartCheck();
		boolean check=cartSession.productDetails();
		Assert.assertEquals(check, true );
	}
	
	@Test
	public void multipleQuantityTC65() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		searchSession.searchbox();
		searchSession.searchClick();
		guestSession.selectProduct();
		cartSession.addToCart();
		cartSession.cartButton();
		int initialQuant=cartSession.initialQuantity();
		//int initialprice=cartSession.initialPrice();
		cartSession.productLink();
		cartSession.addToCart();
		cartSession.cartButton();
		int newQuant=cartSession.newQuantity();
		//int newprice=cartSession.newPrice();
		
		Assert.assertEquals(initialQuant, newQuant) ;
	}
	
	@Test
	public void pricemultiQuantTC66() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		searchSession.searchbox();
		searchSession.searchClick();
		guestSession.selectProduct();
		cartSession.addToCart();
		cartSession.cartButton();
		//int initialQuant=cartSession.initialQuantity();
		int initialprice=cartSession.initialPrice();
		cartSession.productLink();
		cartSession.addToCart();
		cartSession.cartButton();
		//int newQuant=cartSession.newQuantity();
		int newprice=cartSession.newPrice();
		
		Assert.assertEquals(initialprice, newprice) ;
	}
	
	@Test
	public void diffProductsTC67() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		searchSession.searchbox();
		searchSession.searchClick();
		guestSession.selectProduct();
		cartSession.addToCart();
		cartSession.cartButton();
		searchSession.searchbox();
		searchSession.searchClick();
		cartSession.secondProd();
		cartSession.addToCart();
		cartSession.cartButton();
		int newQuant=cartSession.newProdQuant();
		int initialQuant=cartSession.oldProdQuant();
		int finalQuant= newQuant+initialQuant;
		Assert.assertEquals(finalQuant, 3) ;
		
	}
	
	
	@Test
	public void closeBrowserTC68() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		searchSession.searchbox();
		searchSession.searchClick();
		guestSession.selectProduct();
		cartSession.addToCart();
		cartSession.cartButton();
		searchSession.searchbox();
		searchSession.searchClick();
		cartSession.secondProd();
		cartSession.addToCart();
		int beforeQuantP1=cartSession.newProdQuant();
		int beforeQuantP2=cartSession.oldProdQuant();
		int beforeQuant= beforeQuantP1+beforeQuantP2;
		driver.close();
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		cartSession.homepagecartButton();
		int newQuant=cartSession.newProdQuant();
		int initialQuant=cartSession.oldProdQuant();
		int finalQuant= newQuant+initialQuant;
		Assert.assertEquals(finalQuant, beforeQuant) ;
		
	}
	
	@Test
	public void removerAllTC69() {
		session.signDrop();
		SignINSes.SignIn();
		SignINSes.SignInID();
		SignINSes.contButton();
		SignINSes.rghtPass();
		SignINSes.keepSignIn();
		SignINSes.SignButton();
		searchSession.searchbox();
		searchSession.searchClick();
		guestSession.selectProduct();
		cartSession.addToCart();
		cartSession.cartButton();
		searchSession.searchbox();
		searchSession.searchClick();
		cartSession.secondProd();
		cartSession.addToCart();
		cartSession.dltFirstProd();
		cartSession.dltSecProd();
		String emtyCart=cartSession.emptyCart();
		Assert.assertEquals(emtyCart, "Your Amazon Cart is empty.") ;
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	
}
