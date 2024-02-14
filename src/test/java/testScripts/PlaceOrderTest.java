package testScripts;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import base.TestBase;
import pages.CheckoutPage;
import pages.HomePage;
import pages.SearchResultPAge;
import pages.ShoppingCartPage;
 
public class PlaceOrderTest {
	WebDriver driver;
	HomePage homePage;
	SearchResultPAge resultPage;
	ShoppingCartPage cartPage;
	CheckoutPage chkoutPage;
	public PlaceOrderTest() {
		TestBase.initDriver();
		driver=TestBase.getDriver();
		homePage=new HomePage(driver);
		resultPage=new SearchResultPAge(driver);
		cartPage=new ShoppingCartPage(driver);
		chkoutPage=new CheckoutPage(driver);
	}
	@BeforeTest
	public void setup() {
		TestBase.openUrl("http://danube-webshop.herokuapp.com/");
	}
  @Test(priority=1)
  public void addToCartTest()
  {
	  homePage.searchItem("Parry Hotter");
	  resultPage.viewItemDetail();
	  resultPage.addToCart();
	  boolean isAdded=cartPage.isItemAdded();
	  Assert.assertTrue(isAdded);
  }
  @Test(priority=2)
  public void checkoutTest() {
	  cartPage.addCoupon();
	  cartPage.doCheckout();
  }
  
  @Test(priority=3)
  public void checkoutPageTest() {
	  chkoutPage.checkMethodTest();
	  chkoutPage.BuyButton();
  }
}