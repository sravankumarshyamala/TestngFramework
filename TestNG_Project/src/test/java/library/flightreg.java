package library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtils;

public class flightreg extends AppUtils

{
	
	public void freg(String name)
	{
		driver.findElement(By.xpath("//input[@placeholder=\"Select Date\"]")).click();
		String str="16-November-2030";
       String[] temp=str.split("-");
       String date=temp[0];
       String month=temp[1];
       String year=temp[2];
       
       String a=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
       while(!a.equals(year))
       {
    	   driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
    	   a=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
       }
       
       String b=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
       while(!b.equals(month))
       {
    	   driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
    	   b=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
       }
		
       WebElement c=driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]"));
       List<WebElement> row= c.findElements(By.tagName("tr"));
       for(int i=1;i<row.size();i++)
       {
    	  List<WebElement>col= row.get(i).findElements(By.tagName("td"));
    	  
    	  for(WebElement d:col)
    	  {
    		  String f=d.getText();
    		  if(f.equals(date))
    		  {
    			  d.click();
                  break;
    		  }
    	  }
       }
       
       WebElement s= driver.findElement(By.xpath("//select[@class=\"form-control col-md-3 search_fileds  sf2\"]"));
       Select sc= new Select(s);
       sc.selectByVisibleText("Hyderabad");
       
      WebElement s1= driver.findElement(By.xpath("//select[@class=\"form-control col-md-3 search_fileds  sf3\"]"));
      Select sc1= new Select(s1);
      sc1.selectByVisibleText("Chennai");
      
      
      driver.findElement(By.id("name")).sendKeys(name);
      driver.findElement(By.xpath("//input[@value=\"Business\"]")).click();
      driver.findElement(By.xpath("//button[text()=\"Insert Order\"]")).click();
       
		}
	
	
	

}
