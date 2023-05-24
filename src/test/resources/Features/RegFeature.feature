Feature: Standard app feature

  Scenario: Open the browser and get to the home page
    Given the browser is open
    When the home page is entered by the user
    Then the user sees the slides on the home page

  Scenario: Go to the my account page
    Given the user is on the homepage
    When the user clicks on the My account hyperlink
    Then the user is no longer on the home page