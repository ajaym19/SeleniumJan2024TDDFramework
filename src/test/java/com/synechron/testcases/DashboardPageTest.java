package com.synechron.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.synechron.pages.DashboardPage;
import com.synechron.pages.LoginPage;

public class DashboardPageTest {
	DashboardPage dp;
	LoginPage lp;

	@BeforeMethod
	public void browserSetup() {
		lp = new LoginPage();
		dp = new DashboardPage();
		dp.initialization();
	}

	@Test
	public void validateTimeWorkSection() {
		lp.login();
		Assert.assertTrue(dp.getTimeWorkSectionLabel());
	}

	@AfterMethod
	public void closeBrowser() {
		dp.tearDown();
	}

}
