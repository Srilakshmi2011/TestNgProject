package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Pages.LoginPage;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
	
	
	
	@Test
	public void LoginFailiureTest() {
		
		LoginPage login = new LoginPage(driver);
		
		login.LoginFunction("abc@xyz.com","Anc@1234");
	
		WebElement errorMessage = driver.findElement(By.className("error_msg"));
		System.out.println("The error message is " + errorMessage.getText());
		
		String actMsg = errorMessage.getText();
		String expMsg = "The email or password you have entered is invalid.";
		AssertJUnit.assertEquals(actMsg,expMsg);
}
	
	@Test
	public void LoginSuccessTest() {
		
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("real@abc.com","RealPwd@1234");
	
		
        }	


     }


