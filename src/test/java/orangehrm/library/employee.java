package orangehrm.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Apputils;

public class employee extends Apputils
{
public boolean  addEmployee(String fname, String lname)
{
	  driver.findElement(By.linkText("PIM")).click();
	  driver.findElement(By.linkText("Add Employee")).click();
	  driver.findElement(By.id("firstName")).sendKeys(fname);
	  driver.findElement(By.id("lastName")).sendKeys(lname);
	  String a= driver.findElement(By.id("employeeId")).getAttribute("value");
	  driver.findElement(By.id("btnSave")).click();
	  System.out.println(a);
	  driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
	  driver.findElement(By.id("empsearch_id")).sendKeys(a);
	  driver.findElement(By.id("searchBtn")).click();
	   WebElement b = driver.findElement(By.id("resultTable"));
	   List<WebElement> c = b.findElements(By.tagName("tr"));
	   boolean flag = false;
	   for(int i = 1; i<c.size();i++) 
	   {
		   List<WebElement> d= c.get(i).findElements(By.tagName("td"));
		   if(d.get(1).getText().equals(a))
		   {
			   flag = true;
			   break;
		   }   			 
	   }
	   return flag;
	
}
}
