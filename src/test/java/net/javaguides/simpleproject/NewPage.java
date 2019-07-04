package net.javaguides.simpleproject;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
//import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

///import java.util.concurrent.TimeUnit;

import org.junit.Assert;


public class NewPage {
	public static void main(String[] args) {

	    // Create an instance of the driver


		System.setProperty("webdriver.gecko.driver","D://geckodriver-v0.24.0-win64//geckodriver.exe");
	      
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://github.com");
	    //driver.quit();

	    // Perform actions on HTML elements, entering text and submitting the form

	    WebElement usernameElement     = driver.findElement(By.id("user[login]"));

	    WebElement emailElement     = driver.findElement(By.id("user[email]"));
	    
	    WebElement passwordElement     = driver.findElement(By.id("user[password]"));

	    WebElement formElement        = driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div/div/div[2]/div/form/button"));

	 
	    usernameElement.sendKeys("madhusudhanvogili2");

	    emailElement.sendKeys("sudhanvmsn@gmail.com");
	    
	    passwordElement.sendKeys("MPNL2@gvvssm");

	    formElement.submit();        // submit by form element

	    // Anticipate web browser response, with an explicit wait

	    WebDriverWait wait = new WebDriverWait(driver, 10);

	    WebElement messageElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("FunCAPTCHA")));

	    // Run a test

	    
	   String message                 = messageElement.getText();

	    //String successMsg             = "Welcome to foo. You logged in successfully.";

	    //Assert.assertEquals (message, successMsg);

	    Assert.assertNotNull(message);
	    System.out.println("Successfully opened the website www.github.com.com"); 
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


	    // Conclude a test

	    driver.quit();

	    
	}
}


