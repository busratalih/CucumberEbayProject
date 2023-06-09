package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ProductPage;

public class ProductStepDefinitions {


    ProductPage pp=new ProductPage();




    @Given("User types {string} in the searchbox and searches")
    public void userTypesInTheSearchboxAndSearches(String brands) {
        pp.searchBoxSendKey(brands);
    }

    @And("the user selects one hundred and twenty-eight gb from storage capacity in the left tabs")
    public void theUserSelectsOneHundredAndTwentyEightGbFromStorageCapacityInTheLeftTabs() {
        pp.setStorageCapacity();

    }

    @And("User selects color black from left tab")
    public void userSelectsColorBlackFromLeftTab() {
        pp.colorAndBlackClick();
    }


    @And("User sets the price range from ten dollars to two thousand dollars")
    public void userSetsThePriceRangeFromTenDollarsToTwoThousandDollars() {
        pp.minAndMaxSendKeysAndOkButtonClick();
    }

    @And("User selects thousand miles from item location in radius section")
    public void userSelectsThousandMilesFromItemLocationInRadiusSection() {
        pp.selectRadius();
    }

    @And("User adds the first product to the watchlist and leaves")
    public void userAddsTheFirstProductToTheWatchlistAndLeaves() {
        pp.heartClick();
        pp.watchListClick();
    }

    @Then("User confirms that the product is on the watchlist")
    public void userConfirmsThatTheProductIsOnTheWatchlist() {
        pp.verifyAllCategories();
    }
}
