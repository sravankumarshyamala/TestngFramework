package testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.Login;
import utils.AppUtils;

public class AdminLoginTestwithInvaildCredentials extends AppUtils 

{
	@Parameters({"uid","pwd"})
	@Test
	public void loginvaild(String uid,String pwd)
	{
		Login lp=new Login();
		lp.login(uid, pwd);
		
	boolean res=lp.is_err();
	Assert.assertTrue(res);
	
		
		
	}

}
