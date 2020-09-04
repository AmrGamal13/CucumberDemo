package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	
	
	public void LoginToSauceDemoApp() 
	{
		WebElement userName_Txt= driver.findElement(By.id("user-name"));
		WebElement password_Txt= driver.findElement(By.id("password"));
		WebElement Login_Bttn= driver.findElement(By.id("login-button"));
		
		userName_Txt.sendKeys("standard_user");
		password_Txt.sendKeys("secret_sauce");
		Login_Bttn.click();

		
		

	}
	
}
