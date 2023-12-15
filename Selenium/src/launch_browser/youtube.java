package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("KGF trailor");
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		driver.findElement(By.cssSelector("div[id='metadata']")).click();
		driver.close();
	}

}
