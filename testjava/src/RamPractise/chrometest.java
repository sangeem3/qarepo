package RamPractise;
import java.beans.Statement;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class chrometest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramnew\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
      
	driver.get("https://www.facebook.com/");  
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ramanthan.shanmugam@gmail.com");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Sangeeram143!");
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}
}