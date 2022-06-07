package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();

    @Given("user goes to amazon home page")
    public void user_goes_to_amazon_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("user makes a search for laptop keyword")
    public void user_makes_a_search_for_laptop_keyword() {
        amazonPage.searchBox.sendKeys("laptop" + Keys.ENTER);
    }
    @Then("user asserts that the result includes the laptop keyword")
    public void user_asserts_that_the_result_includes_the_lava_keyword() {
        String keyword="laptop";
        String actualResultText= amazonPage.searchResultElement.getText();
        Assert.assertTrue(actualResultText.contains(keyword));
    }
    @Then("user closes the page")
    public void user_closes_the_page() {
        Driver.closeDriver();
    }
    @Then("user makes a search for java keyword")
    public void user_makes_a_search_for_java_keyword() {
        amazonPage.searchBox.sendKeys("java" + Keys.ENTER);
    }

    @Then("user asserts that the result includes the java keyword")
    public void user_asserts_that_the_result_includes_the_java_keyword() {
        String keyword="java";
        String actualResultText= amazonPage.searchResultElement.getText();
        Assert.assertTrue(actualResultText.contains(keyword));
    }
    @And("user makes a search for apple keyword")
    public void user_makes_a_search_for_apple_keyword() {
        amazonPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("user asserts that the result includes the apple keyword")
    public void user_asserts_that_the_result_includes_the_apple_keyword() {
        String keyword="apple";
        String actualResultText= amazonPage.searchResultElement.getText();
        Assert.assertTrue(actualResultText.contains(keyword));
    }
    @And("user makes a search for {string}")
    public void userMakesASearchFor(String keyword) {
        amazonPage.searchBox.sendKeys(keyword + Keys.ENTER);
    }

    @And("user asserts that the result includes the {string}")
    public void userAssertsThatTheResultIncludesThe(String keyword) {
        String actualResultText= amazonPage.searchResultElement.getText();
        Assert.assertTrue(actualResultText.contains(keyword));
    }
    @Given("user goes to {string}")
    public void user_goes_to(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Then("user waits for {int} seconds")
    public void user_waits_for_seconds(Integer seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("user asserts that the URL includes the {string}")
    public void user_asserts_that_the_url_includes_the(String keyword) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(keyword));
    }


}
