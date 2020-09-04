package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pages.CartPage;
import Pages.CheckOutPage;
import Pages.InformationPage;
import Pages.Inventory;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PlaceAnOrder {
	WebDriver driver;
	LoginPage logObj;
	Inventory inObj;
	CartPage carObj;
	InformationPage infObj;
	CheckOutPage checObj;
	
	@Given("User is logged in the application")
	public void user_is_logged_in_the_application() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		logObj = new LoginPage(driver);
		logObj.LoginToSauceDemoApp();

	}

	@When("I add my item to the cart")
	public void i_add_my_item_to_the_cart() throws InterruptedException {
		inObj = new Inventory(driver);
		inObj.SelectFirstItem();
		inObj.ClickOnCart();
	}

	@Then("Item is displayed in the cart")
	public void item_is_displayed_in_the_cart() {
		
		carObj = new CartPage(driver);
		Assert.assertTrue(carObj.ItemAddedInTheCart());
		carObj.ClickOnCheckout();
	}

	@Then("Getting a successfull message when I place the order")
	public void getting_a_successfull_message_when_I_place_the_order() {
		infObj = new InformationPage(driver);
		checObj = new CheckOutPage(driver);
		
		infObj.FillMyInfo();
		checObj.ClickOnFinish();
		
		String message = checObj.GetSuccessfullMessage();
		Assert.assertEquals(message, "THANK YOU FOR YOUR ORDER");
		
	}


}
