package src2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunnerScript extends GenericScript{
	@Test
	public void validlogin()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
	}
	

}
