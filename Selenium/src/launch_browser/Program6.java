package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("srishti");
		driver.findElement(By.name("password")).sendKeys("sri");
		Thread.sleep(2000);
		driver.findElement(By.className("\"_acan _acap _acas _aj1-\"")).click();
		

	}

}
