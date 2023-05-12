package com.demo.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.demo.nopcommerce.customlisteners.CustomListeners;
import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordRequired;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordRequired;
    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement fNameRequired;
    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lNameRequired;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailRequired;
    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement genderFemale;
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement day;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement month;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement year;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationCompleted;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;


    public String getRegisterText() {
        Reporter.log("Get register text");
        CustomListeners.test.log(Status.PASS, "Get register text");
        return getTextFromElement(registerText);
    }

    public void clickOnRegisterButton() {
        Reporter.log("Click On register button");
        CustomListeners.test.log(Status.PASS, "Click On register button");
        clickOnElement(registerButton);
    }

    public String getFirstNameFieldRequiredText() {
        Reporter.log("Get first name field required text");
        CustomListeners.test.log(Status.PASS, "Get first name field required text");
        return getTextFromElement(fNameRequired);
    }

    public String getLastNameFieldRequiredText() {
        Reporter.log("Get last name field required text");
        CustomListeners.test.log(Status.PASS, "Get last name field required text");
        return getTextFromElement(lNameRequired);
    }

    public String getEmailFieldRequiredText() {
        Reporter.log("Get email field required text");
        CustomListeners.test.log(Status.PASS, "Get email field required text");
        return getTextFromElement(emailRequired);
    }

    public String getPasswordRequiredText() {
        Reporter.log("Get password field is required text");
        CustomListeners.test.log(Status.PASS, "Get password field is required text");
        return getTextFromElement(passwordRequired);
    }

    public String getConfirmPasswordRequiredText() {
        Reporter.log("Get confirm password field is required text");
        CustomListeners.test.log(Status.PASS, "Get confirm password field is required text");
        return getTextFromElement(confirmPasswordRequired);
    }

    public void selectRadioButtonFemale() {
        Reporter.log("Click on gender female");
        CustomListeners.test.log(Status.PASS, "Click on gender female");
        clickOnElement(genderFemale);
    }

    public void enterFirstName(String fName) {
        Reporter.log("Enter fName" + fName + "to firstName " + firstName.toString());
        CustomListeners.test.log(Status.PASS, "Enter fName" + fName);
        sendTextToElement(firstName, fName);
    }

    public void enterLastName(String lName) {
        Reporter.log("Enter lName " + lName + "to lastName  " + lastName.toString());
        CustomListeners.test.log(Status.PASS, "Enter lName " + lName);
        sendTextToElement(lastName, lName);
    }

    public void selectDay(String date) {
        Reporter.log("Select day from dropdown");
        CustomListeners.test.log(Status.PASS, "Select day from dropdown");
        selectByVisibleTextFromDropDown(day, date);
    }

    public void selectMonth(String monthName) {
        Reporter.log("Select month from dropdown");
        CustomListeners.test.log(Status.PASS, "Select month from dropdown");
        selectByVisibleTextFromDropDown(month, monthName);
    }

    public void selectYear(String yearName) {
        Reporter.log("Select year from dropdown");
        CustomListeners.test.log(Status.PASS, "Select year from dropdown");
        selectByVisibleTextFromDropDown(year, yearName);
    }

    public void enterEmail(String emailId) {
        Reporter.log("Enter emailId" + emailId + "to email" + email.toString());
        CustomListeners.test.log(Status.PASS, "Enter emailId" + emailId);
        sendTextToElement(email, emailId);
    }

    public void enterPassword(String passwordField) {
        Reporter.log("Enter  passwordField" + passwordField + "to password" + password.toString());
        CustomListeners.test.log(Status.PASS, "Enter  passwordField" + passwordField);
        sendTextToElement(password, passwordField);
    }
    public void enterConfirmPassword(String conPassword) {
        Reporter.log("Enter conPassword " + conPassword +"to confirmPassword" +confirmPassword.toString());
        CustomListeners.test.log(Status.PASS, "Enter emailId");
        sendTextToElement(confirmPassword, conPassword);
    }
    public String verifyRegistrationCompleted(){
        Reporter.log("Verify registration completed");
        CustomListeners.test.log(Status.PASS, "Verify registration completed");
        return getTextFromElement(registrationCompleted);

    }
    public String VerifyErrorMessage(){
        Reporter.log("Verify Error Message");
        CustomListeners.test.log(Status.PASS, "Verify Error Message");
        return getTextFromElement(errorMessage);

    }
}