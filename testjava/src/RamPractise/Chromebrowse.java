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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class Chromebrowse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramnew\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://google.com/");  
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	WebDriverWait w = new WebDriverWait(driver,30);
	w.until(ExpectedConditions.elementToBeClickable(locator));

	Connection con=DriverManager.getConnection(url, user, password)
	Statement s=con.createStatement();
}
}