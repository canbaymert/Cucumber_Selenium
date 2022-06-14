package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {

    GuruPage guruPage = new GuruPage();

    @And("user accepts cookies on Guru Page")
    public void userAcceptsCookiesOnGuruPage() {
        Driver.getDriver().switchTo().frame(guruPage.cookiesIframe);
        guruPage.acceptCookies.click();
    }

    @And("user prints all elements on the column {string} on Guru Page")
    public void userPrintsAllElementsOnTheColumn(String keyColumn) {

        List<WebElement> headersList = guruPage.headersList;
        int givenHeaderIndex = -5;
        for (int i = 0; i < headersList.size(); i++) {
            if (headersList.get(i).getText().equals(keyColumn)) {
                givenHeaderIndex = i + 1;
                break;
            }
        }
        if (givenHeaderIndex != -5) { // key header is found
            List<WebElement> elementsOfTheKeyColumn =
                    Driver.getDriver().findElements(By.xpath("//tbody//tr//td[" + givenHeaderIndex + "]"));
            for (WebElement each : elementsOfTheKeyColumn
            ) {
                System.out.println(each.getText());
            }
        } else { // key header cannot be found
            System.out.println("The header cannot be found !");
        }
    }
}
