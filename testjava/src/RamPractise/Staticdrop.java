package RamPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramnew\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.get("http://spicejet.com/");  
	WebElement pass=driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult"));
	Select drop=new Select(pass);
	drop.selectByIndex(3);
	drop.selectByValue("6");
	
			}
}