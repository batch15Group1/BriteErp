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
  Scenario: Login as events manager
    When user logs in as a events manager
    Then user name should be "username"

  @inventory_manager
  Scenario: Login as inventory manager
    When user logs in as a inventory manager
    Then user name should be "username"

  @sales_manager
  Scenario: Login as sales manager
    When user logs in as a sales manager
    Then user name should be "username"

  @expenses_manager
  Scenario: Login as expenses manager
    When user logs in as a expenses manager
    Then user name should be "username"

  @Login_with_params
    Scenario: Login with parameters
      When user enters "storemanager85" username and "UserUser123" password
      Then user name should be "username"

  @scenario_outline
  Scenario Outline: User names test for user <name>
    When user enters "<username>" username and "<password>" password
    Then user name should be "<name>"
    Examples:
      | username        | password    | name             |
      | user187         | UserUser123 | Jerel Vandervort |
      | user200         | UserUser123 | Lonzo Leuschke   |
      | storemanager52  | UserUser123 | Roma Medhurst    |
      | storemanager66  | UserUser123 | Carlos Ernser    |
      | salesmanager125 | UserUser123 | Cleveland Heller |
      | salesmanager140 | UserUser123 | Jameson Paucek   |