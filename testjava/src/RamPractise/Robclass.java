package RamPractise;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Robclass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramnew\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ramanthan.shanmugam@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//content[@class='CwaK9']//span[@class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nathan123!");
		driver.findElement(By.xpath("//content[@class='CwaK9']//span[@class='RveJvd snByac']")).click();
		System.out.println("User successfully logged into " + driver.getTitle() + " Account");
		Thread.sleep(15000);
		driver.findElement(By.cssSelector(".T-I.J-J5-Ji.T-I-KE.L3.T-I-JW")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#:ph")).click();
		
		StringSelection ss=new StringSelection("d:\\testdata");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		Robot rb= new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		
		

	}

}
