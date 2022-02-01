
@money_transfer
Feature: money transfer feature

  Scenario Outline: login_with_customer_credentials

    Given user is on the login page
    And user clicks on login dropdown
    And user clicks on sign in button
    And user sends username "<username>"
    And user sends password "<password>"
    And user clicks on the login button
    Then close the application

    Examples:credentials

      |username                  | password    |
      |shaylee.lindgren          |mVSk$eq1YoZwq|


    Scenario: user_should_make_money_transfer

      Given user is on the login page
      And user clicks on login dropdown
      And user clicks on sign in button
      And user sends username "<username>"
      And user sends password "<password>"
      And user clicks on the login button
##run and generate the stepdefinitions