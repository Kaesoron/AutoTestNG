package cabinet.personal.other.HealthIndicators;

import cabinet.CabinetLogIn;
import cabinet.personal.PersonalCabinet;
import cabinet.personal.other.OtherTab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

@Test
public class testHealthIndicatorsPagination {
    private static WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void openTargetPage() {
        //Opening website and awaiting for full download
        driver.get("http://pp86.hostco.ru/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Logging in
        CabinetLogIn.logIn(driver);

        //Opening "personal cabinet"
        PersonalCabinet.openingPersonalCabinet(driver);

        //Switch to tab "other"
        OtherTab.openingOtherTab(driver);

        //opening tab "Health indicators"
        HealthIndicators.openingHealthIndicators(driver);
    }

    /*
    Elements XPath for testing:
*/
//        WebElement fromDate = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[3]/div[1]"));
//        WebElement tillDate = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[3]/div[2]"));
//        WebElement clearDate = driver.findElement(By.xpath("//a[@class='clear']"));
//
//        WebElement firstEntryDateAndTime = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[3]/div/div[1]/div[2]"));
//        WebElement firstEntryMeasure = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[3]/div/div[2]/div[2]"));
//        WebElement firstEntryData = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[3]/div/div[3]/div[2]/span"));
//        WebElement firstEntryEditBtn = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[3]/div/div[4]/div/a[1]"));
//        WebElement firstEntryDeleteBtn = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[3]/div/div[4]/div/a[2]"));
//
//        WebElement entryListQuantityCheckbox = driver.findElement(By.xpath("//*[@id=\"page-size-container\"]/p-dropdown/div/div[2]"));
//

//        WebElement entryListBackPage = driver.findElement(By.xpath("//a[@aria-label='Назад page']"));
//        WebElement entryListForwardPage = driver.findElement(By.xpath("//a[@aria-label='Вперед page']"));
//        WebElement entryListPareThree = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[2]/div/div/div[2]/pagination-controls/pagination-template/ul/li[5]/a"));
//
//
//        WebElement entryListQuantityCheckbox = driver.findElement(By.xpath("//*[@id=\"page-size-container\"]/p-dropdown/div/div[2]"));
//        WebElement entryListQuantity5 = driver.findElement(By.xpath("//*[@id=\"page-size-container\"]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]"));
//        WebElement entryListQuantity10 = driver.findElement(By.xpath("//*[@id=\"page-size-container\"]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]"));
//        WebElement entryListQuantity20 = driver.findElement(By.xpath("//*[@id=\"page-size-container\"]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]"));

    @Test(description = "moving to forward page")
    public void forward() {
        WebElement firstEntryDataBefore = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div[last()]"));
        //moving forward
        WebElement entryListForwardPage = driver.findElement(By.xpath("//a[@aria-label='Вперед page']"));
        entryListForwardPage.click();

        WebElement firstEntryDataAfter = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div[last()]"));
        Assert.assertNotEquals(firstEntryDataAfter.getText(), firstEntryDataBefore.getText());
    }

    @Test(description = "moving to previous page", dependsOnMethods = {"forward"})
    public void back() {
        WebElement firstEntryDataBefore = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div[last()]"));
                //moving backward
        WebElement entryListBackPage = driver.findElement(By.xpath("//a[@aria-label='Назад page']"));
        entryListBackPage.click();

        WebElement firstEntryDataAfter = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div[last()]"));
        Assert.assertNotEquals(firstEntryDataBefore.getText(), firstEntryDataAfter.getText());
    }

    @Test(description = "moving to optional page")
    public void getPageByNumber() {
        WebElement firstEntryDataBefore = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div[last()]"));
        //moving forward
        WebElement entryListPareThree = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[2]/div/div/div[2]/pagination-controls/pagination-template/ul/li[5]/a"));
        entryListPareThree.click();

        WebElement firstEntryDataAfter = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div[last()]"));
        Assert.assertNotEquals(firstEntryDataBefore.getText().substring(0, 300), firstEntryDataAfter.getText().substring(0, 300));
    }

    @Test(description = "changing number of entries on page", dependsOnMethods = {"getPageByNumber"})
    public void changeEntriesNumber() {
        WebElement entryListQuantityCheckbox = driver.findElement(By.xpath("//*[@id=\"page-size-container\"]/p-dropdown/div/div[2]"));
        entryListQuantityCheckbox.click();
        WebElement entryListQuantity5 = driver.findElement(By.xpath("//*[@id=\"page-size-container\"]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]"));
        entryListQuantity5.click();
        WebElement entryListTotal5 = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div[last()]"));

        driver.navigate().refresh();
        WebElement entryListQuantityCheckbox2 = driver.findElement(By.xpath("//*[@id=\"page-size-container\"]/p-dropdown/div/div[2]"));
        entryListQuantityCheckbox2.click();
        WebElement entryListQuantity10 = driver.findElement(By.xpath("//*[@id=\"page-size-container\"]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]"));
        entryListQuantity10.click();
        WebElement entryListTotal10 = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div[last()]"));

        driver.navigate().refresh();
        WebElement entryListQuantityCheckbox3 = driver.findElement(By.xpath("//*[@id=\"page-size-container\"]/p-dropdown/div/div[2]"));
        entryListQuantityCheckbox3.click();
        WebElement entryListQuantity20 = driver.findElement(By.xpath("//*[@id=\"page-size-container\"]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]"));
        entryListQuantity20.click();
        WebElement entryListTotal20 = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div[last()]"));

        Assert.assertNotEquals(entryListTotal5, entryListTotal10);
        Assert.assertNotEquals(entryListTotal5, entryListTotal20);
        Assert.assertNotEquals(entryListTotal10, entryListTotal20);
    }
}

