Feature: hepbiburada.com

  Scenario: e2e hepsiburada mobil app

    Given user opens the hepsiburada app
    Then  click the give permission button
    Then wait 2 second
    Then  click the my account button
    Then  wait 3 second
    Then  click the sign in button
    Then  enter the email adress and click the sign in button
    Then  enter the password and click the sign in button
    Then  click the Okay button
    Then  click the special for you button
    Then  add a product to the cart
    Then  go to the cart
    Then  click the complete the transaction button
    Then  click new card button
    Then  enter the credi card information
    Then  close the driver without buying