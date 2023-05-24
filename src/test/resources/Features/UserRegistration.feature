Feature: User Registration

  Scenario Outline: User registers with new username and password
    Given the user is already on the account registration page
    When the user id <userId> and password <pwd> are provided
    And the registration button is clicked
    Then a successful registration is completed
    Examples:
      | userId | pwd |
      | Ivan@abv.bg   | asjdhhjasl@8usd|

