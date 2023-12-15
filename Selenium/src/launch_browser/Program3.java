package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Srishti/Desktop/qspider2.html");
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.id("a1")).click();
		//driver.findElement(By.name("n1")).click();
		driver.findElement(By.className("c1")).click();
	}

}
