package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	@FindBy(id="s-name")
	WebElement name;
	
	@FindBy(id="s-surname")
	WebElement surname;
	
	@FindBy(id="s-address")
	WebElement address;
	
	@FindBy(id="s-zipcode")
	WebElement zipcode;
	
	@FindBy(id="s-city")
	WebElement city;
	
	@FindBy(id="s-company")
	WebElement company;
	
	@FindBy(xpath="//button[text()='Buy']")
	WebElement buyBtnClick;
	
	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void checkMethodTest() {
		name.sendKeys("tamil");
		surname.sendKeys("K A");
		address.sendKeys("jsdnjsnfkdfk");
		zipcode.sendKeys("636119");
		city.sendKeys("Chennai");
		company.sendKeys("Zuci Systems");
	
	}
	
	public void BuyButton()
	{
		buyBtnClick.click();
	}

}
