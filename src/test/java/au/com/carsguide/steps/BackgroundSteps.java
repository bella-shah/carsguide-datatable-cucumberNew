package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class BackgroundSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() throws InterruptedException{
        new HomePage().mouseHoverOnBuyAndSellLink();
    }
    }

