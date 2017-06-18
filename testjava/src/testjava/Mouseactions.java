package testjava;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouseactions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("http://google.com");
Actions a=new Actions(driver);
a.moveToElement(driver.findElement(By.id("cid_id"))).click().build().perform();
a.keyDown(Keys.CONTROL).keyDown(Keys.END).build().perform();
File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcfile, new File("c:\\Users\\Ramnew\\Desktop\\screen.png"));
	}

}
