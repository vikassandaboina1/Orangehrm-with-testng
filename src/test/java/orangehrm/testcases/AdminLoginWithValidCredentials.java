package orangehrm.testcases;


import org.testng.Assert;

import org.testng.annotations.Test;


import orangehrm.library.loginpage;


public class AdminLoginWithValidCredentials extends loginpage {
	
	
	
	@Test
	public void adminLogin()
	{
	  loginpage lp = new loginpage();
	  boolean res =  lp.isAdminModuleDisplayed();
	  Assert.assertTrue(res);
	  
	  

	  
	   
	}

}
