package HomePage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

import dev.failsafe.internal.util.Assert;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Parameters 
{

	WebDriver driver = new ChromeDriver();
	
	String URLen = "https://www.almosafer.com/en";
	//lang
	String expecedEnglishLang = ("en");  
	String expectedArabicLang = ("ar");
	//currency
	String expectedCurrency = "SAR";    
	//phone number
	String expectedPhoneNum = "+966554400000";
	//hotel tap
	String ExpectedHotelTap = ("false");    
	
	Random rand = new Random();
	
	String[] Websites = {"https://www.almosafer.com/en" , "https://www.almosafer.com/ar"};
	int randomwebsite = rand.nextInt(Websites.length);
	
	
	
}
