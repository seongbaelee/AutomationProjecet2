package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
//		driver.manage().window().maximize(); //maximize the browser window
		
		//tag id
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		//tag class
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
//		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");
		
		//tag attribute
//		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
//		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-shirts");
		
		//tag class attribute
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirts");
	}

}
