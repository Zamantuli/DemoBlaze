Feature: Adding products to the cart

  Background: Launch the browser
    Given I open the browser and navigate to the login page
    When I enter the "admin" and "admin"
    And I click on the login button
    Then I should see the "Welcome admin" text

  Scenario: Add a product to the cart
    Given I click on the "Samsung galaxy s6" product
    And I click on the Add to cart button
    Then I should see the Product added message
    And I click the ok button
    And I click the Cart button
    And I click the Place order button
    And I fill in the form with random data
    And I click the Purchase button
    Then I should see the Purchase successful message
    And I confirm the purchase by clicking the ok button


#    Scenario Outline: Add multiple products to the cart
#      Given I click on the <Product1> product
#      And I click on the Add to cart button
#      Then I should see the Product added message
#      And I click the ok button
#      And I click the home button
#      Given I click on the <Product2> product
#      And I click on the Add to cart button
#      Then I should see the Product added message
#      And I click the ok button
#      Examples:
#        |Product1         |Product2         |
#        |Samsung galaxy s6|Samsung galaxy s7|


