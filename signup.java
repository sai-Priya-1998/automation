package mobiles;


	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.testng.annotations.Test;

	public class signup extends browser {
		@Test(priority = 4)
		public void Sigup() throws InterruptedException {
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.findElement(By.xpath("//a[.='Sign up']")).click();
			WebElement fristname = driver.findElement(By.xpath("//input[@id='myName']"));
			fristname.sendKeys("sai");			
			WebElement Last_name = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
			Last_name.sendKeys("priya");
			WebElement Email = driver.findElement(By.xpath("//input[@type='Email']"));
			Email.sendKeys("sai123@gmail.com");
			WebElement password = driver.findElement(By.xpath("//input[@type='Password']"));			
			password.sendKeys("saipriya@123");
			WebElement Phone_number = driver.findElement(By.xpath("//input[@type='number']"));
			Phone_number.sendKeys("8978674523");
			driver.findElement(By.xpath("//input[@type='radio']")).click();
			WebElement bio_story = driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']"));
			bio_story.sendKeys("be good do good");
			driver.findElement(By.xpath("//input[@type='date']")).click();
			driver.findElement(By.xpath("//button[@type='Submit']")).click();
			Alert Al = driver.switchTo().alert();
			Al.accept();
			Thread.sleep(1000);
			WebElement user_name = driver.findElement(By.xpath("//input[@id='username']"));
			user_name.click();
			user_name.sendKeys("sai123@gmail.com");
			WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
			Password.click();
			Password.sendKeys("$@i123");
			driver.findElement(By.xpath("//a[text()='Log In']")).click();
			Thread.sleep(2000);
		}
	}


