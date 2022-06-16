package mobiles;
	
	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;


	public class browser {
	WebDriver driver;
	@Test
	public void Lanching_browser() {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net");
	driver.manage().window().maximize();


	}}



