package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
//	driver.findElement(By.name("q")).sendKeys("LTI");
//	driver.findElement(By.id("gsr")).click();
	driver.findElement(By.linkText("Helping people stay safe in times of crisis")).click();
}

}
