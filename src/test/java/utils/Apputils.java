package utils;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;


public class Apputils {
	public  static void add() {
		
	}
	public static  WebDriver driver; 
    public static  String Url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
	
    @BeforeSuite
	public static void launchApp()
	{
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
     driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(Url);
	
	 
		
	}
	@AfterSuite
	public static void closeApp()
	{
		driver.close();
	
		
		
	}
	
	

}
