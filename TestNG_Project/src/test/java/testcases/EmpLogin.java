package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.Employeelogin;

public class EmpLogin extends Employeelogin

{
	@Parameters({"uname","pwd"})
	@Test
	public void emp(String uname,String pwd)
	{
		System.out.println(uname);
		System.out.println(pwd);
		Employeelogin e= new Employeelogin();
	       e.emplogin(uname,pwd);
	}

}
