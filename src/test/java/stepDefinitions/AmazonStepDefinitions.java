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

    @Given("user goes to Amazon home page")
    public void userGoesAmazon() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("user makes a search for 'Laptop' keyword")
    public void userSearchesLaptop() {
        amazonPage.searchBox.sendKeys("Laptop" + Keys.ENTER);
    }
    @Then("user asserts that the result includes the 'Laptop' keyword")
    public void userAssertsResultIncludesLaptop() {
        String keyword="Laptop";
        String actualResultText= amazonPage.searchResultElement.getText();
        Assert.assertTrue(actualResultText.contains(keyword));
    }
    @Then("user closes the page")
    public void userClosesPage() {
        Driver.closeDriver();
    }
    @Then("user makes a search for 'Java' keyword")
    public void userSearchesJava() {
        amazonPage.searchBox.sendKeys("Java" + Keys.ENTER);
    }

    @Then("user asserts that the result includes the 'Java' keyword")
    public void userAssertsResultIncludesJava() {
        String keyword="Java";
        String actualResultText= amazonPage.searchResultElement.getText();
        Assert.assertTrue(actualResultText.contains(keyword));
    }

    @And("user makes a search for 'Apple' keyword")
    public void userSearchesApple() {
        amazonPage.searchBox.sendKeys("Apple" + Keys.ENTER);
    }

    @Then("user asserts that the result includes the 'Apple' keyword")
    public void userAssertsResultIncludesApple() {
        String keyword="Apple";
        String actualResultText= amazonPage.searchResultElement.getText();
        Assert.assertTrue(actualResultText.contains(keyword));
    }
    @Given("user makes a search for {string}")
    public void searchForUser(String istenenKelime) {
        amazonPage.searchBox.sendKeys(istenenKelime + Keys.ENTER);

    }
    @Given("user asserts that the result includes the {string} keyword")
    public void AssertResultIncludes (String istenenKelime) {
        String keyword=istenenKelime;
        String actualResultText= amazonPage.searchResultElement.getText();

        Assert.assertTrue(actualResultText.contains(keyword));
    }

    @Given("kullanici {string} anasayfasinda") // amazonUrl
    public void kullaniciAnasayfasinda(String istenenUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }

    @And("url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) {

        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
