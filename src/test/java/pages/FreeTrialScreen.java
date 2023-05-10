package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FreeTrialScreen extends BasePage {


    //*********Web Elements by using Page Factory*********
    @FindBy(how = How.XPATH, using = "//div[text()='Get Your Free Trial']")
    public WebElement freeTrialLabel;

    @FindBy(how = How.ID, using = "email-e0ecef7a-c98a-4e85-82d8-19f3a9f98c45")
    public WebElement emailField;

    @FindBy(how = How.ID, using = "firstname-e0ecef7a-c98a-4e85-82d8-19f3a9f98c45")
    public WebElement firstNameField;

    @FindBy(how = How.ID, using = "lastname-e0ecef7a-c98a-4e85-82d8-19f3a9f98c45")
    public WebElement lastNameField;

    @FindBy(how = How.XPATH, using = "(//input[@value='SUBMIT'])[2]")
    public WebElement submitButton;
    @FindBy(how = How.XPATH, using = "//label[text()='Please enter your business email address. This form does not accept addresses from email.com.']")
    public WebElement errorMessage;

    //*********Constructor*********
    public FreeTrialScreen(WebDriver driver) {
        super(driver);
    }

    //*********Page Methods*********


    public FreeTrialScreen thenVerifyFreeTrialScreenIsOpened() {
        assertTrue(freeTrialLabel.isDisplayed());
        return this;
    }

    public FreeTrialScreen andIEnterEmail(String email) {
        writeText(emailField, email);
        return this;
    }

    public FreeTrialScreen andIEnterFirstName(String firstName) {
        writeText(firstNameField, firstName);
        return this;
    }

    public FreeTrialScreen andIEnterLastName(String lastName) {
        writeText(lastNameField, lastName);
        return this;
    }

    public FreeTrialScreen andIClickSubmitButton() {
        click(submitButton);
        return this;
    }

    public FreeTrialScreen thenVerifyErrorMessageIsDisplayed(String expectedText) {
        assertTrue(errorMessage.isDisplayed());
        return this;
    }
}
