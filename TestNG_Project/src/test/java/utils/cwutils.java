package utils;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class cwutils 
{
public static WebDriver driver;

   @BeforeSuite
	public static void launch()
	{
		System.setProperty("Webdriver.chromedriver","chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://ent-master-auth.mycw.in/sign-in");
	}
	
	@AfterSuite
	public static void close()
	{
		driver.close();
	}
	
	
	

}