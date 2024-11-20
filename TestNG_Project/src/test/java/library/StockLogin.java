package library;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.StockUtils;

public class StockLogin extends StockUtils 

{
	@BeforeTest
	public void stocklogin() throws InterruptedException
	{
		Slogin sl= new Slogin();
		sl.slogin("admin","master");
	}
	
	@AfterTest
	public void stocklogout()
	{
		Slogin sl1= new Slogin();
		sl1.slogout();
	}

}
