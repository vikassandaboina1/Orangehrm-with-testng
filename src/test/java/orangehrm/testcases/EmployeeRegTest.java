package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.employee;
import orangehrm.library.loginpage;


public class EmployeeRegTest extends loginpage
{
  @Parameters({"fname","lname"})
  @Test
  public void checkEmployeeReg(String fname, String lname)
  {
	  loginpage lp = new loginpage();
	  boolean res =  lp.isAdminModuleDisplayed();
	  Assert.assertTrue(res);
	  employee emp = new employee();
	  boolean res1 =  emp.addEmployee(fname,lname);
	  Assert.assertTrue(res1);
  }
}
