Feature: HomeFeature
  This feature deals with the HomePage functionality of the application

  Scenario: Navigate to viu url
    Given I navigate to the viu url
    And click on movie icon
    Then I should see the hindi movie page

  Scenario: search with right movie name
    Given I click on the search button
    And write movie name sarkar
    And hit the enter button
    Then I should see the sarkar movie page