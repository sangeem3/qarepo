package RamPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ajaxmouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramnew\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://amazon.com/");
	Actions a=new Actions(driver);
	WebElement M=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
	a.moveToElement(M).build().perform();
	a.moveToElement(driver.findElement(By.cssSelector(".nav-search-field "))).click().sendKeys(Keys.LEFT_SHIFT).sendKeys("Hello").build().perform();
			
		
	
//	System.out.println(driver.getTitle());

	}

}
