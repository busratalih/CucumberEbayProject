package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login;
import utilities.ReusableMethods;

public class LoginStepDefinitions {

    Login login = new Login();
    @Given("Kullanici url gider")
    public void kullaniciUrlGider() {
        ReusableMethods.goToBaseURL();
    }

    @When("Kullanici signin butonuna tiklar")
    public void kullaniciSigninButonunaTiklar() {
        login.signInClick();
    }

    @Given("Kullanici {string} girer ve continue tusuna basar")
    public void kullaniciGirerVeContinueTusunaBasar(String merve) {

        login.sendKeysEmail(merve);
        login.buttonContinueClick();

    }

    @And("Kullanici {string} girer ve continue tiklar")
    public void kullaniciGirerVeContinueTiklar(String password) {
        login.sendKeysPassword(password);
        login.signInButtonClick();

    }

    @Then("Kullanici login oldugunu dogrular")
    public void kullaniciLoginOldugunuDogrular() {
        login.verifyLogin();
    }

    @Given("Kayitli olmayan {string} ile giris yapamaz")
    public void kayitliOlmayanIleGirisYapamaz(String negativeEmail) {
        login.sendKeysEmail(negativeEmail);
        login.buttonContinueClick();
    }



    @Then("Kullanici login olmadigini dogrular")
    public void kullaniciLoginOlmadiginiDogrular() {
        login.verifySignInErrorMessage();
    }
}

