package library;

//import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.AppUtils;

public class AdminLogin extends AppUtils

{
	Login lp;
	
	@BeforeTest
	public void login()
	{
		lp= new Login();
		lp.login("Admin","Qedge123!@#");
	}
	
	
	
	@AfterTest
	public void logout()
	{
		lp.logout();
	}

	
	
	
	
	
	
}
