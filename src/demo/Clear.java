package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {

		// launch Browser
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();

		// enter application URL
		dr.get("https://demo.vtiger.com/");

		Thread.sleep(2000);

		// enter Username
		WebElement uName = dr.findElement(By.id("username"));
		String SK = "admin";
		uName.sendKeys(SK);

		Thread.sleep(2000);

		// clear the data
		uName.clear();

		Thread.sleep(2000);

		// enter Password
		WebElement pwd = dr.findElement(By.id("password"));
		pwd.sendKeys(SK);

		Thread.sleep(2000);

		// clear the data
		pwd.clear();

		Thread.sleep(2000);

		// close the Browser
		dr.close();

	}

}
