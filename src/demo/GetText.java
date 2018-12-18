package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		
		// Launch Browser
				System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
				WebDriver dr = new ChromeDriver();

				// Enter application URL
				dr.get("https://demo.actitime.com/");
				
				WebElement ele = dr.findElement(By.id("headerContainer"));
				String str = ele.getText();
				
				System.out.println(str);
				
//				ele.sendKeys(Keys.);
	}

}
