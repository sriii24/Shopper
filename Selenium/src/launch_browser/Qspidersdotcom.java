package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Qspidersdotcom {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.cssSelector("section[class='poppins']")).click();
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Hiii");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("hi.gmail.com");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("hello@123");
		driver.findElement(By.cssSelector("a[type='button']")).click();
		
		driver.findElement(By.cssSelector("a[href='/button']")).click();
		driver.findElement(By.cssSelector("button[id='btn']")).click();
		driver.findElement(By.cssSelector("button[id='btn3']")).click();
		driver.findElement(By.cssSelector("button[id='btn6']")).click();
		
		driver.findElement(By.cssSelector("a[href='/link']")).click();
	}

}
