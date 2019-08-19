package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PriorityBoardingPage;

public class PriorityBoardingPageSteps {

    TestContext testContext;
    PriorityBoardingPage priorityBoardingPage;

    public PriorityBoardingPageSteps(TestContext context) {
        testContext = context;
        priorityBoardingPage = testContext.getPageObjectManager().getPriorityBoardingPage();
    }


    @And("^the cabin bag options are displayed$")
    public void theCabinBagOptionsAreDisplayed(){
        assert priorityBoardingPage.small_bag_option_is_displayed();
    }

    @When("^I select the small bag option$")
    public void iSelectTheSmallBagOption(){
        priorityBoardingPage.select_small_bag();
    }

    @Then("^the continue button is enabled$")
    public void theContinueButtonIsEnabled(){
        assert priorityBoardingPage.continue_button_is_displayed();
    }

    @When("^I click on Continue in priority boarding page$")
    public void iClickOnContinueInPriorityBoardingPage(){
        priorityBoardingPage.click_continue_button();
    }
}
