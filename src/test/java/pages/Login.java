package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class Login {

    public Login() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Sign in']")
    private WebElement linkSignIn;

    @FindBy(id = "userid")
    private WebElement emailInput;

    @FindBy(id = "signin-continue-btn")
    private WebElement buttonContinue;

    @FindBy(id = "pass")
    private WebElement passwordInput;

    @FindBy(id = "sgnBt")
    private WebElement buttonSignIn;

    @FindBy(xpath = "//b[.='Büşra']")
    private WebElement personalAccount;

    @FindBy(id = "signin-error-msg")
    private WebElement signInErrorMsg;




    public void signInClick(){
        linkSignIn.click();
    }
    public void sendKeysEmail(String bekir){
        emailInput.sendKeys(ConfigReader.getProperty(bekir));
    }
    public void buttonContinueClick(){
        buttonContinue.click();
    }
    public void sendKeysPassword(String password){
        passwordInput.sendKeys(ConfigReader.getProperty(password));
    }
    public void signInButtonClick(){
        buttonSignIn.click();
    }
    public void verifyLogin(){
        Assert.assertTrue(personalAccount.getText().contains("Büşra"));
    }

    public void verifySignInErrorMessage(){

        Assert.assertTrue(signInErrorMsg.getText().contains("We ran into a problem. Please try again later."));
    }




}
