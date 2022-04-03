Feature: Basket

  Scenario: Add item to Basket
    Given I'm on the home page "https://www.next.co.uk"
    When I add an item to basket "2"
    Then I should be seeing added item in Bag Icon