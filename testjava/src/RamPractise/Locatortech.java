package RamPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatortech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramnew\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.facebook.com/");  
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Hello");
	driver.findElement(By.id("pass")).sendKeys("Hello");
	driver.findElement(By.partialLinkText("Forgot")).click();
	System.out.println(driver.getTitle());
	
	
	}

}
