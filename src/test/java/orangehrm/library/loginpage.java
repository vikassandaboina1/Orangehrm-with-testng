package orangehrm.library;



import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utils.Apputils;

public class loginpage extends Apputils
{
    @Parameters({"uid","pwd"})
	@BeforeTest
public void login(String uid,String pwd)
{
	driver.findElement(By.id("txtUsername")).sendKeys(uid);
	driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	driver.findElement(By.id("btnLogin")).click();
}
public boolean isAdminModuleDisplayed()
{
	 {
	    return driver.findElement(By.id("menu_admin_viewAdminModule")).isDisplayed();
	}

}
 @AfterTest
  public void logOut()
  {
	 driver.findElement(By.partialLinkText("Welcome")).click();
	 driver.findElement(By.linkText("Logout")).click();
  
}

public boolean isErrorMessageDisplayed() {
    String errmsg = driver.findElement(By.id("spanMessage")).getText().toLowerCase();
    return errmsg.contains("invalid") || errmsg.contains("empty");
}


public boolean isEmployeeModuleDisplayed()
{
	try {
		driver.findElement(By.linkText("Admin")).isDisplayed();
		return false;
	} catch (Exception e) {
		return true;
	}
}
}


	


