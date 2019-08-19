package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.SeatsPage;

public class SeatsPageSteps {
    TestContext testContext;
    SeatsPage seatsPage;

    public SeatsPageSteps(TestContext context) {
        testContext = context;
        seatsPage = testContext.getPageObjectManager().getSeatsPage();
    }

    @Then("^the choose allocation message is displayed$")
    public void theChooseAllocationMessageIsDisplayed(){
        assert seatsPage.choose_seat_message_is_displayed();
    }

    @When("^I click on random allocation button$")
    public void iClickOnRandomAllocationButton(){
        seatsPage.click_random_allocation_button();
    }

    @Then("^the seat selection dialog disappears$")
    public void theSeatSelectionDialogDisappears(){
        assert !seatsPage.seats_layer_is_displayed();
    }

}
