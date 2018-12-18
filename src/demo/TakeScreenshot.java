package demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {

		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver dr = new ChromeDriver();

		// Enter application URL
		dr.get("https://demo.vtiger.com/");

		// typecasting
		TakesScreenshot pic = (TakesScreenshot) dr;

		// access the method and store the captured photo on RAM location
		File src = pic.getScreenshotAs(OutputType.FILE);

		// required location
		File dst = new File("./Photo/pic.jpeg");

		// copy from source to destination
		Files.copy(src, dst);

	}

}
