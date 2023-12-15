package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class qspider {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/dragDrop?sublist=0");
		Thread.sleep(1000);
		WebElement src=driver.findElement(By.xpath("//div[.='Mobile Charger']"));
		WebElement dst=driver.findElement(By.xpath("(//div[.='Mobile Accessories'])[1]"));
		
		WebElement src1=driver.findElement(By.xpath("//div[.='Laptop Charger']"));
		WebElement dst1=driver.findElement(By.xpath("(//div[.='Laptop Accessories'])[1]"));
		
		WebElement src2=driver.findElement(By.xpath("//div[.='Mobile Cover']"));
		WebElement dst2=driver.findElement(By.xpath("(//div[.='Mobile Accessories'])[1]"));
		
		WebElement src3=driver.findElement(By.xpath("//div[.='Laptop Cover']"));
		WebElement dst3=driver.findElement(By.xpath("(//div[.='Laptop Accessories'])[1]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dst).perform();
		act.dragAndDrop(src1, dst1).perform();
		act.dragAndDrop(src2, dst2).perform();
		act.dragAndDrop(src3, dst3).perform();
		
		driver.findElement(By.xpath("//section[.='Keyboard Actions']")).click();
		driver.findElement(By.xpath("//section[.='Keyboard']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("srishti@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("srishti@gmail.com");
		driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("srishti@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
}

}
