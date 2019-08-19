$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("payment.feature");
formatter.feature({
  "line": 2,
  "name": "payment",
  "description": "",
  "id": "payment",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.scenarioOutline({
  "line": 31,
  "name": "Pay a flight ticket with a wrong credit card",
  "description": "",
  "id": "payment;pay-a-flight-ticket-with-a-wrong-credit-card",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 33,
  "name": "I am at payment page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 34,
      "value": "#    The following 2 lines aim to show how to create data driven test"
    }
  ],
  "line": 35,
  "name": "I fill the customer data form with \"\u003ctittle\u003e\", \"\u003cname\u003e\", \"\u003csurname\u003e\", \"\u003caddress\u003e\", \"\u003cpostcode\u003e\", \"\u003ccity\u003e\" and \"\u003ccountry\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "I fill the payment form with \"\u003ccardNumber\u003e\", \"\u003cexpirationDate\u003e\", \"\u003ccvv\u003e\" and \"\u003ccardHolderName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I accept the terms and click on pay",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "An error message is displayed with the following text: \"As your payment was not authorised we could not complete your reservation. Please ensure that the information was correct or use a new payment to try again\"",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 40,
      "value": "#By adding further Examples lines, an additional test with different data would be performed, for which"
    },
    {
      "line": 41,
      "value": "# we could also define different expected result, but always following the same steps in this Scenario."
    }
  ],
  "line": 42,
  "name": "",
  "description": "",
  "id": "payment;pay-a-flight-ticket-with-a-wrong-credit-card;",
  "rows": [
    {
      "cells": [
        "tittle",
        "name",
        "surname",
        "address",
        "postcode",
        "city",
        "country",
        "cardNumber",
        "expirationDate",
        "cvv",
        "cardHolderName"
      ],
      "line": 43,
      "id": "payment;pay-a-flight-ticket-with-a-wrong-credit-card;;1"
    },
    {
      "cells": [
        "Mr",
        "mario",
        "munoz",
        "calle a",
        "28008",
        "madrid",
        "Spain",
        "5555555555555557",
        "1/2022",
        "555",
        "mario munoz"
      ],
      "line": 44,
      "id": "payment;pay-a-flight-ticket-with-a-wrong-credit-card;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2974067375,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 3,
      "value": "#flight payment feature"
    },
    {
      "line": 5,
      "value": "#The tests (scenarios) in this feature file are focused on the payment error cases."
    },
    {
      "line": 6,
      "value": "#The steps under Background keyword are common steps that will be always performed"
    },
    {
      "line": 7,
      "value": "# before any Scenario. In this case the flight search, addition to the shopping cart"
    },
    {
      "line": 8,
      "value": "# and login."
    }
  ],
  "line": 10,
  "name": "Search and add a basic flight ticket to the cart, and log in",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#TODO: Modify the \"Given\" step to provide a relative (not-expiring) date. Ex: 4 month far from today"
    }
  ],
  "line": 12,
  "name": "That I\u0027m in Ryanair site - search results for \"MAD\"-\"DUB\" flights on \"31\"/\"12\"/\"2019\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I select the first flight in the list",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the standard fare option is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I select the standard fare price",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "The flight ticket is added to the basket",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I click on Continue",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "the choose allocation message is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I click on random allocation button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "the seat selection dialog disappears",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "the cabin bag options are displayed",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select the small bag option",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "the continue button is enabled",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I click on Continue in priority boarding page",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "The check out button is available",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I click the check out button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "The sign up and log in buttons at payment page are displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I Log in from the payment page with email \"ryanair_automation_test@mailinator.com\" and password \"Ab123456\"",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "The payment form is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "MAD",
      "offset": 47
    },
    {
      "val": "DUB",
      "offset": 53
    },
    {
      "val": "31",
      "offset": 70
    },
    {
      "val": "12",
      "offset": 75
    },
    {
      "val": "2019",
      "offset": 80
    }
  ],
  "location": "FlightsListPageSteps.thatIMInRyanairSiteSearchResultsForDUBMADFlgithsOn(String,String,String,String,String)"
});
formatter.result({
  "duration": 4752427089,
  "status": "passed"
});
formatter.match({
  "location": "FlightsListPageSteps.iSelectTheFirstFlightInTheList()"
});
formatter.result({
  "duration": 5211904366,
  "status": "passed"
});
formatter.match({
  "location": "FlightsListPageSteps.theStandardFareOptionIsDisplayed()"
});
formatter.result({
  "duration": 411609853,
  "status": "passed"
});
formatter.match({
  "location": "FlightsListPageSteps.iSelectTheStandardFarePrice()"
});
formatter.result({
  "duration": 675527858,
  "status": "passed"
});
formatter.match({
  "location": "FlightsListPageSteps.theFlightTicketIsAddedToTheBasket()"
});
formatter.result({
  "duration": 670763921,
  "status": "passed"
});
formatter.match({
  "location": "FlightsListPageSteps.iClickOnContinue()"
});
formatter.result({
  "duration": 244260772,
  "status": "passed"
});
formatter.match({
  "location": "SeatsPageSteps.theChooseAllocationMessageIsDisplayed()"
});
formatter.result({
  "duration": 3621943861,
  "status": "passed"
});
formatter.match({
  "location": "SeatsPageSteps.iClickOnRandomAllocationButton()"
});
formatter.result({
  "duration": 1150392306,
  "status": "passed"
});
formatter.match({
  "location": "SeatsPageSteps.theSeatSelectionDialogDisappears()"
});
formatter.result({
  "duration": 20380447357,
  "status": "passed"
});
formatter.match({
  "location": "PriorityBoardingPageSteps.theCabinBagOptionsAreDisplayed()"
});
formatter.result({
  "duration": 71659166,
  "status": "passed"
});
formatter.match({
  "location": "PriorityBoardingPageSteps.iSelectTheSmallBagOption()"
});
formatter.result({
  "duration": 87738819,
  "status": "passed"
});
formatter.match({
  "location": "PriorityBoardingPageSteps.theContinueButtonIsEnabled()"
});
formatter.result({
  "duration": 45280996,
  "status": "passed"
});
formatter.match({
  "location": "PriorityBoardingPageSteps.iClickOnContinueInPriorityBoardingPage()"
});
formatter.result({
  "duration": 69918896,
  "status": "passed"
});
formatter.match({
  "location": "ExtrasPageSteps.theCheckOutButtonIsAvailable()"
});
formatter.result({
  "duration": 955241198,
  "status": "passed"
});
formatter.match({
  "location": "ExtrasPageSteps.iClickTheCheckOutButton()"
});
formatter.result({
  "duration": 20383899201,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPageSteps.theSignInAndLogInButtonsAtPaymentPageAreDisplayed()"
});
formatter.result({
  "duration": 79451677,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ryanair_automation_test@mailinator.com",
      "offset": 43
    },
    {
      "val": "Ab123456",
      "offset": 97
    }
  ],
  "location": "PaymentPageSteps.iLogInFromThePaymentPageWithEmailAndPassword(String,String)"
});
formatter.result({
  "duration": 3388985214,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPageSteps.thePaymentFormIsDisplayed()"
});
formatter.result({
  "duration": 44458624,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "Pay a flight ticket with a wrong credit card",
  "description": "",
  "id": "payment;pay-a-flight-ticket-with-a-wrong-credit-card;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "I am at payment page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 34,
      "value": "#    The following 2 lines aim to show how to create data driven test"
    }
  ],
  "line": 35,
  "name": "I fill the customer data form with \"Mr\", \"mario\", \"munoz\", \"calle a\", \"28008\", \"madrid\" and \"Spain\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6
  ],
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "I fill the payment form with \"5555555555555557\", \"1/2022\", \"555\" and \"mario munoz\"",
  "matchedColumns": [
    7,
    8,
    9,
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I accept the terms and click on pay",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "An error message is displayed with the following text: \"As your payment was not authorised we could not complete your reservation. Please ensure that the information was correct or use a new payment to try again\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentPageSteps.iAmAtPaymentPage()"
});
formatter.result({
  "duration": 8292429,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mr",
      "offset": 36
    },
    {
      "val": "mario",
      "offset": 42
    },
    {
      "val": "munoz",
      "offset": 51
    },
    {
      "val": "calle a",
      "offset": 60
    },
    {
      "val": "28008",
      "offset": 71
    },
    {
      "val": "madrid",
      "offset": 80
    },
    {
      "val": "Spain",
      "offset": 93
    }
  ],
  "location": "PaymentPageSteps.iFillTheCustomerDataFormWithAnd(String,String,String,String,String,String,String)"
});
