package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	
	/**
BS..........Connect data base DB
BT.........Start the ....DB 
BC-------..-Launch the browsers

BM............. Login in App 
T................Verify login in successfully 
AM.................Logout in app 

BM............. Login in App  
T................Verify home page Title 
AM...............Logout in app 

AC----------- - Close the browser 
AT------........-Delete the user in the test 

PASSED: homePageLogin
PASSED: homePageTitle

AS-----------Close the DB connections 
	 * */

	@BeforeSuite
	public void connectDataBase() {
		System.out.println("BS.....Connect data base DB");
	}

	@BeforeTest
	public void startDB() {
		System.out.println("BT.........Start the ....DB ");
	}

	@BeforeClass
	public void launchTheBrowser() {
		System.out.println("BC--------Launch the browsers ");
	}

	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM............. Login in App  ");
	}

	@Test
	public void homePageLogin() {
		System.out.println("T...Verify login in successfully ");
	}

	@Test
	public void homePageTitle() {
		System.out.println("T..........Verify home page Title ");
	}

	@AfterMethod
	public void logoutPage() {
		System.out.println("AM.................Logout in app ");
	}

	@AfterClass
	public void closeTheBrowser() {
		System.out.println("AC----------- - Close the browser ");
	}

	@AfterTest
	public void deleteUser() {
		System.out.println("AT-------Delete the user in the test ");
	}

	@AfterSuite
	public void closeTheDB() {
		System.out.println("AS-----------Close the DB connections ");
	}
}
