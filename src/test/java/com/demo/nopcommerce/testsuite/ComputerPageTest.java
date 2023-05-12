package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.customlisteners.CustomListeners;
import com.demo.nopcommerce.pages.BuildYourOwnComputerPage;
import com.demo.nopcommerce.pages.ComputerPage;
import com.demo.nopcommerce.pages.DesktopsPage;
import com.demo.nopcommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)

public class ComputerPageTest extends BaseTest {
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }
    @Test(groups = {"sanity","smoke"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
        //  Click on Computer tab
        computerPage.clickOnComputerTab();
        //   Verify "Computer" text
        String expectedText = "Computers";
        Assert.assertEquals(computerPage.verifyTextComputer(),expectedText,"Text not displayed");
    }
    @Test(groups = {"smoke","smoke"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
//Click on Computer tab
        computerPage.clickOnComputerTab();
//   Click on Desktops link
        computerPage.clickOnDesktopsLink();
//   Verify "Desktops" text
        String expectedMessage = "Desktops";
        Assert.assertEquals(desktopsPage.verifyTextDesktops(),expectedMessage,"error message");
    }
    @Test(groups = {"regression"})
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram,
                                                                                    String hdd, String os, String software){
        //Click on Computer tab
        computerPage.clickOnComputerTab();
        //   Click on Desktops link
        computerPage.clickOnDesktopsLink();
        //   Click on product name "Build your own computer"
        buildYourOwnComputerPage.clickOnBuildYourOwnComputerProduct();
        //   Select processor "processor"
        buildYourOwnComputerPage.selectProcessor();
        //   Select RAM "ram"
        //   Select HDD "hdd"
        //   Select OS "os"
        //   Select Software "software"
        buildYourOwnComputerPage.differentSelection("radioButtonSelection");
        //   Click on "ADD TO CART" Button
        buildYourOwnComputerPage.clickOnAddToCartButton();
        //   Verify message "The product has been added to your shopping cart"
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(buildYourOwnComputerPage.verifyTheProductHasBeenAddedToYourShoppingCart(),expectedMessage,"product not added");
    }
}