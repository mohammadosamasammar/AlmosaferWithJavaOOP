package HomePage;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

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
	
}
