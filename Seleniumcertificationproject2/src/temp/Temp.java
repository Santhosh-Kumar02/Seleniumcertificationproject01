package temp;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Temp {
	
	WebDriver driver;
	@Test
	public void test() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandyy\\Selenium certification\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("go ibibo opened now");
		
		//click hotels
		driver.findElement(By.xpath("//span[contains(text(),'Hotels')]")).click();
		
		//click India
		driver.findElement(By.xpath("//div[@class='SearchBlockUIstyles__HotelTypeSelectWrap-fity7j-3 hbNGIH']//div[1]//input[1]")).click();
		//enter OOTY
		driver.findElement(By.id("downshift-1-input")).sendKeys("OOTY");
		Thread.sleep(3000);
		//Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);

		
		//Checkin calendar
		driver.findElement(By.xpath("//div[@data-testid=\"openCheckinCalendar\"]//h4")).click();
		driver.findElement(By.xpath("//div[@class='dcalendarstyles__MonthChangeRightArrowDiv-r2jz2t-16 fKhSuo']//div[@class='dcalendarstyles__SliderArrow-r2jz2t-14 hOuIUr']")).click();
		driver.findElement(By.xpath("//div[@class='dcalendarstyles__MonthChangeRightArrowDiv-r2jz2t-16 fKhSuo']//div[@class='dcalendarstyles__SliderArrow-r2jz2t-14 hOuIUr']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		
		
		//checkout calendar
		driver.findElement(By.xpath("//div[@data-testid='openCheckoutCalendar']//h4")).click();
		driver.findElement(By.xpath("//div[@data-testid='openCheckoutCalendar']//h4")).click();
		driver.findElement(By.xpath("//ul[@class='dcalendarstyles__DateWrapDiv-r2jz2t-7 jXPZCe']//li[5]//span")).click();
		
		//select 1 guest
		driver.findElement(By.xpath("//div[@class='SearchBlockUIstyles__SearchInputWrap-fity7j-11 kQVDaW']//input[@class='SearchBlockUIstyles__CitySearchInput-fity7j-12 gPhhhX']")).click();
		driver.findElement(By.xpath("//div[@class='SearchBlockUIstyles__AutoSuggestInnerWrap-fity7j-1 eTLsVu']//div[2]//div[1]//span[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
		
		//click search hotels
		driver.findElement(By.xpath("//button[normalize-space()='Search Hotels']")).click();
		
		driver.quit();
	}
	
}
