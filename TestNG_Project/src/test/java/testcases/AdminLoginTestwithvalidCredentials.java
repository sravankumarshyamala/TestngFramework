package testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.Login;

//import org.testng.annotations.Test;

import utils.AppUtils;

public class AdminLoginTestwithvalidCredentials extends AppUtils
{
  @Parameters({"uid","pwd"})
  
  @Test
   
   public void login(String uid,String pwd)
   {
	   
	   Login lp= new Login();
		lp.login(uid, pwd);	
		
		boolean res = lp.admin();
		Assert.assertTrue(res);
		
	    lp.logout();
	   
   }
   
}
