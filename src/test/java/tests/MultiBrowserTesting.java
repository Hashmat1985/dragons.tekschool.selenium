package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowserTesting {

	public static WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String browser) {
		// since we want to test in multiple browser, we will setup browser method for to browser
		if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://tek-retail-ui.azurewebsites.net/selenium/inputs");
		}else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://tek-retail-ui.azurewebsites.net/selenium/inputs");
		}
	}
	//we create our text
	@Test
	public void testScenario1() {
		
		//method implementation here
		driver.findElement(By.id("textInput")).sendKeys("dragons");
		
		
	}
	@Test
	public void testScenario2() {
		
		// method implementation
		driver.findElement(By.id("emailInput")).sendKeys("dragons@gmail.com");
	}
		

	}


