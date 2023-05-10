package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import pages.TrainingPage;

@Epic("Trainin Tests Epic")
@Feature("Training Screen")
public class TrainingTest extends BaseTest{

    @Test
    @Story("Training Pages.")
    @Description("Verify that the user can successfully open the training page - Direct DOM Manipulation XSS.")
    public void openTrainingScreenTest() {
        page.getPage(TrainingPage.class)
                .givenIAmAtTrainingPage()
                .thenIVerifyPageTitleVisible("Direct DOM Manipulation XSS");
    }

    @Test
    @Story("Training Pages.")
    @Description("Verify that the user can successfully open the training page - Direct DOM Manipulation XSS.")
    public void openTrainingScreenNextPageTest() {
        page.getPage(TrainingPage.class)
                .givenIAmAtTrainingPage()
                .whenIClickCookieButton()
                .andIPressNextButton()
                .thenISeeNextPage();
    }

}
