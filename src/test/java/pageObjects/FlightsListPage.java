package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import dataProviders.ConfigFileReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightsListPage{

    ConfigFileReader configFileReader;
    WebDriver driver;
    Actions actions;
    WebDriverWait wait;

    public FlightsListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        configFileReader= new ConfigFileReader();
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, configFileReader.getImplicitlyWait());
    }

    @FindBy(how = How.XPATH, using = "(//*[contains(@class,'hide-mobile')]//flights-table-price/div)[1]")
    private WebElement first_flight_price_button;

    @FindBy(how = How.XPATH, using = "(//flights-table-fares//flights-table-price)[1]")
    private WebElement standard_fare_price;

    @FindBy(how = How.XPATH, using = "//*[@id='booking-selection']//button[@type='button']")
    private WebElement continue_button;

    public void navigateTo_FlightsListPage(String origin, String destiny, String day, String month, String year) {
        driver.get(configFileReader.getBaseUrl() + "/booking/home/"+origin+"/"+destiny+"/"+year+"-"+month+"-"+day+"//1/0/0/0");
    }

    public void select_first_flight_price_button() {
        first_flight_price_button.click();
    }

    public boolean standard_fare_price_displayed(){
        return standard_fare_price.isDisplayed();
    }

    public void select_standard_fare_price(){
        standard_fare_price.click();
    }

    public boolean continue_button_is_active(){
        wait.until(ExpectedConditions.elementToBeClickable(continue_button));
        return continue_button.isEnabled();
    }

    public void click_continue_button(){
        wait.until(ExpectedConditions.elementToBeClickable(continue_button));
        continue_button.click();
    }
}
