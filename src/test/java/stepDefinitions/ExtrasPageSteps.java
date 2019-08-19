package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ExtrasPage;

public class ExtrasPageSteps {
    TestContext testContext;
    ExtrasPage extrasPage;

    public ExtrasPageSteps(TestContext context) {
        testContext = context;
        extrasPage = testContext.getPageObjectManager().getExtrasPage();
    }

    @Then("^The check out button is available$")
    public void theCheckOutButtonIsAvailable(){
        assert extrasPage.check_out_button_is_displayed();
    }

    @When("^I click the check out button$")
    public void iClickTheCheckOutButton(){
        extrasPage.click_check_out_button();
        if (extrasPage.pop_up_is_displayed()){
            extrasPage.click_popup_x_button();
        }
    }
}
