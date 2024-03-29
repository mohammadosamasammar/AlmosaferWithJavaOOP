package HomePage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

import dev.failsafe.internal.util.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Parameters 
{

	WebDriver driver = new ChromeDriver();
	
	String URLen = "https://www.almosafer.com/en";
	//lang
	String expecedLang = ("en");
	//currency
	String expectedCurrency = "SAR";
	//phone number
	String expectedPhoneNum = "+966554400000";
	
	
}
