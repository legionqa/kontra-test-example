package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import pages.HomePage;

@Epic("Free Trial Tests Epic")
@Feature("Free Trial Screen")
public class FreeTrialTest extends BaseTest {
    @Test
    @Story("Free Trial Page.")
    @Description("Verify that the user can successfully open the free trial form.")
    public void openFreeTrialScreenTest() {
        page.getPage(HomePage.class)
                .givenIAmAtHomePage()
                .whenIPressFreeTrialButton()
                .thenVerifyFreeTrialScreenIsOpened();
    }

    @Test
    @Story("Free Trial Page.")
    @Description("Verify that the user gets Error when submitting the form without filling in the required fields.")
    public void submitFormWithoutFillingInRequiredFieldsTest() {
        page.getPage(HomePage.class)
                .givenIAmAtHomePage()
                .whenIPressFreeTrialButton()
                .andIEnterEmail("test@email.com")
                .andIEnterFirstName("Test")
                .andIEnterLastName("Test")
                .andIClickSubmitButton()
                .thenVerifyErrorMessageIsDisplayed("Please complete this required field.");
    }


}
