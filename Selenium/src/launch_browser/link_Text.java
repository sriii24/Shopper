package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class link_Text {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Srishti/Desktop/qspiders3.html");
		driver.findElement(By.linkText("facebook")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();
	}

}
