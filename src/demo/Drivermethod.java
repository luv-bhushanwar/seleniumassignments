package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivermethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		String t = driver.getTitle();
		System.out.println(t);
		String url = driver.getCurrentUrl();
		System.out.println(url);
//		driver.close();
	}

}
