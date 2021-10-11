Feature: Verify current date is Selected
  Scenario: Verify if current date is Selected in Time-Machine calendar
  Given I am on homepage
    Then I scroll to the bottom of the page
    Then I click on "Time Machine" button
    And I verify if today's date is selected

