Feature: Login
  This feature deal with all the login test case

  Scenario Outline: Successful Login
    Given I am on the login page
    When I enter "<username>" and "<password>"
    And I click the login button
    Then I should be redirected to the dashboard page

    Examples:
      | username       | password      |
      | standard_user  | secret_sauce  |

  Scenario Outline: Negative Login - Invalid Username and Empty Password
    Given I am on the login page
    When I enter "<username>" as username
    And I leave the password field empty
    And I click the login button
    Then I should see the error message "You need Password!"

    Examples:
      | username       |
      | standard       |


  Scenario Outline: Negative Login - Empty Username and Invalid Password
    Given I am on the login page
    When I leave the username field empty
    And I enter "<password>" as password
    And I click the login button
    Then I should see the error message "You need Username!"

    Examples:
      | password         |
      | standarduser321  |



