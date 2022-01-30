package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.DriverWrapper;

public class TextBoxTest extends  BaseTest {

  @Test
  public void testTextBox () {

    WebDriver driver = new DriverWrapper().createDriver();
    try {
      HomePage homePage = new HomePage(driver).open();
      homePage.clickElementsCard();
    } finally {
      //driver.quit();
    }
  }
}
