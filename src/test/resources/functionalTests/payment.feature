@run
Feature: payment
  #flight payment feature

  #The tests (scenarios) in this feature file are focused on the payment error cases.
  #The steps under Background keyword are common steps that will be always performed
  # before any Scenario. In this case the flight search, addition to the shopping cart
  # and login.

  Background: Search and add a basic flight ticket to the cart, and log in
    #TODO: Modify the "Given" step to provide a relative (not-expiring) date. Ex: 4 month far from today
    Given That I'm in Ryanair site - search results for "MAD"-"DUB" flights on "31"/"12"/"2019"
    When I select the first flight in the list
    Then the standard fare option is displayed
    When I select the standard fare price
    Then The flight ticket is added to the basket
    When I click on Continue
    Then the choose allocation message is displayed
    When I click on random allocation button
    Then the seat selection dialog disappears
    And the cabin bag options are displayed
    When I select the small bag option
    Then the continue button is enabled
    When I click on Continue in priority boarding page
    Then The check out button is available
    When I click the check out button
    Then The sign up and log in buttons at payment page are displayed
    When I Log in from the payment page with email "ryanair_automation_test@mailinator.com" and password "Ab123456"
    Then The payment form is displayed

  Scenario Outline: Pay a flight ticket with a wrong credit card

    Given I am at payment page
    #    The following 2 lines aim to show how to create data driven test
    When I fill the customer data form with "<tittle>", "<name>", "<surname>", "<address>", "<postcode>", "<city>" and "<country>"
    And I fill the payment form with "<cardNumber>", "<expirationDate>", "<cvv>" and "<cardHolderName>"
    And I accept the terms and click on pay
    Then An error message is displayed with the following text: "As your payment was not authorised we could not complete your reservation. Please ensure that the information was correct or use a new payment to try again"

    #By adding further Examples lines, an additional test with different data would be performed, for which
    # we could also define different expected result, but always following the same steps in this Scenario.
    Examples:
    |tittle|name|surname|address|postcode|city|country|cardNumber|expirationDate|cvv|cardHolderName|
    |Mr|mario|munoz |calle a|28008   |madrid|Spain|5555555555555557|1/2022   |555|mario munoz   |