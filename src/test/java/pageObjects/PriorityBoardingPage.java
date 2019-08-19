package pageObjects;

import dataProviders.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PriorityBoardingPage {
    ConfigFileReader configFileReader;
    WebDriver driver;

    public PriorityBoardingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        configFileReader= new ConfigFileReader();
    }

    @FindBy(how = How.XPATH, using = "//priority-boarding-view//priority-cabin-bag-card[.//*[text()='Included']]")
    private WebElement small_bag_option;

    @FindBy(how = How.XPATH, using = "//*[@class='trips-basket trips-cnt']//button")
    private WebElement continue_button;

    public boolean small_bag_option_is_displayed(){
        return small_bag_option.isDisplayed();
    }

    public void select_small_bag(){
        small_bag_option.click();
    }

    public boolean continue_button_is_displayed(){
        return continue_button.isDisplayed();
    }

    public void click_continue_button(){
        continue_button.click();
    }

}
