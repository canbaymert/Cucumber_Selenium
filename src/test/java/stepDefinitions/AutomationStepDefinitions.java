package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AutomationPage;
import utilities.Driver;

public class AutomationStepDefinitions {
    AutomationPage automationPage = new AutomationPage();
    Faker faker = new Faker();

    @And("user clicks the sign in button on Automation page")
    public void userClicksTheSignInButtonOnAutomationPage() {
        automationPage.signInButton.click();
    }

    @And("user enters an email address to the Email text box on Automation page")
    public void userEntersAnEmailAddressToTheEmailTextBoxOnAutomationPage() {
        automationPage.emailTextBox.sendKeys(faker.internet().emailAddress());
    }

    @And("clicks the create a new account button")
    public void clicksTheCreateANewAccountButton() {
        automationPage.createAccountButton.click();
    }

    @And("user enters all personal information")
    public void userEntersAllPersonalInformation() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(automationPage.gender)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("10")
                .sendKeys(Keys.TAB)
                .sendKeys("January")
                .sendKeys(Keys.TAB)
                .sendKeys("2000")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("California")
                .sendKeys(Keys.TAB)
                .sendKeys("California")
                .sendKeys(Keys.TAB)
                .sendKeys("90044")
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys("CF").perform();

    }
    @And("user clicks the register button")
    public void userClicksTheRegisterButton()  {
        automationPage.registerButton.click();
    }

    @Then("asserts that the new account is created")
    public void assertsThatTheNewAccountIsCreated()  {
        Assert.assertTrue(automationPage.positiveResultText.isDisplayed());
    }
}
