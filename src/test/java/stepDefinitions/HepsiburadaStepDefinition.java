package stepDefinitions;


import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.AllPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;


public class HepsiburadaStepDefinition {
    AllPages allPages = new AllPages();


    @Given("open the hepsiburada app")
    public void open_the_hepsiburada_app() throws MalformedURLException {
        Driver.getAppiumDriver();
    }

    @Then("click the my account")
    public void click_the_my_account() {
        ReusableMethods.bekle(3);
        allPages.myAccountButton.click();

    }

    @Then("click the sign in button")
    public void click_the_sign_in_button() {
        ReusableMethods.bekle(3);
        allPages.signInButton.click();


    }

    @Then("enter the email adress and click the sign in button")
    public void enter_the_email_adress_and_click_the_sign_in_button() {
        ReusableMethods.bekle(3);
        allPages.emailBox.sendKeys(ConfigReader.getProperty("email"));
        allPages.emailSinIn.click();

    }

    @Then("enter the password and click the sign in button")
    public void enter_the_password_and_click_the_sign_in_button() {
        ReusableMethods.bekle(3);
        allPages.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        allPages.passwordSignIn.click();

    }

    @Then("click the approval")
    public void click_the_approval() {
        ReusableMethods.bekle(3);
        allPages.okayButton.click();

    }

    @Then("click the special for you button")
    public void click_the_special_for_you_button() {
        ReusableMethods.bekle(3);
        allPages.specailForYouButton.click();
    }

    @Then("add a product to the basket")
    public void add_a_product_to_the_basket() {
        Actions actions1 = new Actions(Driver.getAppiumDriver());
       // allPages.panProductAdd.click();
        ReusableMethods.bekle(3);
        actions1.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        allPages.panProductAdd.click();
/*
        Dimension dimension = Driver.getAppiumDriver().manage().window().getSize();
        int scrollStart = (int) (dimension.getHeight() * 0.8);
        int scrollEnd = (int) (dimension.getHeight() * 0.6);
        TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());
        touchAction.press(PointOption.point(0, scrollStart)).waitAction().moveTo(PointOption.point(0, scrollEnd)).release().perform(); */

    }


    @Then("go to the basket")
    public void go_to_the_basket() {
        ReusableMethods.bekle(3);
        allPages.cart.click();

    }

    @Then("click the complete the transaction button")
    public void click_the_complete_the_transaction_button() {
        ReusableMethods.bekle(3);
        allPages.completeTheTransactionButton.click();
    }

    @Then("click new card button")
    public void click_new_card_button() {
        allPages.newCard.click();

    }

    @Then("enter the card information")
    public void enter_the_card_information() {
        ReusableMethods.bekle(3);
        Actions actions1 = new Actions(Driver.getAppiumDriver());
        allPages.cardNumberBox.sendKeys(ConfigReader.getProperty("cardNumber"));
        ReusableMethods.bekle(3);
        actions1.sendKeys(Keys.TAB).perform();
        ReusableMethods.bekle(3);
        actions1.sendKeys(ConfigReader.getProperty("name")).perform();
        ReusableMethods.bekle(3);
        actions1.sendKeys(Keys.TAB).perform();
        ReusableMethods.bekle(2);
        actions1.sendKeys(ConfigReader.getProperty("date")).perform();
        ReusableMethods.bekle(2);
        //actions1.sendKeys(ConfigReader.getProperty("code")).perform();


        //allPages.dateBox.sendKeys(ConfigReader.getProperty("date"));
        //allPages.securityBox.sendKeys(ConfigReader.getProperty("code"));

    }

    @Then("close the driver without buying")
    public void close_the_driver_without_buying() {
        Driver.quitAppiumDriver();
    }

    @Then("wait {int} second")
    public void waitSecond(int saniye) {
        ReusableMethods.bekle(saniye);
    }


    @Then("click the give permission button")
    public void clickTheGivePermissionButton() {
        allPages.givePermissionButton.click();

    }


    @Then("scroll down a bit until the product shown")
    public void scrollDownABitUntilTheProductShown() {
        ReusableMethods.scrollDownJavascript(0, 1000);
        ReusableMethods.bekle(6);
    }

    @Given("click the sign ın with google button")
    public void click_the_sign_ın_with_google_button() {
        allPages.googleEnterance.click();
    }

    @Given("click the yasaruzun91 gmail button")
    public void click_the_yasaruzun91_gmail_button() {
        allPages.yasargmail.click();
    }


    @Given("Verify visibility of confirm order button")
    public void verify_visibility_of_confirm_order_button() {
        ReusableMethods.bekle(3);
        Actions actions2=new Actions(Driver.getAppiumDriver());
        actions2.sendKeys(Keys.PAGE_DOWN).perform();
        actions2.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(allPages.orderConfirmationButton.isDisplayed());

    }

    @Given("Ad Accept")
    public void ad_accept() {
        ReusableMethods.bekle(12);
        allPages.popupAcceptButton.click();

    }
}