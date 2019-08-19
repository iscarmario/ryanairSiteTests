package pageObjects;

import dataProviders.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SeatsPage {
    ConfigFileReader configFileReader;
    WebDriver driver;

    public SeatsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        configFileReader= new ConfigFileReader();
    }

    @FindBy(how = How.CLASS_NAME, using = "footer-message")
    private WebElement choose_seat_message;

    @FindBy(how = How.XPATH, using = "//button[@class='footer-message-content__button footer-message-content__button--link']")
    private WebElement random_allocation_button;

    @FindBy(how = How.CLASS_NAME, using = "ngdialog dialog-aside seats-dialog")
    private WebElement seats_layer;

    public boolean choose_seat_message_is_displayed(){
        return choose_seat_message.isDisplayed();
    }

    public void click_random_allocation_button(){
        random_allocation_button.click();
    }

    public boolean seats_layer_is_displayed(){
        return driver.findElements(By.className("ngdialog dialog-aside seats-dialog")).size() != 0;
    }
}
