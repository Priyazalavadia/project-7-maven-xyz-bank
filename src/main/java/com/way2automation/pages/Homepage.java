package com.way2automation.pages;

import com.way2automation.utility.Utility;
import org.openqa.selenium.By;

public class Homepage extends Utility {

    By homepageTab = By.xpath("//button[contains(text(),'Home')]");


    public void clickOnHomepageTab(){
        clickOnElement(homepageTab);

    }
}
