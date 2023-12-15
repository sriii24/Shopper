package src2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunnerScript2 extends GenericScript{
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("srishti");
	}
	@Test
	public void login2()
	{
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
