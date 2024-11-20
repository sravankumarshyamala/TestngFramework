package library;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.AppUtils;

public class flightlogin extends AppUtils

{
	flogin f;
	@BeforeTest
	public void login()
	{
		 f= new flogin();
		f.login("sravankumar.shamala@gmail.com", "Sravan@1234");
	}
	
	@AfterTest 
	public void logout()
	{
		f.logout();
	}
	
	

}
