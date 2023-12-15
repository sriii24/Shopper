package src2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScript2 {
		public WebDriver driver;
		@BeforeMethod
		public void openAppln()
		{
			System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			String title=driver.getTitle();
			Assert.assertEquals(title, "Facebook - log in or sign up");
			System.out.println("1");
		}
		@AfterMethod
		public void closeAppln()
		{
			driver.close();
		}
		
}
