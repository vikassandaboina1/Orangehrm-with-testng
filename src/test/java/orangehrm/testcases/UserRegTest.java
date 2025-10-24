package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.User;
import orangehrm.library.loginpage;

public class UserRegTest extends loginpage 
{
	
	@Parameters({"role","employeename","username","password"})
	@Test
	public void userRegTest(String role, String employeename, String username, String password)
	{
		User us = new User();
		boolean res =  us.adduser(role,  employeename, username,  password);
		Assert.assertTrue(res);
		
	}

}
