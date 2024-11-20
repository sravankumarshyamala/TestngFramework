package library;

import org.openqa.selenium.By;

import utils.AppUtils;

public class flogin extends AppUtils

{
	public void login(String uname,String pwd)
	{
	driver.findElement(By.name("email")).sendKeys(uname);
	driver.findElement(By.name("password")).sendKeys(pwd);
	driver.findElement(By.xpath("//button[text()=\"Sign In\"]")).click();
	}
	
	
	public void logout()
	{
		driver.findElement(By.xpath("//i[@class=\"fa fa-gear\"]")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	
}
