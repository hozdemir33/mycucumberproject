
@admin_sign_in @smoke
Feature:user_creation

  Scenario Outline:
    Given user will place username and password
    Then verify the login is successful

    Examples:

    |username  | password|
    |CWoburn   |Cw192837?|
