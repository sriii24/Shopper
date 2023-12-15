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

public class seleniumdev {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		WebElement we = driver.findElement(By.xpath("//span[.='Downloads']"));
		Actions act = new Actions(driver);
		act.contextClick(we).perform();
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_T);
		
		WebElement we1 = driver.findElement(By.xpath("//span[.='Documentation']"));
		Actions act1 = new Actions(driver);
		act1.contextClick(we1).perform();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_T);
		r1.keyPress(KeyEvent.VK_T);
		
		WebElement we2 = driver.findElement(By.xpath("//span[.='Projects']"));
		Actions act2 = new Actions(driver);
		act2.contextClick(we2).perform();
		Robot r2= new Robot();
		r2.keyPress(KeyEvent.VK_T);
		r2.keyPress(KeyEvent.VK_T);
		
		WebElement we3 = driver.findElement(By.xpath("//span[.='Support']"));
		Actions act3 = new Actions(driver);
		act3.contextClick(we3).perform();
		Robot r3= new Robot();
		r3.keyPress(KeyEvent.VK_T);
		r3.keyPress(KeyEvent.VK_T);
		
		WebElement we4 = driver.findElement(By.xpath("//span[.='Blog']"));
		Actions act4 = new Actions(driver);
		act3.contextClick(we4).perform();
		Robot r4= new Robot();
		r4.keyPress(KeyEvent.VK_T);
		r4.keyPress(KeyEvent.VK_T);
		
		Set<String> allwh=driver.getWindowHandles();
		ArrayList<String> l=new ArrayList<String>(allwh);
		String allw=l.get(3);
		driver.switchTo().window(allw);
		System.out.println(driver.getTitle());
		
		

	}

}
