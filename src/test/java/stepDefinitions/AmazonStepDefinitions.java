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
    @Then("user makes a search for laptop keyword on Amazon")
    public void user_makes_a_search_for_laptop_keyword_on_Amazon() {
        amazonPage.searchBox.sendKeys("laptop" + Keys.ENTER);
    }
    @Then("user asserts that the result includes the laptop keyword on Amazon")
    public void user_asserts_that_the_result_includes_the_lava_keyword_on_Amazon() {
        String keyword="laptop";
        String actualResultText= amazonPage.searchResultElement.getText();
        Assert.assertTrue(actualResultText.contains(keyword));
    }
    @And("user closes the page")
    public void user_closes_the_page() {
        Driver.closeDriver();
    }
    @Then("user makes a search for java keyword on Amazon")
    public void user_makes_a_search_for_java_keyword_on_Amazon() {
        amazonPage.searchBox.sendKeys("java" + Keys.ENTER);
    }

    @Then("user asserts that the result includes the java keyword on Amazon")
    public void user_asserts_that_the_result_includes_the_java_keyword_on_Amazon() {
        String keyword="java";
        String actualResultText= amazonPage.searchResultElement.getText();
        Assert.assertTrue(actualResultText.contains(keyword));
    }
    @And("user makes a search for apple keyword on Amazon")
    public void user_makes_a_search_for_apple_keyword_on_Amazon() {
        amazonPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("user asserts that the result includes the apple keyword on Amazon")
    public void user_asserts_that_the_result_includes_the_apple_keyword_on_Amazon() {
        String keyword="apple";
        String actualResultText= amazonPage.searchResultElement.getText();
        Assert.assertTrue(actualResultText.contains(keyword));
    }
    @And("user makes a search for {string} on Amazon")
    public void userMakesASearchFor(String keyword) {
        amazonPage.searchBox.sendKeys(keyword + Keys.ENTER);
    }

    @And("user asserts that the result includes the {string} on Amazon")
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
