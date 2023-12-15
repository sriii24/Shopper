package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlemap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/ch88tyy6g"
				+ "romedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/maps");
		driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Choose starting point, or click on the map...']")).sendKeys("Bengaluru");
		//driver.findElement(By.xpath("//input[@dir='ltr' and  @placeholder='Choose destination...']")).sendKeys("Udupi");
	}

}