package launch_browser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		a.accept();
		
		Thread.sleep(2000);
		a.accept();

	}

}
