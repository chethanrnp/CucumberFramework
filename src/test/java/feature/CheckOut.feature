Feature: Search and Place Order for Products

@Smoke
  Scenario Outline: 
    : Search Experience for product Search in both home and offer page

    Given User is on GreenCart Landing Page
    When User searched with Shortname <name> and extracted actual name of the Produc
    And Added "3" items of the selected product to the cart
    Then User proceeds to checkout and validate the "Tomato" items in checkout page
    And Verify the user has ability to enter promocode and place the order

    Examples: 
      | name |
      | Tom  |
