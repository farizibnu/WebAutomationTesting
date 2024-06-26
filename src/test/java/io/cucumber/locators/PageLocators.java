package io.cucumber.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class PageLocators {

    // Locators for LoginPage
    @FindBy(id = "user-name")
    public WebElement usernameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(xpath = "//h3[@data-test='error']")
    public WebElement errorMessage;

    // Locators for DashboardPage
    @FindBy(id = "react-burger-menu-btn")
    public WebElement menuIcon;

    @FindBy(id = "logout_sidebar_link")
    public WebElement logoutMenu;

    // Constructor to initialize elements
    public PageLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
