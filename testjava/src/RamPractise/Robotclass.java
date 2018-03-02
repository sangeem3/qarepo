package RamPractise;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class Robotclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramnew\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://mail.google.com/mail/u/0/#inbox");
	driver.findElement(By.cssSelector(".T-I.J-J5-Ji.T-I-KE.L3.T-I-JW")).click();
	
		
	}
	
	}
