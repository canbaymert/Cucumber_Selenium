package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;

public class DataTablesStepDefinitions {
    DataTablesPage dataTablesPage = new DataTablesPage();

    @Then("clicks the New button on Datatables page")
    public void clicksTheNewButtonOnDatatablesPage() {
        dataTablesPage.newButton.click();
    }

    @And("enters {string} as a first name on Datatables page")
    public void entersAsAFirstNameOnDatatablesPage(String firstname) {
        dataTablesPage.firstName.sendKeys(firstname);
    }

    @And("enters {string} as a last name on Datatables page")
    public void entersAsALastNameOnDatatablesPage(String lastName) {
        dataTablesPage.lastName.sendKeys(lastName);
    }

    @And("enters {string} as a position on Datatables page")
    public void entersAsAPositionOnDatatablesPage(String position) {
        dataTablesPage.position.sendKeys(position);
    }

    @And("enters {string} as an office on Datatables page")
    public void entersAsAnOfficeOnDatatablesPage(String office) {
        dataTablesPage.office.sendKeys(office);
    }

    @And("enters {string} as an extension on Datatables page")
    public void entersAsAnExtensionOnDatatablesPage(String extension) {
        dataTablesPage.extn.sendKeys(extension);
    }

    @And("enters {string} as a startDate on Datatables page")
    public void entersAsAStartDateOnDatatablesPage(String startDate) {
        dataTablesPage.startDate.sendKeys(startDate);
    }

    @And("enters {string} as a salary on Datatables page")
    public void entersAsASalaryOnDatatablesPage(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }

    @And("user clicks the create button on Datatables page")
    public void userClicksTheCreateButtonOnDatatablesPage() {
        dataTablesPage.createButton.click();
    }

    @When("user makes a search with first name {string}")
    public void userMakesASearchWithFirstName(String firstname) {
        dataTablesPage.search.sendKeys(firstname);
    }

    @Then("user asserts that result includes the {string}")
    public void userAssertsThatResultIncludesThe(String firstname) {
        Assert.assertTrue(dataTablesPage.searchResultFirstElement.getText().contains(firstname));
    }
}
