package launch_browser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class program1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();

	}

}