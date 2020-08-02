package com.inetbanking.testCases;

import java.io.File;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.intebanking.utilities.ReadConfig;

import net.bytebuddy.utility.RandomString;


public class BaseClass {
	
	ReadConfig readConfig = new ReadConfig();

	public String baseURL = readConfig.getApplicationUrl();
	public String username = readConfig.getUserName();
	public String password = readConfig.getPassword();
	public static WebDriver driver ;
	
	public static Logger logger;
	@Parameters("browser")
	@BeforeMethod
	
	public void setup(String br) {
		
		 logger = Logger.getLogger("ebanking");
	     PropertyConfigurator.configure("log4j.properties");
	     
	     
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",readConfig.getChromeDriver());
        driver = new ChromeDriver();
	}else if(br.equals("FireFox")) {
		System.setProperty("webdriver.gecko.driver",readConfig.getFireFoxDriver());
		driver = new FirefoxDriver();

	}
		driver.get(baseURL);  
        
	}
	public void captureScreenshot(WebDriver driver,String tname) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"//ScreenShot//"+tname+".png");
		
	}
	
public String randomestring() {
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return generatedstring;
		}

public String randomeNum() {
	String generatedstring2=RandomStringUtils.randomNumeric(4);
	return generatedstring2;
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
