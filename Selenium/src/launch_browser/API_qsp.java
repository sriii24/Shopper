package launch_browser;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.WrapsElement;

public class API_qsp {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//textarea[@type='search']"));
		ele.sendKeys("qspider course");
		ele.sendKeys(Keys.ENTER);
		
		WebElement ele2=driver.findElement(By.xpath("//h3[.='Courses']"));
		ele2.click();
		
	
		WebElement ele3 =driver.findElement(By.xpath("//p[.='API Testing']"));
		Point loc= ele3.getLocation();
		int x=loc.getX();
		int y=loc.getY();		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		WebElement ele4=driver.findElement(By.xpath("(//span[.='Details'])[6]"));
		Actions act=new Actions(driver);
		act.contextClick(ele4).perform();
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_T);
		Set<String> allwh= driver.getWindowHandles();
		ArrayList<String> l =new ArrayList<String>(allwh);
		String wh=l.get(1);
		driver.switchTo().window(wh);
		
		WebElement ele5=driver.findElement(By.xpath("(//div[@class='card-header'])[3]"));
		Point loc1= ele5.getLocation();
		int x1=loc.getX();
		int y1=loc.getY();		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
		
		driver.findElement(By.xpath("(//div[@class='card-header'])[3]")).click();
		
		
		Thread.sleep(2000);
	}

}
