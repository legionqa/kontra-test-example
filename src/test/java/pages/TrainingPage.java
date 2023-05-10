package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrainingPage extends BasePage{
    //*********Web Elements by using Page Factory*********
    @FindBy(how = How.XPATH, using = "//h1")
    public WebElement trainingPageTitle;


    @FindBy(how = How.XPATH, using = "//button[text()='Next']")
    public WebElement nextButton;

    @FindBy(how = How.XPATH, using = "//span[text()='2/22']")
    public WebElement nextPage;

    @FindBy(how = How.XPATH, using = "//*[@id='hs-eu-confirmation-button']")
    public WebElement cookieButton;

    //*********Page Variables*********
    String appSecurityTrainingUrl = "https://application.security/free-application-security-training/direct-dom-xss";


//    driver.findElement(By.xpath("//*[@id='hs-eu-confirmation-button']")).click();


    //*********Constructor*********
    public TrainingPage(WebDriver driver) {
        super(driver);
    }

    //*********Page Methods*********

    public TrainingPage givenIAmAtTrainingPage() {
        driver.get(appSecurityTrainingUrl);
        return this;
    }
    public TrainingPage andIPressNextButton() {
        click(nextButton);
        return this;
    }

    public TrainingPage thenISeeNextPage() {
        waitForElement(nextPage);
        assertTrue(nextPage.isDisplayed());
        return this;
    }

    public TrainingPage thenIVerifyPageTitleVisible(String expectedText) {
        assertEquals(readText(trainingPageTitle), expectedText);
        return this;
    }
    public
    TrainingPage whenIClickCookieButton() {
        click(cookieButton);
        return this;
    }



}
