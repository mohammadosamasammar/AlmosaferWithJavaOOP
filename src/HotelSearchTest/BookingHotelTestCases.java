package HotelSearchTest;

import java.time.Duration;

import javax.swing.plaf.basic.BasicArrowButton;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookingHotelTestCases extends Parameters
{
	@BeforeTest
	public void beforetest() throws InterruptedException 
	{
//	driver.get(URL);
	driver.get(Websites[randomwebsite]);
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	WebElement popMSG = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div"));
	if(popMSG.isDisplayed()) 
	{
		WebElement SARButton = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/button[1]"));
		Thread.sleep(1000);
		SARButton.click();}
	}
	
	@Test (priority = 1 , description = "the 1st test for select random hotel in random city")
	public void RandomlySelectHotelInRandomCity() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement HotelTap = driver.findElement(By.id("uncontrolled-tab-example-tab-hotels"));
		HotelTap.click();
		Thread.sleep(2000);
		WebElement SearchField = driver.findElement(By.xpath("//input[@data-testid='AutoCompleteInput']"));
		Thread.sleep(2000);    
		if(driver.getCurrentUrl().contains("en"))          
		{
			SearchField.sendKeys(locationsEN[RandomLacationEN]);
			WebElement ResultsList = driver.findElement(By.xpath("//ul[@data-testid='AutoCompleteResultsList']"));      
			Thread.sleep(1000);
			ResultsList.findElements(By.tagName("li")).get(1).click();
		}               
		else
		{
			SearchField.sendKeys(locationsAR[RandomLocationAR]);
			WebElement ResultsList = driver.findElement(By.xpath("//ul[@data-testid='AutoCompleteResultsList']"));      
			Thread.sleep(1000);
			ResultsList.findElements(By.tagName("li")).get(1).click();
		}
	
	
	}
	@Test(priority = 2 , description = "the 2st test for select random number of visetor")
	public void RandomlySeIectNumberOfVistor() throws InterruptedException
	{
		WebElement SelectVisetorNumber = driver.findElement(By.xpath("//select[@data-testid='HotelSearchBox__ReservationSelect_Select']"));    
		Select selctor = new Select(SelectVisetorNumber);
		Thread.sleep(2000);
		selctor.selectByIndex(visetorNumber);
		
		
	}
	
	@Test(priority = 3 , description = "the 3st test for click on search hotels button")
	public void ClickOnSearchHotelsButton () throws InterruptedException
	{
		WebElement SearchButton = driver.findElement(By.xpath("//button[@data-testid='HotelSearchBox__SearchButton']"));
		Thread.sleep(2000);
		SearchButton.click();    
		
	}
	
	
	
	
	
	
	
	
}
