package com.inetbanking.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.AddCustomerPage;
import com.inetbanking.pageObject.LoginPage;


public class TC_AddCustomerTest_003 extends BaseClass {
	@Test
	 public void addNewCustomer() throws InterruptedException {
		LoginPage lp = new LoginPage(driver) ;
		 lp.setUserName(username);
		 lp.setPassword(password);
		 lp.ClickSubmit();
		 Thread.sleep(3000);
		 
		 AddCustomerPage addcust = new  AddCustomerPage(driver);
		 addcust.clickAddNewCustomer();
		 addcust.custName("rim");
		 addcust.custgender("female");
		 addcust.custdob("10", "15","1985");
		 Thread.sleep(3000);
		 addcust.custadress("nyc");
		 addcust.custcity("nyc");
		 addcust.custstate("usa");
		 addcust.custpinno("1233309");
		 addcust.custelephonenu("1276287591");
		 
		 String email = randomestring()+"@gmail.com";
		 addcust.custemailed(email);
		 addcust.custePassword("h1234");
		 boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		 if (res==true) {
			 Assert.assertTrue(true);
			 
		 }else {
			 captureScreenshot(driver, "addNewCustomer");
			 Assert.assertTrue(false);
			 
		 }
	}
	
	
			 
			 
			 
			 
			 
			 
			 
			 
			 
			
			 }
	


