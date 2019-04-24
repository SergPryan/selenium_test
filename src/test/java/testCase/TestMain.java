package testCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import testCase.pages.LoginPage;
import testCase.pages.MainPage;

import java.util.concurrent.TimeUnit;

public class TestMain extends TestBaseJUnit {

    @Before
    public void setup() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testSendEmail() throws InterruptedException {
        driver.get("http://localhost:3000/");
        LoginPage loginPage = new LoginPage(driver, "admin", "pass");
        loginPage.enter();
        MainPage mainPage = new MainPage(driver);
        mainPage.select();
        Thread.sleep(15000);
        mainPage.selectModal();
        Thread.sleep(15000);

    }

    @After
    public void close() {
        driver.close();
    }

}
