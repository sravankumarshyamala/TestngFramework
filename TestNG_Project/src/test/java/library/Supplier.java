package library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.StockUtils;

public class Supplier extends StockUtils 

{
	
	public void stocksupp(String suppliername,String add,String city,String country,String contactperson,String phone,String email,String mobile,String Note) throws InterruptedException
	{
		driver.findElement(By.xpath("(//a[text()=\"Suppliers\"])[2]")).click();
		driver.findElement(By.xpath("(//span[@class=\"glyphicon glyphicon-plus ewIcon\"])[1]")).click();
		String suppnum=driver.findElement(By.xpath("//input[@id=\"x_Supplier_Number\"]")).getAttribute("value");
		driver.findElement(By.xpath("//input[@id=\"x_Supplier_Name\"]")).sendKeys(suppliername);
		driver.findElement(By.xpath("//textarea[@id=\"x_Address\"]")).sendKeys(add);
		driver.findElement(By.xpath("//input[@id=\"x_City\"]")).sendKeys(city);
		driver.findElement(By.xpath("//input[@id=\"x_Country\"]")).sendKeys(country);
		driver.findElement(By.xpath("//input[@id=\"x_Contact_Person\"]")).sendKeys(contactperson);
		driver.findElement(By.xpath("//input[@id=\"x_Phone_Number\"]")).sendKeys(phone);
		driver.findElement(By.xpath("//input[@id=\"x__Email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id=\"x_Mobile_Number\"]")).sendKeys(mobile);
		driver.findElement(By.xpath("//textarea[@id=\"x_Notes\"]")).sendKeys(Note);
		driver.findElement(By.xpath("(//button[text()=\"Add\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"OK!\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()=\"OK\"])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-caption=\"Search\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"psearch\"]")).sendKeys(suppnum);
		driver.findElement(By.xpath("(//button[text()=\"Search\"])[1]")).click();
		
		// table
		WebElement a=driver.findElement(By.xpath("//table[@class=\"table ewTable\"]"));
		List<WebElement> row = a.findElements(By.tagName("tr"));
		for(int i=1; i<row.size(); i++)
		{
			List<WebElement> col =row.get(i).findElements(By.tagName("td"));
			for(WebElement b: col)
			{
			String d=b.getText();
			
			if(d.equalsIgnoreCase(suppnum))
			{
				System.out.println(d);
			}
			}
		}
		
		
	}

}
