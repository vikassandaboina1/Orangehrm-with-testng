package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.loginpage;
import utils.Apputils;

public class AdminLoginWithInvalidCredentails  extends Apputils
{
	
	@Parameters({"uid","pwd"})
	@Test
  public void checkAdminLogin(String uid, String pwd)
  {
	 loginpage lp = new loginpage();
	 lp.login(uid, pwd);
	 boolean resu =  lp.isErrorMessageDisplayed();
	 Assert.assertTrue(resu);
  }
}
