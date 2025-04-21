package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_1Page {

    WebDriver driver;

    By sheetLoadedIdentifier = By.id("docs-title-input-label"); // Adjust the identifier as needed

    public tc_1Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPageLoaded() {
        return driver.findElement(sheetLoadedIdentifier).isDisplayed();
    }
}