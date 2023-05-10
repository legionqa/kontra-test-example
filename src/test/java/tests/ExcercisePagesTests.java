package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import pages.ExcercisesPage;

@Epic("Excercise Pages Free account Epic")
@Feature("Free Account excercises Screen")
public class ExcercisePagesTests extends BaseTest{

    @Test
    @Story("Free account frontend courses")
    @Description("Verify that the user can successfully open the frontend courses from the free account")
    public void openFrontendExcercisesTest() {
        page.getPage(ExcercisesPage.class)
                .givenIAmAtExcercisesPage()
                .thenIVerifyPageTitleVisible("Kontra Front-end Top 5");
    }

    @Test
    @Story("Free account docker courses")
    @Description("Verify that the user can successfully open the docker courses from the free account")
    public void openDockerExcercisesTest() {
        page.getPage(ExcercisesPage.class)
                .givenIAmAtDockerExcercisesPage()
                .thenIVerifyPageTitleVisible("Kontra Docker CLI Top 10");
    }
}
