package RamPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class iedriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramnew\\Desktop\\Drivers\\IEDriverServer.exe");
				WebDriver driver = new InternetExplorerDriver();
				driver.get("http://google.com");  
				System.out.println(driver.getTitle());
	}

}
