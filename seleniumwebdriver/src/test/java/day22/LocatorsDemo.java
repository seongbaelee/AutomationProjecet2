package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");

		// name
//		WebElement searchBox = driver.findElement(By.name("search"));
//		searchBox.sendKeys("MacBook");

//		driver.findElement(By.name("search")).sendKeys("MacBook");

		// id
//		WebElement logo = driver.findElement(By.id("logo"));
//		boolean status = logo.isDisplayed();

//		boolean status = driver.findElement(By.id("logo")).isDisplayed();
//		System.out.println("Display status: " + status);

		// linkText & partialLinkText -- only for link
//		driver.findElement(By.linkText("Tablets")).click(); //linkText		
//		driver.findElement(By.partialLinkText("lets")).click(); //partialLinkText

		// classname
//		List<WebElement> headerLinks = driver.findElements(By.className("hidden-xs"));
//		System.out.println(headerLinks.size());

		// tagname
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println(links.size());
//		
//		List<WebElement> imgs = driver.findElements(By.tagName("img"));
//		System.out.println(imgs.size());
		
//		WebElement ele = driver.findElement(By.id("xyz")); //NoSuchElement
		List<WebElement> ele = driver.findElements(By.id("xyz")); //empty array []
		System.out.println(ele.size());
		
	}
}
