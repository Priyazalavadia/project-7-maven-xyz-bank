package com.way2automation.pages;

import com.way2automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OpenAccountPage extends Utility {

    By openAccountPage = By.xpath("//div[@class='border box padT20 ng-scope']/descendant::button[2]");
    public void userShouldClickOnOpenAccountPage(){
        clickOnElement(openAccountPage);
    }
    By clickOnSelectCustomerName = By.id("userSelect");
    public void userShouldClickOnCustomerName(){
        clickOnElement(clickOnSelectCustomerName);
    }
    By selectCustomerNameFromDropDown = By.xpath("//form[@role='form']/child::div[1]/select/child::*");
    public void userShouldSelectCustomerNameFromDropDown(){
        List<WebElement> lists = driver.findElements(selectCustomerNameFromDropDown);
        for (WebElement list:lists){
        if (list.getText().equals("Hermoine Granger")){
            list.click();
            break;
        }
            
        }
    }
    By clickOnCurrencyButton = By.xpath("//select[@id='currency']");
    public void userClickOnCurrencyButton(){
        clickOnElement(clickOnCurrencyButton);
    }
    By selectCurrencyInPound = By.xpath("//select[@id='currency']/child::*");
    public void selectCurrencyInPoundFromDropDown(){
        List<WebElement> lists = driver.findElements(selectCurrencyInPound);
        selectOptionsFromDropDown(lists,"Pound");
    }
    By clickOnProcessButton = By.xpath("//button[contains(text(),'Process')]");
    public void userClickOnProcessButton(){
        clickOnElement(clickOnProcessButton);
    }


}
