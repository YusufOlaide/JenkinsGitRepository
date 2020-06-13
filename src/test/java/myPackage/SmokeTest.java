package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SmokeTest {

			
		@Test
		public void loginTest() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("gmail.com");
			
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
			
			
			Thread.sleep(5000);
			
			driver.quit();
			
		}

	}

