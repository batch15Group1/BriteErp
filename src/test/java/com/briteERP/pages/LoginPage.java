package com.briteERP.pages;

import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    @FindBy(name = "login")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(className = "btn btn-primary")
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
     */
    public void loginAsPosManager() {
        userName.sendKeys(ConfigurationReader.getProperty("purchasing_manager50"));
        password.sendKeys(ConfigurationReader.getProperty("purchasing_password"));
        login.click();
    }

    /**
     * Login as eventscrmmanager user
     */
    public void loginAsEventsManager() {
        userName.sendKeys(ConfigurationReader.getProperty("event_srmmanager40"));
        password.sendKeys(ConfigurationReader.getProperty("event_password"));
        login.click();
    }

    /**
     * Login as salesmanager User
     */
    public void loginAsSalesManager() {
        userName.sendKeys(ConfigurationReader.getProperty("sales_manager30"));
        password.sendKeys(ConfigurationReader.getProperty("sales_password"));
        login.click();
    }

    /**
     * Login as expensesmanager User
     */
    public void loginAsExpensesManager() {
        userName.sendKeys(ConfigurationReader.getProperty("calendar_expmanager40"));
        password.sendKeys(ConfigurationReader.getProperty("calendar_password"));
        login.click();
    }

}





