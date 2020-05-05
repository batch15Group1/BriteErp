package com.briteERP.pages;

import com.briteERP.utilities.BrowserUtils;
import com.briteERP.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BasePage {


    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 25);

    @FindBy(css = "[class='oe_topbar_name']")
    private WebElement userNameLoggedIn;

    @FindBy(className="o_searchview_more fa fa-search-plus")
    protected  WebElement searchBox;

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Method for BriteErp navigation. Provide tab name to navigate
     *
     * @param tabName like Pricing, Events...
     */
    public void navigateTo(String tabName) {
        BrowserUtils.waitForPageToLoad(10);
        String tabNameXpath = "//span[contains(@class,'oe_menu_text')]/span[text()='" + tabName + "']";
        WebElement tabElement = driver.findElement(By.xpath(tabNameXpath));
        wait.until(ExpectedConditions.elementToBeClickable(tabElement)).click();
    }



    public String getCurrentUserName() {
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(userNameLoggedIn));
        return userNameLoggedIn.getText().trim();
    }

        /**
         * This method will run search function based on provided String value
         * @param value is a String value
         */
        public void search_value(String value){
            BrowserUtils.waitForPageToLoad(10);
            wait.until(ExpectedConditions.visibilityOf(searchBox));
            searchBox.sendKeys(value, Keys.ENTER);
    }
}
