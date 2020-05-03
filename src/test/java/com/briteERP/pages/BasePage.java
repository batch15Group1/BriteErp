package com.briteERP.pages;

import com.briteERP.utilities.BrowserUtils;
import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 25);

    @FindBy(css = "[class='oe_topbar_name']")
    private WebElement userNameLoggedIn;

    public String getCurrentUserName(){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(userNameLoggedIn));
        return userNameLoggedIn.getText().trim();
    }
}
