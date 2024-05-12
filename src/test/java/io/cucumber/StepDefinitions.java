package io.cucumber;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    public static WebDriver driver;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @Given("the user is logged in to the application with username {string} and password {string}")
    public void the_user_is_logged_in_to_the_application(String username, String password) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // Assume user is already logged in, navigate to dashboard page
        driver.get("https://www.saucedemo.com/");

        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));

        // Input username and password
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }

    @When("I enter invalid username and password")
    public void i_enter_invalid_username_and_password() {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));

        // Input invalid username and password
        usernameField.sendKeys("standard");
        passwordField.sendKeys("standarduser321");
    }

    @Then("I should see an invalid username or password error message")
    public void i_should_see_an_invalid_username_or_password_error_message() {
        WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
        String expectedErrorMessage = "Username and password do not match any user in this service!";
        String actualErrorMessage = errorMessage.getText();
        assertEquals(expectedErrorMessage, actualErrorMessage);

        // Close the WebDriver after the scenario completes
        driver.quit();
    }

    @When("I do not enter username and password")
    public void i_do_not_enter_username_and_password() {
        // No action needed as we are not entering anything
    }

    @Then("I should see a username is required error message")
    public void i_should_see_a_username_is_required_error_message() {
        WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
        String expectedErrorMessage = "You need Username & Password!";
        String actualErrorMessage = errorMessage.getText();
        assertEquals(expectedErrorMessage, actualErrorMessage);

        // Close the WebDriver after the scenario completes
        driver.quit();
    }

    @When("I enter registered username with incorrect password")
    public void i_enter_registered_username_with_incorrect_password() {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));

        // Input registered username with incorrect password
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("incorrectPassword");
    }

    @Then("I should see an error message for incorrect password")
    public void i_should_see_an_error_message_for_incorrect_password() {
        WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
        String expectedErrorMessage = "Username  and password do not match any user in  this service!";
        String actualErrorMessage = errorMessage.getText();
        assertEquals(expectedErrorMessage, actualErrorMessage);

        // Close the WebDriver after the scenario completes
        driver.quit();
    }

    @Given("the user is on the dashboard page")
    public void the_user_is_on_the_dashboard_page() {
        // This step is covered in the previous step
    }

    @When("I enter {string} and {string}")
    public void i_enter_username_and_password(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));

        // Input username and password
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    @When("I leave the username field empty")
    public void i_leave_the_username_field_empty() {
        // Do nothing, leaving the username field empty
    }

    @When("I enter {string} as username")
    public void i_enter_username_as_username(String username) {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys(username);
    }

    @When("I leave the password field empty")
    public void i_leave_the_password_field_empty() {
        // Do nothing, leaving the password field empty
    }

    @When("I enter {string} as password")
    public void i_enter_password_as_password(String password) {
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }

    @When("the user clicks the menu icon on the top left corner of the dashboard")
    public void the_user_clicks_the_menu_icon_on_the_top_left_corner_of_the_dashboard() {
        WebElement menuIcon = driver.findElement(By.id("react-burger-menu-btn"));
        menuIcon.click();
    }

    @When("the user clicks the Logout menu")
    public void the_user_clicks_the_Logout_menu() {
        WebElement logoutMenu = driver.findElement(By.cssSelector("#logout_sidebar_link")); // Menambahkan tanda pagar (#) untuk mencari elemen dengan ID
        logoutMenu.click();
    }

    @Then("the user should be redirected to the login page")
    public void the_user_should_be_redirected_to_the_login_page() {
        String currentUrl = driver.getCurrentUrl();
        assertEquals("https://www.saucedemo.com/", currentUrl); // Assuming this is the URL for the login page

        // Close the WebDriver after the scenario completes
        driver.quit();
    }

    @Then("I should be redirected to the dashboard page")
    public void i_should_be_redirected_to_the_dashboard_page() {
        String currentUrl = driver.getCurrentUrl();
        assert currentUrl.contains("inventory");

        // Close the WebDriver after the scenario completes
        driver.quit();
    }

    @Then("I should see the error message {string}")
    public void i_should_see_the_error_message(String expectedErrorMessage) {
        WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
        String actualErrorMessage = errorMessage.getText();
        assertEquals(expectedErrorMessage, actualErrorMessage);

        // Close the WebDriver after the scenario completes
        driver.quit();
    }

}
