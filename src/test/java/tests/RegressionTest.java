package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class RegressionTest {
	
	// we will declare a webDriver interface instance globally
	public static WebDriver driver;
	
	//use TestNG annotation @BeforeClass to specify which code neede to be executed
	//before test class
	@BeforeClass
	//to pass parameter from testng.xml file to 
	//the testing annotation @Parameters
	@Parameters
	public void serupBrowser(String browser) {
		
		if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://tek-retail-ui.azurewebsites.net/selenium/checkbox");
		}else if(browser.equals("firefox"));
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/checkbox");
		
		}
		
	
//to create test in testng we need to use the testng annotation @Test
@Test
public void test1() {
	
	//provid method implementation
	driver.findElement(By.id("javaInput")).click();
	driver.findElement(By.id("javascriptInput")).click();
	driver.findElement(By.id("cSharpInput")).click();
	driver.findElement(By.id("goInput")).click();
}
	
}

