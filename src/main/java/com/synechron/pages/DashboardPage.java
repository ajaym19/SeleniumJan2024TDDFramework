package com.synechron.pages;

import org.openqa.selenium.By;

import com.synechron.base.OrangeHRMBase;

public class DashboardPage extends OrangeHRMBase{

	public boolean getTimeWorkSectionLabel() {
		return driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
	}

}
