package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.DriverWrapper;

public class BaseTest {

  @Test
  public void test() {
    WebDriver driver = new DriverWrapper().createDriver();
  }
}
