package HomePage;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTestCases extends Parameters
{
	@BeforeTest     
	public void beforetest() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get(URLen);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		Thread.sleep(2000);
		WebElement popMSG = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div"));
		if (popMSG.isDisplayed())
		{
			
			WebElement SARButton = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/button[1]"));
			Thread.sleep(2000);
			SARButton.click();
			
		}	
		
	}
	
	@Test (priority = 1 , description = " the 1st test for check the default language is english ")
	public void CheckTheDefaultLangaugeEN() throws InterruptedException 
	{
		Thread.sleep(2000);
		String actualLang = driver.findElement(By.tagName("html")).getAttribute("lang");
		assertEquals(actualLang, expecedLang);
	}
	
	@Test (priority = 2 , description = " the 2st test for check the default currency is SAR ")
	public void CheckTheDefultCurrency () throws InterruptedException 
	{
		Thread.sleep(2000);
		String actualCurrency = driver.findElement(By.xpath("//button[@data-testid='Header__CurrencySelector']")).getText();
		assertEquals(actualCurrency, expectedCurrency);
		
	}
	
	@Test (priority = 3 , description = " the 3st test for check the default phone number is +966554400000 ")
	public void CheckTheDefultContactNum () throws InterruptedException 
	{
		Thread.sleep(2000);
		String actualNumber = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[2]/strong")).getText();
		assertEquals(actualNumber, expectedPhoneNum);
		
	}
	
	@Test (priority = 4 , description = " the 4st test for check the qitaf logo is displayed")
	public void CheckQitafLogoIsDisplayed () throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement QitafLogo = driver.findElement(By.className("bxRSiR"));
		boolean ActualLogo = QitafLogo.isDisplayed();
		assertEquals(ActualLogo, true );   
		
		
	}
	
	@Test(priority = 5 , description = " the 5st test for check the hotel tap is not selected")
	public void CheckHotelTapIsNotSelected() throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement HotelTap = driver.findElement(By.id("uncontrolled-tab-example-tab-hotels"));
		String ActualHotelTap = HotelTap.getAttribute("aria-selected");
		assertEquals(ActualHotelTap, ExpectedHotelTap);
		
		
	}
	
	@Test(priority = 6 , description = " the 6st test for check the Flight Departure and Flight Return")
	public void checkDepatureAndReturnDate () 
	{
		
		LocalDate today =  LocalDate.now();     
		
		int ExpectedDepartureDate = today.plusDays(1).getDayOfMonth();
		int ExpectedReturnDate = today.plusDays(2).getDayOfMonth();
		
		String ActualDepatureDateOnTheWebSite = driver.findElement(By.cssSelector("span[class='sc-cPuPxo LiroG']")).getText();
		int ActuaIDepatureDateOnTheWebsiteAsNumber = Integer.parseInt(ActualDepatureDateOnTheWebSite);
		
		String ActualReturnDateOnTheWebSite = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[3]/div/div/div/div[2]/span[2]")).getText();
		int ActualReturnDateOnTheWebSiteAsNumber = Integer.parseInt(ActualReturnDateOnTheWebSite);
		
		//departure date
		assertEquals(ExpectedDepartureDate, ActuaIDepatureDateOnTheWebsiteAsNumber);
		//return date
		assertEquals(ExpectedReturnDate, ActualReturnDateOnTheWebSiteAsNumber);
	}
	                   
}    
