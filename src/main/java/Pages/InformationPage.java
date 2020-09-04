package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InformationPage {
	WebDriver driver;

	public InformationPage(	WebDriver driver) 
	{
		this.driver =driver;

	}
	
	
	public void FillMyInfo() 
	{
		
		WebElement FirstName= driver.findElement(By.id("first-name"));
		WebElement LastName= driver.findElement(By.id("last-name"));
		WebElement PostalCode= driver.findElement(By.id("postal-code"));
		WebElement ConBttn = driver.findElement(By.cssSelector("input.btn_primary.cart_button"));
		
		FirstName.sendKeys("Adel");
		LastName.sendKeys("Mohamed");
		PostalCode.sendKeys("11223");
		ConBttn.click();

	}
}
