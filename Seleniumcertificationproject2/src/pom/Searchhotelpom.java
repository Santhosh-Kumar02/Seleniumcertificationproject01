package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Searchhotelpom {

	
	WebDriver driver;
	
	By hotel=By.xpath("//span[contains(text(),'Hotels')]");
	By country=By.xpath("//div[@class='SearchBlockUIstyles__HotelTypeSelectWrap-fity7j-3 hbNGIH']//div[1]//input[1]");
	By locname=By.id("downshift-1-input");
	
	By checkincal = By.xpath("//div[@data-testid='openCheckinCalendar']//h4");
	By calnavigate = By.xpath("//div[@class='dcalendarstyles__MonthChangeRightArrowDiv-r2jz2t-16 fKhSuo']//div[@class='dcalendarstyles__SliderArrow-r2jz2t-14 hOuIUr']");
	By Checkindate = By.xpath("//span[normalize-space()='2']");
	
	By checkoutcal = By.xpath("//div[@data-testid='openCheckoutCalendar']//h4");
	By Checkoutdate = By.xpath("//ul[@class='dcalendarstyles__DateWrapDiv-r2jz2t-7 jXPZCe']//li[5]//span");
	
	By guestrooms = By.xpath("//div[@class='SearchBlockUIstyles__SearchInputWrap-fity7j-11 kQVDaW']//input[@class='SearchBlockUIstyles__CitySearchInput-fity7j-12 gPhhhX']");
	By Selectguest = By.xpath("//div[@class='SearchBlockUIstyles__AutoSuggestInnerWrap-fity7j-1 eTLsVu']//div[2]//div[1]//span[1]");
	By Confirmguest = By.xpath("//button[contains(text(),'Done')]");

	By Searchhotel = By.xpath("//button[normalize-space()='Search Hotels']");

	public Searchhotelpom (WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterhotel(){
		driver.findElement(hotel).click();
	}
	public void entercountry()
	{
	driver.findElement(country).click();	
	}
	public void locationname(String LOC) throws AWTException
	{
		driver.findElement(locname).sendKeys(LOC);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void checkin()
	{
		driver.findElement(checkincal).click();
		driver.findElement(calnavigate).click();
		driver.findElement(calnavigate).click();
		driver.findElement(Checkindate).click();
	}
	
	public void checkout()
	{
		//driver.findElement(checkoutcal).click();
		//driver.findElement(checkoutcal).click();
		driver.findElement(Checkoutdate).click();
	}
	public void selectguestroom() {
		driver.findElement(guestrooms).click();
		driver.findElement(Selectguest).click();
		driver.findElement(Confirmguest).click();
	}
	
	public void searchhot() {
		driver.findElement(Searchhotel).click();
	}
	
}
