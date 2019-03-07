package testCase;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Base class for all the JUnit-based test classes
 */
public class TestBaseJUnit {

  WebDriver driver;

  @ClassRule
  public static ExternalResource webDriverProperties = new ExternalResource() {
    @Override
    protected void before() throws Throwable {
      SuiteConfiguration config = new SuiteConfiguration();
      System.setProperty("webdriver.gecko.driver",config.getProperty("webdriver.gecko.driver"));
    }
  };

  @Rule
  public ExternalResource webDriver = new ExternalResource() {
    @Override
    protected void before() {
      driver = new FirefoxDriver();
    }
  };
}
