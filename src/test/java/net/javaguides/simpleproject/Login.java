package net.javaguides.simpleproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

//import org.junit.Assert;


public class Login {
	public static void main(String[] args) {

	    // Create an instance of the driver

	    //WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.firefox.marionette", "./geckodriver.exe");
	    //System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver","D://geckodriver-v0.24.0-win64/geckodriver.exe");
	    //DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	    //capabilities.setCapability("marionette", true);
	    //WebDriver driver = new MarionetteDriver(); 
	    //FirefoxOptions options = new FirefoxOptions();
	    //options.setLogLevel(FirefoxDriverLogLevel.DEBUG);
	    
		/*
		 * WebDriver driver = new FirefoxDriver(options); String url =
		 * "https://www.google.com/"; driver.get(url);
		 * driver.findElement(By.id("identifierId")).sendKeys("madhuvmsn@gmail.com");
		 * driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		 * driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 * driver.findElement(By.id("recoveryIdentifierId")).sendKeys("9731331451");
		 * driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		 */
	   // Navigate to a web page

	    //driver.get("https://www.google.com/");
	    //driver.quit();

	    // Perform actions on HTML elements, entering text and submitting the form

	    //WebElement usernameElement     = driver.findElement(By.name("username"));

	    //WebElement passwordElement     = driver.findElement(By.name("password"));

	    //WebElement formElement        = driver.findElement(By.id("loginForm"));

	 
	    //usernameElement.sendKeys("Alan Smithee");

	    //passwordElement.sendKeys("twilightZone");
	    
	

	    //passwordElement.submit(); // submit by text input element

	    //formElement.submit();        // submit by form element

	
	 

	    // Anticipate web browser response, with an explicit wait

	    //WebDriverWait wait = new WebDriverWait(driver, 10);

	    //WebElement messageElement = wait.until(

	           //ExpectedConditions.presenceOfElementLocated(By.id("loginResponse"))

	           // );

	 

	    // Run a test

	   // String message                 = messageElement.getText();

	    //String successMsg             = "Welcome to foo. You logged in successfully.";

	    //Assert.assertEquals (message, successMsg);

	 

	    // Conclude a test

	    //driver.quit();

	 

	  }

	}



