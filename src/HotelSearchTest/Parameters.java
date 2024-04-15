package HotelSearchTest;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Parameters 
{
	WebDriver driver = new ChromeDriver();
	
	String URL = "https://www.almosafer.com/en";
	
	Random rand = new Random();
	
	//EN or ER
	String[] Websites = {"https://www.almosafer.com/en" , "https://www.almosafer.com/ar"};
	int randomwebsite = rand.nextInt(Websites.length);
	
	//in english
	String [] locationsEN = {"Dubai","Jeddah","Riyadh"};
	int RandomLacationEN = rand.nextInt(locationsEN.length);
	
	//in arabic
	String [] locationsAR = {"جدة","دبي"};
	int RandomLocationAR = rand.nextInt(locationsAR.length);
	
	int visetorNumber = rand.nextInt(2);
	
	
	
}
