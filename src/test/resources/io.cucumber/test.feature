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
