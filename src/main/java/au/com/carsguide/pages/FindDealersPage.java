package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FindDealersPage extends Utility {
    private static final Logger log = LogManager.getLogger(FindDealersPage.class.getName());

    public FindDealersPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[@class='dealer-title']")
    WebElement dealerTitle;

    @CacheLookup
    @FindBy(xpath = "//div[@class='dealerListing--name']//a")
    List<WebElement> dealerNames;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Next']")
    WebElement nextButton;

    public String getTitle(){
        log.info("verifying find dealers url: '" + dealerTitle.toString() );
        return getTextFromElement(dealerTitle);
    }

    public String getDealersName(String dealerName){
        for(WebElement data:dealerNames){
            String str=data.getText();
            if(str.equalsIgnoreCase(dealerName)){
                log.info("Fetching Dealers Name: "+ str);
                return str;
            }
        }
        return null;
    }

    public void clickOnNextButton() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(nextButton);
        log.info("Clicking on next button.");
    }




}




