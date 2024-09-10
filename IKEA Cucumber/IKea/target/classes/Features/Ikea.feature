Feature:  Sign up and Shopping process
  @happy
  Scenario: Verify that user can sign up successfully
    Given Open URL
    When Click on sign up link
    And Click on create an account
    And Sign up with valid data
    Then user should sign up to his profile
    And Click on products
    And Choose specific product sofas
    And Sort products from high to low
    And Added three random products to cart and Compare them with products name and prices in the cart
    Then Check the total price in the cart is calculated correctly
    And Move second product in the cart to favourites
    And Remove third product from the cart
    Then check out until user i reach review and pay

