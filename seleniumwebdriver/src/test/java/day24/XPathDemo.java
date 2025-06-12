package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		//Xpath with single attribute
//		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T-Shorts");
		
		//Xpath with multiple attributes
//		driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-Shorts");
		
		//Xpath with 'and' 'or' operators
//		driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("T-Shorts");
//		driver.findElement(By.xpath("//input[@name='search' or @placeholder='search2']")).sendKeys("T-Shorts");
		
		//Xpath with text() - inner text
//		driver.findElement(By.xpath("//a[text()='MacBook']")).click();
//		boolean displaystatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
//		System.out.println(displaystatus);
//		String value = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
//		System.out.println(value);
		
		//Xpath with contains()
//		driver.findElement(By.xpath("//*[contains(@placeholder, 'Sea')]")).sendKeys("T-Shorts");
		
		//Xpath with contains() + text()
//		boolean status = driver.findElement(By.xpath("//*[contains(text(),'fox')]")).isDisplayed();
//		System.out.println(status);
		
		//Xpath with starts-with()
//		driver.findElement(By.xpath("//*[starts-with(@placeholder, 'Sea')]")).sendKeys("T-Shorts");
		
		
		//Chained Xpath
		boolean status = driver.findElement(By.xpath("//div[@id='logo']/h1/a")).isDisplayed();
		System.out.println(status);
		
	}

}
