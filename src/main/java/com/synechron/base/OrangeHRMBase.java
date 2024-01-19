package com.synechron.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRMBase {
	public static WebDriver driver;
	public static Properties prop;

	public void initialization() {
		loadProperyFile();
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		}else if (browsername.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
	}

	public void tearDown() {
		driver.close();
	}
	
	public void loadProperyFile() {
		String propfilepath = "./src/main/java/com/synechron/config/config.properties";
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(propfilepath);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
