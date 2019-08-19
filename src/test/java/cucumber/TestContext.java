package cucumber;

// The FileReaderManager is already a singleton class so doesn't need to be instantiated
import managers.DriverManager;
import managers.PageObjectManager;

/*
* This class allows me to share states between steps, no matter from which step definition file.
* */

public class TestContext {
    private DriverManager driverManager;
    private PageObjectManager pageObjectManager;

    public TestContext(){
        driverManager = new DriverManager();
        pageObjectManager = new PageObjectManager(driverManager.getDriver());
    }

    public DriverManager getDriverManager() {
        return driverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
}
