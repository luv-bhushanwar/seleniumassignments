package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) throws InterruptedException {

		// Launch Browser
				System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
				WebDriver dr = new ChromeDriver();

				// Enter application URL
				dr.get("https://demo.actitime.com/");

				Thread.sleep(2000);

				// enter Username
				WebElement uname = dr.findElement(By.name("username"));
				Actions a = new Actions(dr);
				
				//perform right click on Username
				a.contextClick(uname).perform();
				

	}

}
