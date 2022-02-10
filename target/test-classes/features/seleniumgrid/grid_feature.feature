
@grid_feature
Feature: grid_feature

 @edge_scenario
  Scenario: TC_01_Testing_On_Edge
    Given on the application_url with edge
    Then verify the title of the page is GMIBANK
    Then close the remote driver


  @firefox_scenario
  Scenario: TC_02_Testing_On_Firefox
    Given user is on the application_url with firefox
    Then verify the title of the page is GMIBANK
    Then close the remote driver


