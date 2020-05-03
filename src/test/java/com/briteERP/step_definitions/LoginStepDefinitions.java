package com.briteERP.step_definitions;


import com.briteERP.pages.LoginPage;
import com.briteERP.utilities.BrowserUtils;
import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Open login page");
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
    }

    @When("user logs in as a pos manager")
    public void user_logs_in_as_a_pos_manager() {
        System.out.println("Login as pos manager");
        loginPage.loginAsPosManager();
    }

    @When("user logs in as a events manager")
    public void user_logs_in_as_a_events_manager() {
        System.out.println("Login as Events manager");
        loginPage.loginAsEventsManager();
    }

    @When("user logs in as a inventory manager")
    public void user_logs_in_as_a_inventory_manager() {
        System.out.println("Login as inventory manager");
        loginPage.loginAsInventoryManager();
    }

    @When("user logs in as a sales manager")
    public void user_logs_in_as_a_sales_manager() {
        System.out.println("Login as inventory manager");
        loginPage.loginAsSalesManager();
    }

    @When("user logs in as a expenses manager")
    public void user_logs_in_as_a_expenses_manager() {
        System.out.println("Login as a Expenses Manager");
        loginPage.loginAsExpensesManager();
    }

    //    When user enters "storemanager85" username and "UserUser123" password
    @When("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {
        System.out.printf("Login with user name %s and %s password\n", string, string2);
        loginPage.login(string, string2);
    }

//    @When("user navigates to {string} and {string}")
//    public void user_navigates_to_and(String tab, String module) {
//        System.out.printf("User clicks on the %s tab and navigates to %s module\n", tab, module);
//        loginPage.navigateTo(tab, module);
//    }

    @Then("user name should be {string}")
    public void user_name_should_be(String string) {
        String currentUserLowerCase=loginPage.getCurrentUserName().toLowerCase();
        string.toLowerCase();
        Assert.assertEquals(string, currentUserLowerCase);
    }


    @Then("user verifies that page title is {string}")
    public void user_verifies_that_page_title_is(String string) {
        System.out.println("Verify that page title is: " + string);
        Assert.assertEquals(string, Driver.getDriver().getTitle());
    }

}