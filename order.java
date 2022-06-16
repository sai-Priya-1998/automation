package mobiles;



import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.awt.event.KeyEvent;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class order  extends homepage
{
	@Test(priority = 3)
	public void Order() throws InterruptedException, AWTException{
	
		Set<String> window = driver.getWindowHandles();

		Iterator<String>it = window.iterator();
		Thread.sleep(2000);
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());
		driver.findElement(By.id("inputFirstName")).sendKeys("sai");
		driver.findElement(By.xpath("(//*[@id='inputFirstName'])[2]")).sendKeys("priya");
		driver.findElement(By.id("inputEmail")).sendKeys("saipriya@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("$@i123");
		driver.findElement(By.id("flexRadioDefault1")).click();
		driver.findElement(By.xpath("//*[@placeholder='00000000000']")).sendKeys("7856890011");
		driver.findElement(By.id(" address1")).sendKeys("1/a");
		driver.findElement(By.id("address2")).sendKeys("1-56, gandhi nagar");
		driver.findElement(By.id("inputCity")).sendKeys("Bangalore");
		WebElement dropdown = driver.findElement(By.id("inputState"));
		Select sle= new Select(dropdown);
		sle.selectByVisibleText("Karnataka");
		driver.findElement(By.id("inputZip")).sendKeys("5900045");
		driver.findElement(By.xpath("//*[.='Samsung']")).click();
		driver.findElement(By.cssSelector("input[placeholder='no of mobiles']")).sendKeys("1");
		WebElement dpdwn2 = driver.findElement(By.id("bought"));
		Select sle2= new Select(dpdwn2);
		sle2.selectByValue("0");
		driver.findElement(By.xpath("//*[@id='gridCheck1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@id='gridCheck1'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
	
		
		Robot ro=new Robot();
		for(int i=0;i<2;i++)
		{
		ro.keyPress(KeyEvent.VK_TAB);
		}
		ro.keyRelease(KeyEvent.VK_TAB);
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
	
		
	}

}


