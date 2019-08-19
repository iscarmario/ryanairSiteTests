package pageObjects;
import dataProviders.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {
    ConfigFileReader configFileReader;
    WebDriver driver;
    String url;
    WebDriverWait wait;
    Actions actions;
    JavascriptExecutor executor;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        configFileReader= new ConfigFileReader();
        url = configFileReader.getBaseUrl() + "/booking/payment";
        wait = new WebDriverWait(driver, configFileReader.getImplicitlyWait());
        actions = new Actions(driver);
        executor = (JavascriptExecutor)driver;
    }

    // TODO: Request unique identifiers to development team
    
    @FindBy(how = How.XPATH, using = "//button[@ui-sref='login']")
    private WebElement login_button;

    @FindBy(how = How.XPATH, using = "//button[@ui-sref='login']")
    private WebElement sign_up_button;

    @FindBy(how = How.XPATH, using = "//signup-home-tabs[@default-tab='login']")
    private WebElement popup_login_form;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Email address']")
    private WebElement email_imput_field;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
    private WebElement password_imput_field;

    @FindBy(how = How.XPATH, using = "//signup-home-tabs[@default-tab='login']//button//*[text()='Log in']")
    private WebElement login_button_at_login_form;

    @FindBy(how = How.XPATH, using = "//*[contains(@class,'passenger-first-name')]//input")
    private WebElement name_imput;

    @FindBy(how = How.XPATH, using = "//*[contains(@class,'-passenger-last-name')]//input")
    private WebElement surname_imput;

    @FindBy(how = How.XPATH, using = "//*[contains(@class,'-passenger-last-name')]//select")
    private Select title_list;

    @FindBy(how = How.XPATH, using = "//button[@class='csi-card__btn csi-card__actions-no']")
    private WebElement no_insurance_button;

    @FindBy(how = How.XPATH, using = "//payment-method-card//input[@placeholder='Enter card number']")
    private WebElement card_number_input;

    @FindBy(how = How.XPATH, using = "//select[contains(@class,'expiry-month-select')]")
    private Select card_expiration_month_select;

    @FindBy(how = How.XPATH, using = "//select[contains(@class,'expiry-year-select')]")
    private Select card_expiration_year_select;

    @FindBy(how = How.XPATH, using = "//*[@class='card-security-code']//input")
    private WebElement card_cvv_input;

    @FindBy(how = How.XPATH, using = "//*[contains(@class,'cardholders-name')]//input")
    private WebElement card_holder_input;

    @FindBy(how = How.XPATH, using = "//select[@name='currency']")
    private WebElement currency_list;

    @FindBy(how = How.ID, using = "billingAddressAddressLine1")
    private WebElement address_1_input;

    @FindBy(how = How.ID, using = "billingAddressCity")
    private WebElement city_input;

    @FindBy(how = How.ID, using = "billingAddressPostcode")
    private WebElement postcode_input;

    @FindBy(how = How.ID, using = "billingAddressCountry")
    private Select country_select;

    @FindBy(how = How.XPATH, using = "//*[@class='terms']/input")
    private WebElement accept_terms_checkbox;

    @FindBy(how = How.XPATH, using = "//*[@class='cta']/button")
    private WebElement pay_button;

    @FindBy(how = How.XPATH, using = "//prompt[@class=\"error prompt-text\"]//div[@class='info-text']")
    private  WebElement error_message_box;

    public void click_login_button(){
        login_button.click();
    }

    public boolean login_button_is_displayed(){
        return login_button.isDisplayed();
    }

    public boolean sign_up_button_is_displayed(){
        return sign_up_button.isDisplayed();
    }

    public boolean popup_login_form_is_displayed(){
        return popup_login_form.isDisplayed();
    }

    public void fill_email_imput_field(String email){
        email_imput_field.sendKeys(email);
    }

    public void fill_password_imput_field(String password){
        password_imput_field.sendKeys(password);
    }

    public void click_login_button_at_login_form(){
        login_button_at_login_form.click();
    }

    public boolean at_PaymentPage(){
        String current = driver.getCurrentUrl();
        return url == current;
    }

    public void click_no_insurance_button(){
        no_insurance_button.click();
    }

    public boolean no_insurance_button_exist(){
        boolean exist = driver.findElements(By.xpath("//button[@class='csi-card__btn csi-card__actions-no']")).size() > 0;
        return exist;
    }

    public void fill_passenger_details(String title, String name, String surname){
        name_imput.sendKeys(name);
        surname_imput.sendKeys(surname);
        WebElement option = driver.findElement(By.xpath("//option[@value='string:"+title.toUpperCase()+"']"));
        option.click();
        wait.until(ExpectedConditions.visibilityOf(option));
        option.click();
    }

    public void fill_card_details(String cardNumber, String expirationDate, String cvv, String cardHolder){
        card_number_input.sendKeys(cardNumber);
        String[] date = expirationDate.split("/");
        WebElement option = driver.findElement(By.xpath("//option[@value='number:"+date[0]+"']"));
        option.click();
        option = driver.findElement(By.xpath("//option[@value='number:"+date[1]+"']"));
        option.click();
        card_cvv_input.sendKeys(cvv);
        card_holder_input.sendKeys(cardHolder);
        currency_list.findElement(By.xpath("//option[@value='EUR']")).click();
    }

    public void fill_address_details(String address, String city, String postcode, String country){
        address_1_input.sendKeys(address);
        city_input.sendKeys(city);
        postcode_input.sendKeys(postcode);
        WebElement option = driver.findElement(By.xpath("//option[text()='"+country+"']"));
        option.click();
    }

    public void click_accept_terms_checkbox(){
        executor.executeScript("arguments[0].click();", accept_terms_checkbox);
    }

    public void click_pay_button(){
        executor.executeScript("arguments[0].click();", pay_button);
    }

    public boolean error_message_is_like(String text){
        return error_message_box.getText() == text;
    }

}
