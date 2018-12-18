package demo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
	}

}
