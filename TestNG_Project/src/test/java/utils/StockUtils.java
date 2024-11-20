package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class StockUtils 
{
	
	public static WebDriver driver;
	public static String url="http://webapp.qedgetech.com/login.php";
	
	@BeforeSuite
	
	public static void stocklaunch()
	{
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	
	@AfterSuite
	public static void stockclose()
	{
		driver.close();
	}

}
