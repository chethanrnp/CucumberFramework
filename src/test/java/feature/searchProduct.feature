Feature: Search and Place Order for Products

  @Regression
  Scenario Outline: 
    : Search Experience for product Search in both home and offer page

    Given User is on GreenCart Landing Page
    When User searched with Shortname <name> and extracted actual name of the Product
    Then User Searched for <name> shortname in offer page
    And Validate Product in offer page matches with Landing Page

    Examples: 
      | name |
      | Tom  |
      | Beet |
