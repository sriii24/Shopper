package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		WebElement women = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(women).perform();
	}
}
