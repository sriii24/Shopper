package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class dummy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("HII");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Hello");
		driver.findElement(By.name("login")).click(); 
		
		
	}

}
