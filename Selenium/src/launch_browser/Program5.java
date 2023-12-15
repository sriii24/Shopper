package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("srishtijjogi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("srishti@85");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}
