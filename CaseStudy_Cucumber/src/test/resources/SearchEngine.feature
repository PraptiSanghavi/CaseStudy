Feature: 
  Search Product on TestMeApp portal

  Background: 
    Given User is on the HomePage

  Scenario: User searches, without spelling mistake, for a product name present in inventory.
    All the products with similar name should be displayed

    When User searchs for "Carry lappy"
    And User clicks on Find Details button
    Then User should be on product page
