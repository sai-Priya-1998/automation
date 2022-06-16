package mobiles;
import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class homepage  extends browser 
{
	@Test(priority = 1)
	public void launch() throws InterruptedException, AWTException
	{
		
		WebElement var = driver.findElement(By.id("navbarDropdown"));

		Assert.assertTrue(var.isDisplayed());

		JavascriptExecutor j = (JavascriptExecutor) driver;

		j.executeScript("window.scrollBy(0,700)");

		Thread.sleep(2000);

		WebElement value = driver.findElement(By.xpath("(//a[@class='btn btn-primary '])[1]"));

		value.click();

		driver.findElement(By.id("navbarDropdown")).click();

		driver.findElement(By.linkText("Order")).click();

		Set<String> window = driver.getWindowHandles();

		List<String> list= new ArrayList<String>(window);

		driver.switchTo().window(list.get(1));


		WebElement value1 = driver.findElement(By.xpath("//h2[.='Place Your Order Here!']"));

		Assert.assertTrue(value1.isDisplayed());

		driver.switchTo().window(list.get(0));


		driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();

		driver.findElement(By.linkText("Contact Us")).click();

		driver.switchTo().window(list.get(0));

		Thread.sleep(1000);

		driver.findElement(By.xpath("//footer[@class='footer'] //a[.='Home']")).click();

		
        
		

	}

}


