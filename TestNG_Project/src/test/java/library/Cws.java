package library;

import org.openqa.selenium.By;

import utils.cwutils;

public class Cws extends cwutils
{
	public void sales() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()=\"Sales\"]")).click();
		driver.findElement(By.linkText("Orders")).click();
		driver.findElement(By.linkText("Sales Order")).click();
		driver.findElement(By.xpath("//span[text()=\"Add New\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sales Order")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=\"Add New\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"headerTab_8B2D0E4C5EBC4221862739BE6EC58B23\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"1234 - vamshi\"]")).click();
		driver.findElement(By.xpath("(//span[text()=\"Save\"])[1]")).click();
		Thread.sleep(10000);
		//lines
		driver.findElement(By.cssSelector("div[class='ant-col ant-col-xs-0 ant-col-sm-0 ant-col-md-6 ant-col-lg-7 ant-col-xl-7 ant-col-xxl-7'] img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"lineTab_5BF7FEAF5E62492FA8AA9F6C99F0AF11\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"102939 - MAGGI MAGIC CUBES CHICKEN 40G\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"lineTab_30E30E8E59C94655AD08BFAFC3677D2D\"]")).sendKeys("2");
		driver.findElement(By.xpath("//span[text()=\"Save\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=\"Book\"]")).click();
		Thread.sleep(5000);
		
		
		// Good Shipment
		driver.findElement(By.xpath("(//span[starts-with(text(),'Actions  ')])[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Create Shipment']")).click();
		driver.findElement(By.xpath("(//span[text()=\"Yes\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class=\"ant-checkbox-input\"])[3]")).click();
		driver.findElement(By.xpath("(//input[@class=\"ant-input\"])[3]")).sendKeys("2");
		driver.findElement(By.xpath("//span[text()=\"Confirm\"]")).click();
		Thread.sleep(7000);
		
		// Invoice
		driver.findElement(By.xpath("(//span[starts-with(text(),'Actions  ')])[1]")).click();
		driver.findElement(By.xpath("//span[text()=\"Create Invoice\"]")).click();
		driver.findElement(By.xpath("(//span[text()=\"Yes\"])[2]")).click();
		driver.findElement(By.xpath("//input[@id=\"processBtnForm_invoice_date\"]")).click();
		driver.findElement(By.linkText("Today")).click();
		driver.findElement(By.xpath("(//input[@class=\"ant-checkbox-input\"])[3]")).click();
		driver.findElement(By.xpath("//input[@id=\"invoicing_qty\"]")).sendKeys("2");
		driver.findElement(By.xpath("//span[text()=\"Cancel\"]")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
	}
	

}
