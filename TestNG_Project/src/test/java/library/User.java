package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtils;

public class User extends AppUtils

{
	
	public void user(String empname,String uname,String pass,String cpass) throws Throwable
	{
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//input[@name=\"btnAdd\"]")).click();
		
	WebElement a= driver.findElement(By.id("systemUser_userType"));
	Select sc= new Select(a);
	sc.selectByVisibleText("Admin");
	
	driver.findElement(By.xpath("//input[@class=\"formInputText inputFormatHint ac_input\"]")).sendKeys(empname);
	driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
	//Thread.sleep(2000);
	driver.findElement(By.id("systemUser_password")).sendKeys(pass);
	//Thread.sleep(2000);
	driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(cpass);
	//Thread.sleep(2000);
	driver.findElement(By.id("btnSave")).click();
	
	}
	

}
