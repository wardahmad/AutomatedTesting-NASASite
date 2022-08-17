package lookOverNasa;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class LookOverNasa extends BaseClass {
	// public WebDriver driver;

	@Test
	public void lookOverNasa() throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\white\\Desktop\\QA\\Auto\\chromedriver14\\chromedriver.exe");
		// driver = new ChromeDriver();

		// Open URL
		driver.navigate().to("https://www.nasa.gov/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		// search------------------------------------------------------------------------------------------------------
//		driver.findElement(By.xpath("//input[@aria-hidden='false']")).sendKeys("Stars");
//		Thread.sleep(2000);
//		driver.findElement(By.id("ember23")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@href='https://www.nasa.gov/content/stars-and-galaxies/']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@href='/sun']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@id='ember160']")).click();

		// scroll down
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("scrollBy(759, 24)");
//		driver.findElement(By.xpath("//*[@id='cookie_loc']/div/a[1]")).click();
//		driver.findElement(
//				By.xpath("//article[@class='article exploring-discovering']/div[4]//img[@class='play-button']"))
//				.click();
//		Thread.sleep(5000);
//		///////////////////////////////////////////////////////////////////////////////

		// ------------------------------------E-books--------------------------------------------

		/// Mai ///
		// Downloads
		driver.findElement(By.xpath("//span[contains(.,'Downloads')]")).click();
		Thread.sleep(2000);

		// E-book
		driver.findElement(By.xpath("//a[@href='/connect/ebooks/index.html']")).click();
		Thread.sleep(2000);

		// scroll down
		JavascriptExecutor jm = (JavascriptExecutor) driver;
		jm.executeScript("scrollBy(0, 200)");

		// book
		driver.findElement(By.xpath("(//div[@class='bg-card-canvas'])[4]")).click();
		Thread.sleep(2000);

		// Nasalogo
		driver.findElement(By.xpath("//span[contains(.,'NASA Audiences')]")).click();
		Thread.sleep(2000);

		// ----------------------------------image------------------------------------------------

		// Galleries
		driver.findElement(By.xpath("//span[contains(.,'Galleries')]")).click();
		Thread.sleep(2000);

		// image of the day
		driver.findElement(By.xpath("//a[contains(.,'Image of the Day')]")).click();
		Thread.sleep(2000);

		// scroll down
		JavascriptExecutor jM = (JavascriptExecutor) driver;
		jM.executeScript("scrollBy(0,5000)");

		// More image
		driver.findElement(By.xpath("//div[contains(@id,'trending')]")).click();
		Thread.sleep(2000);

		// Nasalogo
		driver.findElement(By.xpath("//span[contains(.,'NASA Audiences')]")).click();
		Thread.sleep(2000);

		// -------------------------------------------sound-------------------------------------------
		// Downloads
		driver.findElement(By.xpath("//span[contains(.,'Downloads')]")).click();
		Thread.sleep(2000);

		// AudioandRingtones
		driver.findElement(By.xpath("//a[@href='/connect/sounds/index.html']")).click();
		Thread.sleep(2000);

		// scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 3550)");

		// sound
		driver.findElement(By.xpath("//a[@href='http://www.nasa.gov/mp3/581097main_STS-1_Dust-it-Off.mp3']")).click();
		Thread.sleep(2000);

		// Nasalogo
		// Here there is failures
		// driver.findElement(By.xpath("//span[contains(.,'NASA Audiences')]")).click();
		Thread.sleep(8000);

	}
}
