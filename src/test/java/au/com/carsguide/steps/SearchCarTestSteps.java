package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.SearchAndUsedCarsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class SearchCarTestSteps {
    @And("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink() {
        new HomePage().mouseHoverAndClickOnSearchCarLink();
    }

    @Then("^I navigate to ‘new and used car search’ page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
        String expected = "New & Used Car Search - carsguide";
        String actual = new SearchAndUsedCarsPage().getSearchCarWelcomeText();
        Assert.assertEquals("Search Car Title not Verified", expected, actual);
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) throws InterruptedException {
        new SearchAndUsedCarsPage().selectMakeOfCar(make);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) throws InterruptedException {
        new SearchAndUsedCarsPage().selectMakeOfCar(model);

    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) throws InterruptedException {
        new SearchAndUsedCarsPage().selectModelOfCar(location);

    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) throws InterruptedException {
        new SearchAndUsedCarsPage().selectPrice(price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new SearchAndUsedCarsPage().clickOnFindCarButton();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make) {
        Assert.assertTrue(make, new SearchAndUsedCarsPage().getTitleText().contains(make));
    }

    @And("^I click ‘Used’ link$")
    public void iClickUsedLink() {
        new HomePage().mouseHoverAndClickOnUsedCarLink();
    }

    @Then("^I navigate to ‘Used Cars For Sale’ page$")
    public void iNavigateToUsedCarsForSalePage() {
        String expected = "Used Cars For Sale";
        String actual = new SearchAndUsedCarsPage().getUsedCarWelcomeText();
        Assert.assertEquals("Used Car Search Title not Verified.", expected, actual);
    }
}

