package pageObjects;

import dataProviders.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExtrasPage {
    ConfigFileReader configFileReader;
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor executor;

    public ExtrasPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        configFileReader= new ConfigFileReader();
        wait = new WebDriverWait(driver, configFileReader.getImplicitlyWait());
        executor = (JavascriptExecutor)driver;
        popup = "//div[@class='popup-msg' and .//*[text()='I choose random allocation']]/div[@class='popup-msg__close']";
    }

    @FindBy(how =How.XPATH, using = "//button[text()='Check out']")
    private WebElement check_out_button;

    private String popup;

    public boolean check_out_button_is_displayed(){
        return check_out_button.isDisplayed();
    }

    public void click_check_out_button(){
        wait.until(ExpectedConditions.elementToBeClickable(check_out_button));
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        executor.executeScript("arguments[0].click();",check_out_button);
    }

    public void click_popup_x_button(){
        driver.findElement(By.xpath(popup)).click();
    }

    public boolean pop_up_is_displayed(){
        boolean exist = driver.findElements(By.xpath(popup)).size() > 0;
        return exist;
    }

}
