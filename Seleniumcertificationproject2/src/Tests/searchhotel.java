package Tests;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.Searchhotelpom;

public class searchhotel {
	
	@Test public void searchhotel() throws AWTException
 {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();  
		Searchhotelpom hot = new Searchhotelpom(driver);
 hot.enterhotel();
 hot.entercountry();
 hot.locationname("OOTY");
 hot.checkin();
 hot.checkout();
 hot.selectguestroom();
 hot.searchhot();
 }
  
  
  
  
}
