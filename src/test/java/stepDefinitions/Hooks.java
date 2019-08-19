package stepDefinitions;
import cucumber.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    TestContext testContext;

    public Hooks(TestContext context) {
        testContext = context;
    }

    @Before
    public void BeforeSteps() {
        //The driver might had been started at this point, but I'm already doing it at the TestContext class
        //because I need it due to the page object model
    }

    @After
    public void AfterSteps() {
        testContext.getDriverManager().closeDriver();
    }
}
