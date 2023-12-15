package launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Hello world"))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String url2="https://www.youtube.com/";
		if(url.equals(url2))
		{
			System.out.println("url is equal");
		}
		else
		{
			System.out.println("url is not equal");
		}
	}

}
