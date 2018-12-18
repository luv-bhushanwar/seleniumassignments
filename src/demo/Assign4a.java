package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign4a {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver dr = new ChromeDriver();

		// Enter application URL
		dr.get("https://login.yahoo.com/account/create?src=fpctx&intl=sg&lang=en-SG&done=https%3A%2F%2Fsg.yahoo.com&specId=yidReg");

		WebElement month = dr.findElement(By.name("mm"));

		Select sel = new Select(month);
		List<WebElement> we = sel.getOptions();
		int itemCount = we.size();
		System.out.println(itemCount);

		ArrayList<String> a = new ArrayList<String>();

		for (int l = 0; l < itemCount; l++) {
			String text = we.get(l).getText();
			System.out.println(text);
			a.add(text);
		}

		System.out.println("After sorting: ");
		Collections.sort(a);

		for (String c : a) {
			System.out.println(c);
		}

	}

}
