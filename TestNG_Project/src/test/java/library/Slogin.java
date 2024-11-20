package library;

import org.openqa.selenium.By;

import utils.StockUtils;

public class Slogin extends StockUtils  
{
	public void slogin(String username,String password) throws InterruptedException
	{
		//driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(username);
		//driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id=\"btnsubmit\"]")).click();
	}
	
	public void slogout()
	{
		driver.findElement(By.xpath("(//a[text()=\" Logout\"])[2]")).click();
	}
	

}
