package library;

import org.openqa.selenium.By;

import utils.cwutils;

public class Cwl extends cwutils

{
	public void login(String Username,String password) throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
	}
	
	public void logout()
	{
		driver.findElement(By.xpath("//span[text()=\"CW Admin\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Logout\"]")).click();
	}
	

}
