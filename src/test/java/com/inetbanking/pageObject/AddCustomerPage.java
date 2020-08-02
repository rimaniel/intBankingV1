package com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	WebDriver ldriver;
public AddCustomerPage(WebDriver rdriver) {
	
 ldriver = rdriver;
 PageFactory.initElements(rdriver, this );
	
}
@FindBy(how=How.XPATH,using="/html/body/div[3]/div/ul/li[2]/a")
WebElement lnkAddNewCustomer;

@FindBy(how=How.NAME,using="name")
WebElement txtCustomerName;

@FindBy(how = How.NAME , using = "rad1")
WebElement rGender;

@FindBy(how = How.ID_OR_NAME,using="dob")
WebElement txtdob;
@FindBy(how = How.NAME,using = "addr")
WebElement txtAddress;

@FindBy(how = How.NAME , using = "city")
WebElement txtCity;

@FindBy(how = How.NAME , using = "state")
WebElement txstate;

@FindBy(how = How.NAME , using = "pinno")
WebElement txTPIN;

@FindBy(how = How.NAME , using = "telephoneno")
WebElement TXTPhoneNumber;

@FindBy(how = How.NAME , using = "emailid")
WebElement TxtEmailaddress;

@FindBy(how = How.NAME , using = "password")
WebElement TxtPassword;

@FindBy(how = How.NAME , using = "sub")
WebElement btnSubmit;


public void clickAddNewCustomer() {
	lnkAddNewCustomer.click();
}
public void custName(String cname) {
	txtCustomerName.sendKeys(cname);
}
public void custgender(String cgender) {
	rGender.click();
}
public void custdob(String mm,String dd, String yy) {
	txtdob.sendKeys(mm);
	txtdob.sendKeys(dd);
	txtdob.sendKeys(yy);
}
public void custadress(String caddress) {
	txtAddress.sendKeys(caddress);
}
public void   custcity(String ccity) {
	txtCity.sendKeys(ccity);
	
}
public void custstate(String cstate) {
	txstate.sendKeys(cstate);
}
public void custpinno(String cpinno) {
	txTPIN.sendKeys(String.valueOf(cpinno));
	
}
public void custelephonenu(String ctelephonenu) {
	TXTPhoneNumber.sendKeys(ctelephonenu);
}
public void custemailed(String cemailed) {
	TxtEmailaddress.sendKeys(cemailed);
	
}
public void custePassword(String cpassword) {
	TxtPassword.sendKeys(cpassword);
	
}

public void custsubmit () {
	btnSubmit.click();
}




}
