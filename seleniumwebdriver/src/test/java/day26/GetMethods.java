package day26;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		// get(url) - opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// getTitle - returns title of the page
//		System.out.println(driver.getTitle());

		// getCurrentUrl() - returns URL of the page
//		System.out.println(driver.getCurrentUrl());

		// getPageSource() - returns source code of the page
//		System.out.println(driver.getPageSource());

		// getWindowHandle() - returns ID of the single Browser window
//		System.out.println("Window ID: " + driver.getWindowHandle());

		// getWindowHandles() - returns ID's of the single Browser windows
		Thread.sleep(1000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // This will open new browser window
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println(windowIds);

		List<String> al = new ArrayList<String>(windowIds);
		System.out.println(al);
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[contains(text(), 'Ok, thanks!')]")).click();
		driver.close();

	}

}
