package com.way2automation.pages;

import com.way2automation.utility.Utility;
import org.openqa.selenium.By;

public class CustomerPage extends Utility {
    By enterFirstName = By.xpath("//input[@placeholder='First Name']");
    public void userEnterFirstName(String firstname){
        sendTextToElement(enterFirstName,firstname);
    }
    By enterLastName = By.xpath("//input[@placeholder='Last Name']");
    public void userEnterLastName(String lastName){
        sendTextToElement(enterLastName,lastName);
    }
    By enterPostCode = By.xpath("//input[@placeholder='Post Code']");
    public void userEnterPostCode(String postcode){
        sendTextToElement(enterPostCode,postcode);
    }
    By clickOnAddCustomer = By.xpath("//button[@type='submit']");
    public void userClickOnAddCustomerAfterFillInForm(){
        clickOnElement(clickOnAddCustomer);
    }

    public String getTextFromPopUp(){
        return getTextFromAlert();
    }
    public void alertPopup(){
        driver.switchTo().alert().accept();;
    }


}
