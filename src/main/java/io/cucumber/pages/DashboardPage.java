package io.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DashboardPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By menuIcon = By.id("react-burger-menu-btn");
    private By logoutMenu = By.id("logout_sidebar_link");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Set explicit wait for 10 seconds
    }

    public void clickMenuIcon() {
        WebElement menuElement = wait.until(ExpectedConditions.elementToBeClickable(menuIcon));
        menuElement.click();
    }

    public void clickLogoutMenu() {
        // Ensure the menu is opened before clicking logout
        wait.until(ExpectedConditions.visibilityOfElementLocated(logoutMenu));
        WebElement logoutElement = wait.until(ExpectedConditions.elementToBeClickable(logoutMenu));
        logoutElement.click();
    }
}
