package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOrangeHRM {

	public static void main(String[] args) {

		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver dr = new ChromeDriver();

		// Enter application URL
		dr.get("https://opensource-demo.orangehrmlive.com/");

		// enter Username
		dr.findElement(By.id("txtUsername")).sendKeys("Admin");

		// enter Password
		dr.findElement(By.id("txtPassword")).sendKeys("admin123");

		// click on Login button
		dr.findElement(By.id("btnLogin")).click();

		// get the Title
		String t = dr.getTitle();
		System.out.println(t);

		// get the URL
		String u = dr.getCurrentUrl();
		System.out.println(u);

		// verify it is in Homepage
		if (t.equals("OrangeHRM")) {
			System.out.println("Test Case is Passed. \nTitle of the Homepage is: " + t);
		} else {
			System.out.println("Test Case is Failed.");
		}

		dr.close();
	}

}
