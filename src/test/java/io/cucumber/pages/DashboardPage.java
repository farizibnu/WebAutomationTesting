package io.cucumber.pages;

import io.cucumber.locators.PageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DashboardPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private PageLocators locators;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Set explicit wait for 10 seconds
        this.locators = new PageLocators(driver);  // Initialize Page Locators
    }

    public void clickMenuIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(locators.menuIcon));
        locators.menuIcon.click();
    }

    public void clickLogoutMenu() {
        // Ensure the menu is opened before clicking logout
        wait.until(ExpectedConditions.visibilityOf(locators.logoutMenu));
        wait.until(ExpectedConditions.elementToBeClickable(locators.logoutMenu));
        locators.logoutMenu.click();
    }
}
