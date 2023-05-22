Feature: Account Details test

  Scenario: The user enters the Account Details page and checks their details
    Given that the user is already on the Account Details page
    When the user fills their first and last names
    And the user checks if the email corresponds to the email they entered
    Then the user logs out

