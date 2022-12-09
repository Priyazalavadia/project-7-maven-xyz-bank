package com.way2automation.pages;

import com.way2automation.utility.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    By clickOnBankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    public void userClickOnBankManager(){
        clickOnElement(clickOnBankManagerLogin);
    }
    By clickOnAddCustomer = By.xpath("//button[contains(text(),'Add Customer')]");
    public void userShouldClickOnAddCustomerButton(){
        clickOnElement(clickOnAddCustomer);
    }

}
