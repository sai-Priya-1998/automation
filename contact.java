package mobiles;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;




public class contact extends browser 
{
	@Test(priority = 3)
	public void contactUs() throws Throwable
	{
		driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
		driver.findElement(By.linkText("Contact Us")).click();
		Set<String> window = driver.getWindowHandles();
		List<String> list= new ArrayList<String>(window);
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		WebElement ele3 = driver.findElement(By.className("title"));
		Assert.assertTrue(ele3.isDisplayed());
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,550)");
		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("saipriya");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("saipriya@gmail.com");
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("8978674523");
		driver.findElement(By.xpath("//*[@name='message']")).sendKeys("s a i priya");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(list.get(0));
		System.out.println(driver.getTitle());
		String ele4 = driver.getTitle();
		if(ele4.equals("Mobile"))
		{
			System.out.println("Test case is successfull");
		}else {
			System.out.println("Test case is failed");
		}
	}
}

	
	
		
	


