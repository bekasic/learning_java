package ru.bekasic.webtests.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.bekasic.webtests.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        app.stop();
    }

}
