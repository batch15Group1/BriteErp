package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected WebDriver driver= Driver.getDriver();
    protected WebDriverWait wait=new WebDriverWait(driver,25);


}
