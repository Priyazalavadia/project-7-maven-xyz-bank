package com.way2automation.testsuite;

import com.way2automation.pages.*;
import com.way2automation.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    AccountPage accountPage = new AccountPage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomerPage customerPage = new CustomerPage();
    Homepage homepage = new Homepage();
    OpenAccountPage openAccountPage = new OpenAccountPage();




    @Test
    public void bankManagerShouldAddCustomerSuccessfully(){
    homepage.clickOnHomepageTab();
    bankManagerLoginPage.userClickOnBankManager();
    bankManagerLoginPage.userShouldClickOnAddCustomerButton();
    customerPage.userEnterFirstName("Hermoine");
    customerPage.userEnterLastName("Granger");
    customerPage.userEnterPostCode("HA8 5DD");
    customerPage.userClickOnAddCustomerAfterFillInForm();
    customerPage.getTextFromPopUp();
    String ExpectedMessage = "Customer added successfully with customer id :6";
    Assert.assertEquals(customerPage.getTextFromAlert(),ExpectedMessage,"No Message Displayed");
    customerPage.alertPopup();

    }
    @Test
    public void bankManagerShouldOpenAccountSuccessfully()throws InterruptedException{
        homepage.clickOnHomepageTab();
        bankManagerLoginPage.userClickOnBankManager();
        openAccountPage.userShouldClickOnOpenAccountPage();
        openAccountPage.userShouldClickOnCustomerName();
        openAccountPage.userShouldSelectCustomerNameFromDropDown();
        openAccountPage.userClickOnCurrencyButton();
        openAccountPage.selectCurrencyInPoundFromDropDown();
        openAccountPage.userClickOnProcessButton();
        customerPage.getTextFromPopUp();
        Thread.sleep(1500);
        String ExpectedMessage = "Account created successfully with account Number :1016";
        Assert.assertEquals(customerPage.getTextFromAlert(),ExpectedMessage,"No Message Displayed");
        customerPage.acceptAlert();

    }
    @Test
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException{
        homepage.clickOnHomepageTab();
        customerLoginPage.userClickOnLoginTab();
        customerLoginPage.userClickOnYourName();
        customerLoginPage.userSelectYourNameFromDropDown();
        customerLoginPage.userClickOnLoginButton();
        String expectedMessage = "Logout";
        Assert.assertEquals(customerLoginPage.verifyLogoutMessage(),expectedMessage,"No Message Displayed");
        Thread.sleep(1000);
        customerLoginPage.userClickOnLogOutButton();
        String expectedText = "Your Name :";
        Assert.assertEquals(customerLoginPage.verifyYourNameTextincustomerLogInPage(),expectedText,"No Message Displayed");

    }
    @Test
    public void customerShouldDepositMoneySuccessfully(){
        homepage.clickOnHomepageTab();
        customerLoginPage.userClickOnLoginTab();
        customerLoginPage.userClickOnYourName();
        customerLoginPage.userSelectYourNameFromDropDown();
        customerLoginPage.userClickOnLoginButton();
        accountPage.userClickOnDeposit();
        accountPage.userClickOnAmountToBeDepositedAndAdded100();
        accountPage.userClickOnDepositButton();
        String expectedText = "Deposit Successful";
        Assert.assertEquals(accountPage.userVerifyDepositSuccessFull(),expectedText,"no message displayed");


    }
    @Test
    public void customerShouldWithdrawMoneySuccessfully()throws InterruptedException{
        homepage.clickOnHomepageTab();
        customerLoginPage.userClickOnLoginTab();
        customerLoginPage.userClickOnYourName();
        customerLoginPage.userSelectYourNameFromDropDown();
        customerLoginPage.userClickOnLoginButton();
        Thread.sleep(1000);
        accountPage.userClickOnWithDrawl();
        //accountPage.selectPoundSign();
        accountPage.userClickOnAmountToBeWithDrawn50();
        accountPage.userClickOnWithdrawButton();
        Thread.sleep(2000);
        String expectedText = "Transaction successful";
        Assert.assertEquals(accountPage.verifyTransactionMessage(),expectedText,"no message displayed");


    }



    }

