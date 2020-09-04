package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

	WebDriver driver;
	
	public CartPage (WebDriver driver) {
		this.driver =driver;
	}
	
	
	public boolean ItemAddedInTheCart() {
		WebElement Item = driver.findElement(By.cssSelector("div.cart_item"));
		return Item.isDisplayed();
	}
	
	
	public void ClickOnCheckout() {
		
		WebElement checkOut = driver.findElement(By.cssSelector("a.btn_action.checkout_button"));
		checkOut.click();
	}
}
