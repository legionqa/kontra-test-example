package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.LogUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExcercisesPage extends BasePage {


    //*********Web Elements by using Page Factory*********
    @FindBy(how = How.XPATH, using = "//h1")
    public WebElement exercisePageTitle;


    //*********Page Variables*********
    String frontendFreeUrl = "https://application.security/free/kontra-front-end-top-5";
    String dockerFreeUrl = "https://application.security/free/docker-top-10";

    //*********Constructor*********
    public ExcercisesPage(WebDriver driver) {
        super(driver);
    }

    //*********Page Methods*********
    public ExcercisesPage givenIAmAtExcercisesPage() {
        driver.get(frontendFreeUrl);
        return this;
    }

    public ExcercisesPage givenIAmAtDockerExcercisesPage() {
        driver.get(dockerFreeUrl);
        return this;
    }

    public ExcercisesPage thenIVerifyPageTitleVisible(String expectedText) {
        assertEquals(readText(exercisePageTitle), expectedText);

        return this;
    }


}
