package org.automation.element_repository;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import LearningDataDrivenTesting.DataUtility;

public class ExampleOfUsingPomClass {
	public static void main(String[] args) throws IOException {
		DataUtility data_utility = new DataUtility();
		//		Step 1: launching browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(data_utility.getDataFromPropertiesFile("url"));

		//	Step 2 : Clicking on login button
		HomePage home_page = new HomePage(driver);
		home_page.getLoginLink().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login","Login page not displayed");
		Reporter.log("Login page is displayed",true);
		//		Step 3: Performing login
		LoginPage login_page = new LoginPage(driver);
		login_page.getEmailTextField().sendKeys(data_utility.getDataFromPropertiesFile("email"));
		login_page.getPasswordTxtField().sendKeys(data_utility.getDataFromPropertiesFile("pwd"));
		login_page.getLoginButton().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop","Home page not displayed");
		Reporter.log("Home page is displayed",true);

		home_page.getLogoutLink().click();

	}

}
