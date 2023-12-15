package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swap {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Srishti/Desktop/swap.html");
		WebElement ele1 = driver.findElement(By.id("a1"));
		WebElement ele2 = driver.findElement(By.id("a2"));
		WebElement ele3 = driver.findElement(By.id("a3"));
		Thread.sleep(2000);
		
		ele1.sendKeys(Keys.CONTROL+"a"+"x");
		ele3.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		
		ele2.sendKeys(Keys.CONTROL+"a"+"x");
		ele1.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		
		ele3.sendKeys(Keys.CONTROL+"a"+"x");
		ele2.sendKeys(Keys.CONTROL+"v");
		
		

		
	}

}
