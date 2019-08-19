package managers;
import org.openqa.selenium.WebDriver;
import pageObjects.*;

/*
* This PageObjectManager aims to avoid the creation of page object of the same class
 * at all step definition files. In this way the page object is created once.
* */

public class PageObjectManager {

    private WebDriver driver;
    private FlightsListPage flightsListPage;
    private SeatsPage seatsPage;
    private PriorityBoardingPage priorityBoardingPage;
    private ExtrasPage extrasPage;
    private PaymentPage paymentPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }
    public FlightsListPage getFlightsListPage(){
        return (flightsListPage == null) ? flightsListPage = new FlightsListPage(driver) : flightsListPage;
    }

    public SeatsPage getSeatsPage(){
        return (seatsPage == null) ? seatsPage = new SeatsPage(driver) : seatsPage;
    }

    public PriorityBoardingPage getPriorityBoardingPage(){
        return (priorityBoardingPage == null) ? priorityBoardingPage = new PriorityBoardingPage(driver) : priorityBoardingPage;
    }

    public ExtrasPage getExtrasPage(){
        return (extrasPage == null) ? extrasPage = new ExtrasPage(driver) : extrasPage;
    }

    public PaymentPage getPaymentPage(){
        return (paymentPage == null) ? paymentPage = new PaymentPage(driver) : paymentPage;
    }

}