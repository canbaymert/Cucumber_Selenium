package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HMCStepDefinitions {
    HMCPage hmcPage = new HMCPage();

    @Then("user clicks the login button on HMC page")
    public void user_clicks_the_login_button_on_HMC_page() {
        hmcPage.loginButton.click();
    }

    @Then("user enters a valid username on HMC page")
    public void user_enters_a_valid_username_on_HMC_page() {
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    }

    @Then("user enters a valid password on HMC page")
    public void user_enters_a_valid_password_on_HMC_page() {
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    }

    @Then("user clicks the 2nd login button on HMC page")
    public void user_clicks_the_2nd_login_button_on_HMC_page() {
        hmcPage.loginButton2.click();
    }

    @Then("user asserts that the login process is completed successfully on HMC page")
    public void user_asserts_that_the_login_process_is_completed_successfully_on_HMC_page() {
        Assert.assertTrue(hmcPage.hotelManagement.isDisplayed());
    }

    @Then("user enters an invalid password on HMC page")
    public void user_enters_an_invalid_password_on_hmc_page() {
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
    }

    @Then("user asserts that the login process is failed on HMC page")
    public void user_asserts_that_the_login_process_is_failed_on_hmc_page() {
        Assert.assertTrue(hmcPage.loginButton2.isDisplayed());
    }

    @Then("user enters an invalid username on HMC page")
    public void user_enters_a_invalid_username_on_hmc_page() {
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
    }

    @And("user enters an invalid {string} username on HMC page")
    public void userEntersAnInvalidUsernameOnHMCPage(String str) {
        hmcPage.usernameBox.sendKeys(str);
    }

    @And("user enters an invalid {string} password on HMC page")
    public void userEntersAnInvalidPasswordOnHMCPage(String str) {
        hmcPage.passwordBox.sendKeys(str);
    }
}
