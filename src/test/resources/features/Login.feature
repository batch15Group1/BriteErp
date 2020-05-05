@login
Feature: Login
  As user, I want to be able to login with username and password
#  Agile story

#  Test Method = Test Case = Scenario
#  Test + DataProvider = Scenario Outline + Examples table
 Background: open login page
   Given user is on the login page

  @pos_manager
  Scenario: Login as pos manager
    When user logs in as a pos manager
    Then user name should be "username"

  @events_manager
  Scenario: Login as events CRM manager
    When user logs in as a events CRM Manager
    Then user name should be "username"

  @sales_manager
  Scenario: Login as sales manager
    When user logs in as a sales manager
    Then user name should be "username"

  @expenses_manager
  Scenario: Login as expenses manager
    When user logs in as a expenses manager
    Then user name should be "username"

  @inventory_manager
  Scenario: Login as inventory manager
    When user logs in as a inventory manager
    Then user name should be "username"

  @Login_with_params
    Scenario: Login with parameters
      When user enters "storemanager85" username and "UserUser123" password
      Then user name should be "username"
