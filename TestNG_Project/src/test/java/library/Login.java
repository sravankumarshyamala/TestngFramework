package library;

import org.openqa.selenium.By;

import utils.AppUtils;

public class Login extends AppUtils 
{
	
	
	public void login(String uid, String pwd)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	
	public boolean admin()
	{
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean is_err()
	{
		String errmsg = driver.findElement(By.id("spanMessage")).getText().toLowerCase();
		if(errmsg.contains("invalid") || errmsg.contains("empty"))
		{
			return true;
		}else
		{
			return false;
		}

	}
	
	
   public void logout()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	
	
	
	

}
