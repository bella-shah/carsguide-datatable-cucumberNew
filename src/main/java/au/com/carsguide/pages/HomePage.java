package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='buy + sell']")
    WebElement buyAndSellLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Search Cars']")
    WebElement searchCarLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement usedCarLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement findDealerLink;


    public void mouseHoverOnBuyAndSellLink() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElement(buyAndSellLink);
        log.info("Mouse Hovering on Buy & Sell Link. ");
    }
    public void mouseHoverAndClickOnSearchCarLink() {
        mouseHoverToElementAndClick(searchCarLink);
        log.info("Mouse Hover & click on Search Car Link. ");
    }
    public void mouseHoverAndClickOnUsedCarLink() {
        mouseHoverToElementAndClick(usedCarLink);
        log.info("Mouse Hover & click on Used Car Link. ");
    }
    public void mouseHoverAndClickOnFindDealerLink() {
        mouseHoverToElementAndClick(findDealerLink);
        log.info("Mouse Hover & click on Find Dealer Link. ");
    }

}


