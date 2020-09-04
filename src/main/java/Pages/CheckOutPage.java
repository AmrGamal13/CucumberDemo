package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
	
	WebDriver driver;
	
	public CheckOutPage(WebDriver driver) 
	{
		this.driver =driver;
	}
	
	
	public void ClickOnFinish() 
	{	
		WebElement finish_Bttn = driver.findElement(By.cssSelector("a.btn_action.cart_button"));
		finish_Bttn.click();
	}

	
	public String GetSuccessfullMessage() {
		WebElement message = driver.findElement(By.cssSelector("h2.complete-header"));
		String SuccessMessage = message.getText();
		return SuccessMessage;
	}
}
