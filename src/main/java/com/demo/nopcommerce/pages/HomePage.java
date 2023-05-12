package com.demo.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.demo.nopcommerce.customlisteners.CustomListeners;
import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath= "//a[normalize-space()='Log out']")
    WebElement logoutLink;
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;
    public void clickOnLoginLink() {
        Reporter.log("Click On Login Link");
        CustomListeners.test.log(Status.PASS, "Click On Login Link");
        clickOnElement(loginLink);

    }
    public String verifyThatLogoutLinkIsDisplay(){
        Reporter.log("Verify logout link is displayed");
        CustomListeners.test.log(Status.PASS, "Verify logout link is displayed");
        return getTextFromElement(logoutLink);
    }
    public String verifyThatLoginLinkIsDisplay(){
        Reporter.log("Verify login link is displayed");
        CustomListeners.test.log(Status.PASS, "Verify login link is displayed");
        return getTextFromElement(loginLink);
    }
    public void clickOnRegisterLink() {
        Reporter.log("Click on register link");
        CustomListeners.test.log(Status.PASS, "Click on register link");
        clickOnElement(registerLink);
    }
}