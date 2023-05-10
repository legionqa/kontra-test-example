package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends PageGenerator {
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Click Method by using JAVA Generics (You can use both By or WebElement)
    public <T> void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public <T> void waitForElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //Write Text by using JAVA Generics (You can use both By or WebElement)
    public <T> void writeText(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }

    //Read Text by using JAVA Generics (You can use both By or WebElement)
    public <T> String readText(T elementAttr) {
        if (elementAttr.getClass().getName().contains("By")) {
            return wait.until(ExpectedConditions.visibilityOfElementLocated((By) elementAttr)).getText();
        } else {
            return wait.until(ExpectedConditions.visibilityOf((WebElement) elementAttr)).getText();
        }
    }

    //Close popup if exists
    public void handlePopup(By by) throws InterruptedException {
        List<WebElement> popup = driver.findElements(by);
        if (!popup.isEmpty()) {
            popup.get(0).click();
            Thread.sleep(200);
        }
    }
}
