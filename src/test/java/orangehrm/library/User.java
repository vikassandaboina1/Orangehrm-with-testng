package orangehrm.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class User extends loginpage {
	
	
	public boolean  adduser(String role, String employeename,  String username, String password) 
	{
	 driver.findElement(By.linkText("Admin")).click();
	 driver.findElement(By.linkText("User Management")).click();
	 driver.findElement(By.linkText("Users")).click();
     driver.findElement(By.id("btnAdd")).click();
     driver.findElement(By.id("systemUser_userType")).sendKeys(role);
     driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(employeename);
     driver.findElement(By.id("systemUser_userName")).sendKeys(username);
     driver.findElement(By.id("systemUser_password")).sendKeys( password);
     driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(password);
     driver.findElement(By.id("btnSave")).click();
      WebElement tablename =  driver.findElement(By.id("resultTable"));
      List<WebElement>  rows =tablename.findElements(By.tagName("tr"));
      boolean userexist = false;
      for(int i =1 ; i<rows.size();i++)
      {
    	   List<WebElement>  columns =  rows.get(i).findElements(By.tagName("td"));
    	   if(columns.get(1).getText().equalsIgnoreCase(username))
    	   {
    		   userexist = true;
    		   break;
    	   }
    	   
      }
      
      return userexist	;
    		
     

	 
	}

}


