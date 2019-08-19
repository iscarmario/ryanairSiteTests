package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ExtrasPage;
import pageObjects.PaymentPage;

public class PaymentPageSteps {

    TestContext testContext;
    ExtrasPage extrasPage;
    PaymentPage paymentPage;

    public PaymentPageSteps(TestContext context) {
        testContext = context;
        paymentPage = testContext.getPageObjectManager().getPaymentPage();
    }

    @When("^I close the select seat reminder$")
    public void iCloseTheSelectSeatReminder(){
        extrasPage.click_popup_x_button();
    }

    @Then("^The sign up and log in buttons at payment page are displayed$")
    public void theSignInAndLogInButtonsAtPaymentPageAreDisplayed(){
        assert paymentPage.login_button_is_displayed();
        assert paymentPage.sign_up_button_is_displayed();
    }

    @When("^I Log in from the payment page with email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLogInFromThePaymentPageWithEmailAndPassword(String arg0, String arg1){
        paymentPage.click_login_button();
        paymentPage.fill_email_imput_field(arg0);
        paymentPage.fill_password_imput_field(arg1);
        paymentPage.click_login_button_at_login_form();
    }

    @Then("^The payment form is displayed$")
    public void thePaymentFormIsDisplayed(){
        assert paymentPage.popup_login_form_is_displayed();
//        assert paymentPage.at_PaymentPage();
    }

    @When("^I fill the customer data form with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iFillTheCustomerDataFormWithAnd(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6){
        paymentPage.fill_passenger_details(arg0,arg1,arg2);

        if (paymentPage.no_insurance_button_exist()) {
            paymentPage.click_no_insurance_button();
        }
        paymentPage.fill_address_details(arg3,arg4,arg5,arg6);
    }

    @And("^I fill the payment form with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iFillThePaymentFormWithAnd(String arg0, String arg1, String arg2, String arg3){
        paymentPage.fill_card_details(arg0,arg1,arg2,arg3);
    }

    @And("^I accept the terms and click on pay$")
    public void iAcceptTheTermsAndClickOnPay() {
        paymentPage.click_accept_terms_checkbox();
        paymentPage.click_pay_button();
    }

    @Then("^An error message is displayed with the following text: \"([^\"]*)\"$")
    public void anErrorMessageIsDisplayedWithTheFollowingText(String arg0){
        paymentPage.error_message_is_like(arg0);
    }

    @Given("^I am at payment page$")
    public void iAmAtPaymentPage(){
        paymentPage.at_PaymentPage();
    }
}

