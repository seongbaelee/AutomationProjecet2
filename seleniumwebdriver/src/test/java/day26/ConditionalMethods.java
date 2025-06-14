package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();

		// isDisplayed()
//		WebElement logo = driver.findElement(By.xpath("//img[contains(@alt, 'demo')]"));
//		System.out.println("Display status of logo: " + logo.isDisplayed());

//		boolean status = driver.findElement(By.xpath("//img[contains(@alt, 'demo')]")).isDisplayed();
//		System.out.println("Display status of logo: " + status);

		//isEnabled()
//		boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
//		System.out.println(status);
		
		//isSelected
		WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before selection ...");
		System.out.println(male_rd.isSelected()); //false
		System.out.println(female_rd.isSelected()); //false
		
		System.out.println("after selecting male ...");
		male_rd.click();
		System.out.println(male_rd.isSelected()); //true
		System.out.println(female_rd.isSelected()); //false
		
		System.out.println("after selecting female ...");
		female_rd.click();
		System.out.println(male_rd.isSelected()); //false
		System.out.println(female_rd.isSelected()); //true
		
		boolean newsLetterStatus = driver.findElement(By.xpath("//input[@id='gender-female']")).isSelected();
		System.out.println(newsLetterStatus);
		
	}

}
