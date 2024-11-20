package library;

import org.openqa.selenium.By;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;

import utils.AppUtils;

public class Employeelogin extends AppUtils 


{
	
	public void emplogin(String uname,String pwd)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	    driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	

	
	public void emplogout() 
	{
		driver.findElement(By.partialLinkText("Sravan")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	
	

}
