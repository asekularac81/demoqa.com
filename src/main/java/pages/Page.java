package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Page {
  protected WebDriver driver;

  protected Page (WebDriver driver) {
    if (driver == null ){
      throw new AssertionError(" Driver instance is null. ");
    }
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public void openURL (String url) {
    driver.get(url);
  }

  public void validateCurrentPage(String urlPath) {
    assert driver.getCurrentUrl().contains(urlPath) : "Current URL doesn't contain: " + urlPath + ".";
  }

  public String getTitle() {
    return driver.getTitle();
  }

  public boolean isElementPresent (WebElement element) {
    try {
      return element.isDisplayed();
    } catch (NoSuchElementException e){
      return false;
    }
  }
}
