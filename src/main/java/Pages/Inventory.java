package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Inventory {

	WebDriver driver;

	public Inventory(WebDriver driver) 
	{	
		this.driver = driver;
	}

	public void SelectFirstItem() throws InterruptedException 
	{

		List<WebElement> x = driver.findElements(By.cssSelector("div.inventory_item"));
		for (int i = 0; i < x.size(); i++) {
			Thread.sleep(1000);
			if (i==0) {
				i++;
				WebElement AddToCart = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));
				AddToCart.click();
				break;
			}
		}
	}


	public void ClickOnCart () {

		WebElement Cart = driver.findElement(By.cssSelector("a.shopping_cart_link.fa-layers.fa-fw"));
		Cart.click();
	}
}
