package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
Test case
-------
1) Launch browser (chrome)
2) open URL https://demo.opencart.com/
3) Validate title should be "Your Store"
4) Close browser
*/

public class FirstTestCase {

	public static void main(String[] args) {
		// 1) Launch browser (chrome)
		WebDriver driver = new ChromeDriver();

		// 2) open URL https://demo.opencart.com/
		driver.get("https://tutorialsninja.com/demo/");

		// 3) Validate title should be "Your Store"
		String act_title = driver.getTitle();
		if(act_title.equals("Your Store")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		
		// 4) Close browser
		driver.quit();
	}

}
