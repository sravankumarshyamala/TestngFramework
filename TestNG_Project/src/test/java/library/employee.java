package library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.AppUtils;

public class employee extends AppUtils

{
	public boolean addemployee(String fname,String Lname)
	{
      driver.findElement(By.linkText("PIM")).click();
      driver.findElement(By.linkText("Add Employee")).click();
      
      driver.findElement(By.id("firstName")).sendKeys(fname);
      driver.findElement(By.id("lastName")).sendKeys(Lname);
      String str= driver.findElement(By.id("employeeId")).getAttribute("value");
      driver.findElement(By.id("btnSave")).click();
      
      driver.findElement(By.linkText("Employee List")).click();
      driver.findElement(By.id("empsearch_id")).sendKeys(str);
      driver.findElement(By.id("searchBtn")).click();
      
      WebElement a= driver.findElement(By.id("resultTable"));
		List<WebElement>row= a.findElements(By.tagName("tr"));
		boolean res=false;
		for(int i=1;i<row.size();i++)
		{
		List<WebElement>col=row.get(i).findElements(By.tagName("td"));
		       
		       if(col.get(1).getText().equals(str))
		       {
		    	   res= true;
		    	   break;
		       }
		}
		
		return res;
		
	}
		
	}
	
	


