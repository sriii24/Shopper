package launch_browser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class google_kannada2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele= driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(2000);
		
		Set<String> allwh= driver.getWindowHandles();
		ArrayList<String> l=new ArrayList<String>(allwh);
		Thread.sleep(2000);
		String allw=l.get(1);
		Thread.sleep(2000);
		driver.switchTo().window(allw);
		
		
		

	}

}
