package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage extends BasePage {

    //*********Constructor*********
    public HomePage(WebDriver driver) {
        super(driver);
    }


    //*********Page Variables*********
    String baseURL = "https://application.security/";

    //*********Web Elements By Using Page Factory*********

    @FindBy(how = How.XPATH, using = "//button[text()='Get Your Free Trial']")
    public WebElement freeTrialButton;


    //*********Page Methods*********
    //Go to Homepage
    public HomePage givenIAmAtHomePage() {
        driver.get(baseURL);
        return this;
    }

    public FreeTrialScreen whenIPressFreeTrialButton() {
        click(freeTrialButton);
        return new PageFactory().initElements(driver, FreeTrialScreen.class);
    }


}