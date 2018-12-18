package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginActiTime {

	public static void main(String[] args) throws InterruptedException {

		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver dr = new ChromeDriver();

		// Enter application URL
		dr.get("https://demo.actitime.com/");

		Thread.sleep(2000);

		// enter Username
		dr.findElement(By.name("username")).sendKeys("admin");

		Thread.sleep(2000);

		// enter Password
		dr.findElement(By.name("pwd")).sendKeys("manager");

		Thread.sleep(2000);

		// click on Login button
		dr.findElement(By.xpath("//div[.='Login ']")).click();

		Thread.sleep(2000);

		// get the Title
		String t = dr.getTitle();

		Thread.sleep(2000);

		System.out.println(t);

		Thread.sleep(2000);

		// get the URL
		System.out.println(dr.getCurrentUrl());

		Thread.sleep(2000);

		// verify it is in Homepage
		if (t.equals("actiTIME - Enter Time-Track")) {
			
			Thread.sleep(2000);
			System.out.println("Test Case is Passed. \nTitle of the Homepage is: " + "'"+t+"'");

		}
		else {

			System.out.println("Test Case is Failed.");

		}

		dr.close();
	}
}
