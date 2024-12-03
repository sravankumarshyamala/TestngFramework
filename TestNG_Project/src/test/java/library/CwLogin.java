package library;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.cwutils;

public class CwLogin extends cwutils

{
	@BeforeTest
	public void cwlo() throws InterruptedException
	{
		Cwl c=new Cwl();
		c.login("cw", "cw@erp");
	}
	
	@AfterTest
	public void cwlou()
	{
		Cwl c1=new Cwl();
		c1.logout();
	} 
	

}
