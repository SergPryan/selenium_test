package testCase;

import java.io.IOException;
import java.util.Properties;

/**
 * Loads test suite configuration from resource files.
 */
class SuiteConfiguration {

  private Properties properties;

  public SuiteConfiguration() throws IOException {
    properties = new Properties();
    properties.load(SuiteConfiguration.class.getClassLoader().getResourceAsStream("application.properties"));
  }


  public String getProperty(String name) {
    return properties.getProperty(name);
  }
}
