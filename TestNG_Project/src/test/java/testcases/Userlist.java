package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.AdminLogin;
import library.User;

public class Userlist extends AdminLogin

{
	@Parameters({"empname","uname","pass","cpass"})
	@Test
	public void Userreg(String empname,String uname,String pass, String cpass) throws Throwable
	{
		User b= new User();
		b.user(empname, uname, pass, cpass);
		
	}
	
}
