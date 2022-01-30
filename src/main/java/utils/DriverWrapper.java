package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverWrapper {

  private final FileUtil fileUtil = new FileUtil();

  private static final String WEB_DRIVER_MAC_PATH = "src/main/resources/drivers/chromedriver";
  private static final String WEB_DRIVER_WINDOWS_PATH = "src/main/resources/drivers/chromedriver.exe";

  public WebDriver createDriver() {
    if (System.getProperty("os.name").equals("Mac OS X")) {
      System.setProperty("webdriver.chrome.driver", fileUtil.getAbsoluteFilePath(WEB_DRIVER_MAC_PATH));
    } else {
      System.setProperty("webdriver.chrome.driver", fileUtil.getAbsoluteFilePath(WEB_DRIVER_WINDOWS_PATH));
    }
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    return driver;
  }
}
