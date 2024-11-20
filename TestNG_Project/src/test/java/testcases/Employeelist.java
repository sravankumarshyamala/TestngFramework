package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.AdminLogin;
import library.employee;

public class Employeelist extends AdminLogin

{
	@Parameters({"fname","Lname"})
	@Test
	public void employeereg(String fname,String Lname)
	{
		employee e= new employee();
		e.addemployee(fname,Lname);
				
	}
	
	

}
