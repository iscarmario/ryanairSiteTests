package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.*;
import cucumber.TestContext;

public class FlightsListPageSteps {

    TestContext testContext;
    FlightsListPage flightsListPage;

    public FlightsListPageSteps(TestContext context) {
        testContext = context;
        flightsListPage = testContext.getPageObjectManager().getFlightsListPage();
    }

    @Given("^That I'm in Ryanair site - search results for \"([^\"]*)\"-\"([^\"]*)\" flights on \"([^\"]*)\"/\"([^\"]*)\"/\"([^\"]*)\"$")
    public void thatIMInRyanairSiteSearchResultsForDUBMADFlgithsOn(String arg0, String arg1,String arg2, String arg3, String arg4){
        flightsListPage.navigateTo_FlightsListPage(arg0,arg1,arg2,arg3,arg4);
    }

    @When("^I select the first flight in the list$")
    public void iSelectTheFirstFlightInTheList(){
        flightsListPage.select_first_flight_price_button();
    }

    @Then("^the standard fare option is displayed$")
    public void theStandardFareOptionIsDisplayed(){
        assert flightsListPage.standard_fare_price_displayed();
    }

    @When("^I select the standard fare price$")
    public void iSelectTheStandardFarePrice(){
        flightsListPage.select_standard_fare_price();
    }

    @Then("^The flight ticket is added to the basket$")
    public void theFlightTicketIsAddedToTheBasket(){
        assert flightsListPage.continue_button_is_active();
    }

    @When("^I click on Continue$")
    public void iClickOnContinue(){
        flightsListPage.click_continue_button();
    }
}
