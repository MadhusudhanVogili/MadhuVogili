package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.Home_Page;

import pageObjects.LogIn_Page;

import utility.ExcelUtils;

// Now this method does not need any arguments

public class SignIn_Action {
	public static void Execute(WebDriver driver, String sUserName, String sPassword) throws Exception{
		
		 
		 //This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method
		 
		 //String sUserName = ExcelUtils.getCellData(1, 1);
		 
		 //String sPassword = ExcelUtils.getCellData(1, 2);
		
	
				 
	     Home_Page.lnk_MyAccount(driver);
	     
	     Home_Page.click();

		 LogIn_Page.txtbx_UserName(driver);
		 LogIn_Page.sendKeys(sUserName);
		 
		 LogIn_Page.txtbx_Password(driver);
		 LogIn_Page.sendKeys(sPassword);
		 
		 LogIn_Page.btn_LogIn(driver);
		 LogIn_Page.click();
		 
		        }
		 
		}
