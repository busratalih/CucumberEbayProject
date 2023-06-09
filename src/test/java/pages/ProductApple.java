package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class ProductApple {


    public ProductApple() {

        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "(//a[.='Electronics'])[2]")
    private WebElement linkElectronics;

    @FindBy(linkText = "Apple")
    private WebElement linkApple;

    @FindBy(xpath = "(//li/a)[53]")
    private WebElement linkCellPhoneSmartPhone;

    @FindBy(xpath = "(//div/button)[9]")
    private WebElement rightSlide;

    @FindBy(linkText = "Apple iPhone 14 Pro Max")
    private WebElement linkAppleProMax;

    @FindBy(linkText = "1 TB")
    private WebElement linkOneTB;

    @FindBy(xpath = "(//li/a)[73]")
    private WebElement colorPurple;

    @FindBy(xpath = "(//div/h2)[3]")
    private WebElement result;

    @FindBy(xpath = "//a/h3")
    private List<WebElement> products;


    public void moveToElementElectrics(){
        ReusableMethods.hover(linkElectronics);
    }

    public void moveToElementAppleAndClick(){
        ReusableMethods.hover(linkApple);
        linkApple.click();
    }

    public void cellPhoneAndSmartphoneClick(){
        linkCellPhoneSmartPhone.click();
    }

    public void slideRightClick(){
        ReusableMethods.hover(rightSlide);
        rightSlide.click();
    }

    public void appleProMaxClick(){
        linkAppleProMax.click();
    }

    public void oneTBClick(){
        linkOneTB.click();
    }

    public void colorPurpleClick(){
        colorPurple.click();
    }

    public void verifyproductNumbers(){

        int resultNumber = Integer.parseInt(result.getText().replaceAll(" Results","")) ;

        Assert.assertNotEquals(resultNumber,products.size());

    }
















}
