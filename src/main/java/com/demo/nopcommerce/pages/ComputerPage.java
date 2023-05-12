package com.demo.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.demo.nopcommerce.customlisteners.CustomListeners;
import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerTab;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computerText;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopsLink;
    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Notebooks']")
    WebElement notebooksLink;
    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Software']")
    WebElement softwareLink;
public void clickOnComputerTab(){
    Reporter.log("click on computer tab");
    CustomListeners.test.log(Status.PASS, "click on computer tab");
    clickOnElement(computerTab);
}
public String verifyTextComputer(){
    Reporter.log("Verify text Computer");
    CustomListeners.test.log(Status.PASS, "Verify text Computer");
    return getTextFromElement(computerText);
}
public void clickOnDesktopsLink(){
    Reporter.log("Click on Desktopslink");
    CustomListeners.test.log(Status.PASS, "Click on Desktopslink");
    clickOnElement(desktopsLink);
}
}

