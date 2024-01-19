package com.synechron.pages;

import org.openqa.selenium.By;

import com.synechron.base.OrangeHRMBase;

public class LoginPage extends OrangeHRMBase {

	public String getPageTitle() {
		return driver.getTitle();
	}

	public boolean login() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		return driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
	}

}
