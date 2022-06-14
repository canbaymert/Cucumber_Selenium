package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelStepDefinitions {
    Workbook workbook;

    @Given("user prepares the excel file to be read")
    public void userPreparesTheExcelFileToBeRead() throws IOException {
        String filePath= "src/test/resources/Countries.xlsx";
        FileInputStream fis=new FileInputStream(filePath);
        workbook= WorkbookFactory.create(fis);
    }
    @Then("user prints the element on row {int} , column {int} on the excel file")
    public void userPrintsTheElementOnRowColumnOnTheExcelFile(Integer row, Integer column) {
        String cellValue=workbook
                .getSheet("Sheet1")
                .getRow(row-1)
                .getCell(column-1)
                .toString();
        System.out.println("Row no : "+row+" Column no : "+column+ " The value of the cell : " + cellValue);
    }

    @And("user prints the country with capital {string} on the excel file")
    public void userPrintsTheCountryWithCapitalOnTheExcelFile(String capital)  {
        int rowNumber=workbook.getSheet("Sheet1").getLastRowNum();

        for (int i = 0; i <=rowNumber ; i++) {
            if (workbook.getSheet("Sheet1").getRow(i).getCell(1).toString().equals(capital)){
                System.out.println("The city with the capital " +capital+" is "+
                        workbook.getSheet("Sheet1").getRow(i).getCell(0));
            }
        }
    }
    @And("user asserts that the number of the countries are {int} on the excel file")
    public void userAssertsThatTheNumberOfTheCountriesAreOnTheExcelFile(Integer numberOfCountries) {
        int actualNumberOfCountries=workbook.getSheet("Sheet1").getLastRowNum();
        Assert.assertEquals((int) numberOfCountries, actualNumberOfCountries);
    }

    @And("user asserts that the number of the used rows are {int} on the excel file")
    public void userAssertsThatTheNumberOfTheUsedRowsAreOnTheExcelFile(Integer usedRows) {

        int actualFizKulSatir= workbook.getSheet("Sheet1").getPhysicalNumberOfRows();
        Assert.assertEquals((int) usedRows, actualFizKulSatir);
    }
}
