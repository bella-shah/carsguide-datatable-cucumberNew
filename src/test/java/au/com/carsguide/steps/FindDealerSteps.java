package au.com.carsguide.steps;

import au.com.carsguide.pages.FindDealersPage;
import au.com.carsguide.pages.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class FindDealerSteps {
    @When("^I click Find a Dealer link$")
    public void iClickFindADealerLink() {
        new HomePage().mouseHoverAndClickOnFindDealerLink();
    }

    @Then("^I navigate to the car dealers page$")
    public void iNavigateToTheCarDealersPage() {
        String exp="Find a Car Dealership Near You";
        String act=new FindDealersPage().getTitle();
        Assert.assertEquals("Page not found",exp,act);
    }

    @And("^I should see the dealer names are display on page$")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(DataTable dataTable) throws InterruptedException{
        List<String> expectedList = dataTable.asList(String.class);
        for(String e:expectedList){
            while(new FindDealersPage().getDealersName(e)==null){
                new FindDealersPage().clickOnNextButton();
            }

            Assert.assertEquals("Dealer not found",e,new FindDealersPage().getDealersName(e));
        }
    }
    }

