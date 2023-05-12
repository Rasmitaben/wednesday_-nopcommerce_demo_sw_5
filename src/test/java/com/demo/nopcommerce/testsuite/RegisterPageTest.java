package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.customlisteners.CustomListeners;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {
    RegisterPage registerPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        registerPage = new RegisterPage();
        homePage = new HomePage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        //   Click on Register Link
        Thread.sleep(2000);
        homePage.clickOnRegisterLink();
        //   Verify "Register" text
        String expectedMessage = "Register";
        String actualMessage = registerPage.getRegisterText();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message");
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandetory() {
        //  Click on Register Link
        homePage.clickOnRegisterLink();
        //   Click on "REGISTER" button
        registerPage.clickOnRegisterButton();
        //Verify the error message "First name is required."
        String expectedFirstName = "First name is required.";
        String actualFirstName = registerPage.getFirstNameFieldRequiredText();
        Assert.assertEquals(actualFirstName, expectedFirstName, "Error message");
        //   Verify the error message "Last name is required."
        String expectedLastName = "Last name is required.";
        String actualLastName = registerPage.getLastNameFieldRequiredText();
        Assert.assertEquals(actualLastName, expectedLastName, "Error message");
        //   Verify the error message "Email is required."
        String expectedEmail = "Email is required.";
        String actualEmail = registerPage.getEmailFieldRequiredText();
        Assert.assertEquals(actualEmail, expectedEmail, "Error message");
        // Verify the error message "Password is required."
        String expectedPassword = "Password is required.";
        String actualPassword = registerPage.getPasswordRequiredText();
        Assert.assertEquals(actualPassword, expectedPassword, "Password required is not displayed");
        // Verify the error message "Password is required."
        String expectedConfirmPassword = "Password is required.";
        String actualConfirmPassword = registerPage.getConfirmPasswordRequiredText();
        Assert.assertEquals(actualConfirmPassword, expectedConfirmPassword, "Confirm password required is not displayed");

    }
    @Test(groups = {"regression"})
    public void  VerifyThatUserShouldCreateAccountSuccessfully(){
        // Click on Register Link
        homePage.clickOnRegisterLink();
        //   Select gender "Female"
        registerPage.selectRadioButtonFemale();
        //   Enter firstname
        registerPage.enterFirstName("Zara");
        //   Enter lastname
        registerPage.enterLastName("Lee");
        //   Select day
        registerPage.selectDay("20");
        //   Select month
        registerPage.selectMonth("October");
        //   Select year
        registerPage.selectYear("2010");
        //   Enter email
        registerPage.enterEmail("zara123@gmail.com");
        //   Enter password
        registerPage.enterPassword("Zaral12");
        //   Enter Confirm Password
        registerPage.enterConfirmPassword("Zaral12");
        //   Click on "REGISTER" button
        registerPage.clickOnRegisterButton();
        //   Verify message "Your registration completed"
        String expectedMessage = "Your registration completed";
        String actualMessage = registerPage.verifyRegistrationCompleted();
        Assert.assertEquals(expectedMessage,actualMessage, "message not displayed");

    }
}