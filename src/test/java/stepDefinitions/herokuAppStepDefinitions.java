package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuappPage;
import utilities.Driver;

import java.time.Duration;

public class herokuAppStepDefinitions {
    HerokuappPage herokuappPage = new HerokuappPage();

    @And("clicks on the add element button on herokuApp page")
    public void clicksOnTheAddElementButtonOnHerokuAppPage() {
        herokuappPage.addElementButton.click();
    }

    @Then("waits until the delete button is visible on herokuApp page")
    public void waitsUntilTheDeleteButtonIsVisibleOnHerokuAppPage() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herokuappPage.deleteElementButton));
    }

    @And("user asserts that the delete button is visible on herokuApp page")
    public void userAssertsThatTheDeleteButtonIsVisibleOnHerokuAppPage() {
        Assert.assertTrue(herokuappPage.deleteElementButton.isDisplayed());
    }

    @Then("user clicks the delete button on herokuApp page")
    public void userClicksTheDeleteButtonOnHerokuAppPage() {
        herokuappPage.deleteElementButton.click();
    }

    @And("user asserts that the delete button is not visible on herokuApp page")
    public void userAssertsThatTheDeleteButtonIsNotVisibleOnHerokuAppPage() {
        Assert.assertTrue(herokuappPage.deletedItemsList.isEmpty());
    }

}
