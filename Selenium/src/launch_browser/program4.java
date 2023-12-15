package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Srishti/Desktop/qspiders3.html");
		Thread.sleep(2000);
		//driver.findElement(By.tagName("input")).sendKeys("srishti");
		//driver.findElement(By.id("a1")).sendKeys("Srishti");
		//driver.findElement(By.name("n1")).sendKeys("Srishti");
		//driver.findElement(By.className("c1")).sendKeys("Srishti");
		

		
	}

}
