package pages;

import constants.Constants;
import constants.PageUrlPaths;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {

  @FindBy (xpath="//h5[contains(text(),'Elements')]")
  private WebElement elementsCard;

  @FindBy (xpath="//img[@title='Ad.Plus Advertising']")
  private WebElement closeAddLocator;

  public HomePage (WebDriver driver) {
    super(driver);
  }

  public HomePage open() {
    openURL(PageUrlPaths.APP_URL);
    assert this.getTitle().equals(Constants.HOME_PAGE_TITLE) : "Wrong page title. Expected: " + Constants.HOME_PAGE_TITLE + ", but found: " + driver.getTitle();
    if (isCloseAddButtonPresent()){
      System.out.println("Add is present, close it" );
      closeAddLocator.click();
    }
    return new HomePage(driver);
  }

  public boolean isElementsCardPresent(){
    return isElementPresent(elementsCard);
  }

  public boolean isCloseAddButtonPresent(){
    return isElementPresent(closeAddLocator);
  }

  public void clickElementsCard() {
    assert isElementsCardPresent() : "Elements Card is NOT present on Home page!";
    //mora scroll into view jer nije mogao da klikne
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", elementsCard);
    elementsCard.click();
  }
}
