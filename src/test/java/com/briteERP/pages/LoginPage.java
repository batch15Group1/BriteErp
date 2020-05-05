package com.briteERP.pages;

import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{
    @FindBy(name = "login")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(css = "[class='btn btn-primary']")
    private WebElement login;

    @FindBy(css = "a[href='/web/reset_password?']")
    private WebElement resetPassword;

    @FindBy(css = "a[href='/web/signup?']")
    private WebElement dontHaveAnAccount;


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**
     * This is for different user login credentials
     *
     * @param userValue     accepts a user email
     * @param passwordValue accepts a password
     */
    public void login(String userValue, String passwordValue) {
        userName.sendKeys(userValue);
        password.sendKeys(passwordValue);
        login.click();
    }


    /**
     * Login as posmanager user
       Can access Purchasing and POS module
     */
    public void loginAsPosManager() {
        wait.until(ExpectedConditions.visibilityOf(userName)).sendKeys(ConfigurationReader.getProperty("purchasing_manager50"));
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(ConfigurationReader.getProperty("purchasing_password"));
        login.click();
    }

    /**
     * Login as eventscrmmanager user
       Can access Event and CRM module
     */
    public void loginAsEvents_CRM_Manager() {
        userName.sendKeys(ConfigurationReader.getProperty("events_crm_manager40"));
        password.sendKeys(ConfigurationReader.getProperty("events_crm_password"));
        login.click();
    }

    /**
     * Login as salesmanager User
       Can access Sales module
     */
    public void loginAsSalesManager() {
        userName.sendKeys(ConfigurationReader.getProperty("sales_manager30"));
        password.sendKeys(ConfigurationReader.getProperty("sales_password"));
        login.click();
    }

    /**
     * Login as expensesmanager User
       Can access Expenses module
     */
    public void loginAsExpensesManager() {
        userName.sendKeys(ConfigurationReader.getProperty("expenses_manager40"));
        password.sendKeys(ConfigurationReader.getProperty("expenses_password"));
        login.click();
    }
    
     /**
     * Login as inventoryManager User
       Can access Inventory module
     */
    public void loginAsInventoryManager() {
        userName.sendKeys(ConfigurationReader.getProperty("inventory_manager20"));
        password.sendKeys(ConfigurationReader.getProperty("inventory_password"));
        login.click();
    }
    
    

}





