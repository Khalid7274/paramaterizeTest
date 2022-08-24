package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseClass.BaseClass;

public class GoogleTest extends BaseClass{
	public static WebDriver driver;
	
	@Test
	public void openBrowser() {
	driver.get("https://www.google.com/");
	}
}
