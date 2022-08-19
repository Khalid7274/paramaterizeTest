package testCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginPageTest extends BaseClass{

	HomePage homePage;
	LoginPage loginPage;
	
	@BeforeMethod(groups={"smoke","sanity","regression"})
	public void mybeforeMethod() throws IOException {
		inicilizeDriver();
	}
	
	
	@Test(groups={"smoke","sanity","regression"})
	public void loginTest() {
		HomePage homePage=new HomePage();
		loginPage=homePage.getLogin();
		loginPage.getSignIn(prop.getProperty("email"), prop.getProperty("password"));		
	}
	
	
	@AfterMethod(groups={"smoke","sanity","regression"})
	public void tearDown() {
		driver.quit();
	}

}
