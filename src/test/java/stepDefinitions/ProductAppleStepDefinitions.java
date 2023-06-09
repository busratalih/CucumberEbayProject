package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.ProductApple;

public class ProductAppleStepDefinitions {

    ProductApple apple = new ProductApple();
    @Given("User comes to Electronics")
    public void userComesToElectronics() {
        apple.moveToElementElectrics();
    }

    @And("the user clicks Apple in the pop-up window")
    public void theUserClicksAppleInThePopUpWindow() {
        apple.moveToElementAppleAndClick();
    }

    @And("the user clicks on the Apple phones and smartphones tab from the left tab")
    public void theUserClicksOnTheApplePhonesAndSmartphonesTabFromTheLeftTab() {
        apple.cellPhoneAndSmartphoneClick();
    }

    @And("the user clicks on the iphone fourteen promax by swiping the upper part to the right")
    public void theUserClicksOnTheIphoneFourteenPromaxBySwipingTheUpperPartToTheRight() {
        apple.slideRightClick();
        apple.appleProMaxClick();
    }

    @And("clicks one tb in the Filtering section")
    public void clicksOneTbInTheFilteringSection() {
        apple.oneTBClick();
    }

    @And("clicks purple as color")
    public void clicksPurpleAsColor() {
        apple.colorPurpleClick();
    }

    @When("User verifies that the number in the result is the same as the number of output products")
    public void userVerifiesThatTheNumberInTheResultIsTheSameAsTheNumberOfOutputProducts() {
        apple.verifyproductNumbers();
    }
}
