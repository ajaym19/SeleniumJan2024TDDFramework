package com.synechron.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.synechron.pages.LoginPage;

public class LoginPageTest {

	LoginPage lp;
	
	@BeforeMethod
	public void browserSetup() {
		lp = new LoginPage();
		lp.initialization();
	}
	
	@Test
	public void validateTitleTC() {
		String exptitle= "OrangeHRM";
		String acttitle = lp.getPageTitle();
		Assert.assertEquals(acttitle, exptitle);
	}
	
	@Test
	public void validateLogin() {
		Assert.assertTrue(lp.login());
	}
	
	@AfterMethod
	public void closeBrowser() {
		lp.tearDown();
	}
	
	//TC3: validate forgotPassword link is present

}
