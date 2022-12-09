package com.way2automation.pages;

import com.way2automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CustomerLoginPage extends Utility {
    By clickOnLoginTab = By.xpath("//button[contains(text(),'Customer Login')]");
    public void userClickOnLoginTab(){
        clickOnElement(clickOnLoginTab);
    }
    By clickOnYourName = By.xpath("//select[@id='userSelect']");
    public void userClickOnYourName(){
        clickOnElement(clickOnYourName);
    }
    By selectYorNameFromDropDown = By.xpath("//select[@id='userSelect']/child::*");
    public void userSelectYourNameFromDropDown(){
        List<WebElement> names = driver.findElements(selectYorNameFromDropDown);
        selectOptionsFromDropDown(names,"Hermoine Granger");
    }
    By clickOnLoginButton = By.xpath("//button[contains(text(),'Login')]");
    public void userClickOnLoginButton(){
        clickOnElement(clickOnLoginButton);
    }
    By verifyLogoutText = By.xpath("//button[@class='btn logout']");
    public String verifyLogoutMessage(){
        return getTextFromElement(verifyLogoutText);
    }
    By clickOnLogoutButton = By.xpath("//button[@class='btn logout']");
    public void userClickOnLogOutButton(){
        clickOnElement(clickOnLogoutButton);
    }
    By verifyYourNameText = By.xpath("//label[contains(text(),'Your Name :')]");
    public String verifyYourNameTextincustomerLogInPage(){
        return getTextFromElement(verifyYourNameText);
    }



}