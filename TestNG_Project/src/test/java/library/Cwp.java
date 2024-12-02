package library;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

import utils.cwutils;

public class Cwp extends cwutils
{
	public void purchase() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()=\"Purchase\"]")).click();
		driver.findElement(By.linkText("Orders")).click();
		driver.findElement(By.linkText("Purchase Order")).click();
		driver.findElement(By.xpath("//span[text()=\"Add New\"]")).click();
		Thread.sleep(2000);
		
		// supplier drop down
		driver.findElement(By.xpath("//input[@id='headerTab_9B8D684D9D6340BDB1C1665FDEF9D810']")).click();
		Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@id='headerTab_9B8D684D9D6340BDB1C1665FDEF9D810']"));
		driver.findElement(By.xpath("//div[text()='D001 - S J']")).click();
		//Select sc = new Select(a);
		//sc.selectByVisibleText("D001- S J");
		//Thread.sleep(2000);
		
		/* supplier addresses
		driver.findElement(By.xpath("//input[@id=\"headerTab_C52D2B62DA794C1480228699BC39D009\"]")).click();
		WebElement b=driver.findElement(By.xpath("//input[@id=\"headerTab_C52D2B62DA794C1480228699BC39D009\"]"));
		Select sc1=new Select(b);
		sc1.selectByVisibleText("1, 2, , Telangana, India");
		
		//payment terms
		driver.findElement(By.xpath("//input[@id=\"headerTab_48DFDB66892741B3A8AE4D361454F43F\"]")).click();
		WebElement c=driver.findElement(By.xpath("//input[@id=\"headerTab_48DFDB66892741B3A8AE4D361454F43F\"]"));
		Select sc2=new Select(c);
		sc2.selectByVisibleText("Immediate");
		
		// price list
		
		driver.findElement(By.xpath("//input[@id=\"headerTab_2466B04BCED24C04AE6FE5EF5FAD5FE4\"]")).click();
		WebElement d=driver.findElement(By.xpath("//input[@id=\"headerTab_2466B04BCED24C04AE6FE5EF5FAD5FE4\"]"));
		Select sc3=new Select(d);
		sc3.selectByVisibleText("Purchase Price List Incl Tax"); */
		
		driver.findElement(By.xpath("(//span[text()=\"Save\"])[1]")).click();
		
		
		
		
		
		
		
	}

}
