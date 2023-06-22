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
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.time.Duration;

@Test
public class testHealthIndicatorsNewEntry {
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

        //Click at "Add indicator" button
        driver.findElement(By.xpath("//div[@class='create-block']")).click();
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

//        WebElement newEntryFormClose = driver.findElement(By.xpath("//a[contains(@class, 'ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all ng-star-inserted')]"));
//        WebElement newEntryDateAndTime = driver.findElement(By.xpath("//span[contains(@class, 'create-date-calendar ui-calendar')]"));
//        WebElement newEntryTemp = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-new-record/p-dialog/div/div/div[2]/form/div[1]/div[2]/p-inputmask/input"));
//        WebElement newEntryWeight = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-new-record/p-dialog/div/div/div[2]/form/div[2]/div[2]/input"));
//        WebElement newEntryPressureUpper = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-new-record/p-dialog/div/div/div[2]/form/div[3]/div[2]/div/input[1]"));
//        WebElement newEntryPressureLower = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-new-record/p-dialog/div/div/div[2]/form/div[3]/div[2]/div/input[2]"));
//        WebElement newEntrySugar = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-new-record/p-dialog/div/div/div[2]/form/div[4]/div[2]/input"));
//        WebElement newEntryPulse = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-new-record/p-dialog/div/div/div[2]/form/div[4]/div[2]/input"));
//        WebElement newEntryMood = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-new-record/p-dialog/div/div/div[2]/form/div[6]/div[2]/textarea"));
//        WebElement newEntryAlcohol = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-new-record/p-dialog/div/div/div[2]/form/div[7]/div[2]/input"));
//        WebElement newEntryAmbivalence = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-new-record/p-dialog/div/div/div[2]/form/div[8]/div[2]/input"));
//        WebElement newEntryHealthStatus = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-new-record/p-dialog/div/div/div[2]/form/div[9]/div[2]/textarea"));
//        WebElement newEntrySkin = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-new-record/p-dialog/div/div/div[2]/form/div[10]/div[2]/textarea"));
//        WebElement newEntrySaveBtn = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-new-record/p-dialog/div/div/div[2]/form/div[11]/button"));

    @Test(description = "Weight field filters letters correctly")
    public void weightFiltersLetters() {
        WebElement newEntryWeight = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-new-record/p-dialog/div/div/div[2]/form/div[2]/div[2]/input"));
        newEntryWeight.sendKeys("Test passage");
        WebElement newEntrySaveBtn = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-new-record/p-dialog/div/div/div[2]/form/div[11]/button"));
        Assert.assertFalse(newEntrySaveBtn.isEnabled());
        newEntryWeight.sendKeys("");
    }

    //The same for other fields

    @Test(description = "New entry tab closeable", dependsOnMethods = {"weightFiltersLetters"})
    public void closeNewEntryTab() {
        WebElement newEntryFormClose = driver.findElement(By.xpath("//a[contains(@class, 'ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all ng-star-inserted')]"));
        newEntryFormClose.click();
        WebElement fromDate = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[3]/div[1]"));
        Assert.assertTrue(fromDate.isEnabled());
    }

    @Test(description = "Saving new entry works", dependsOnMethods = {"closeNewEntryTab"})
    public void saveNewEntry() {
        WebElement firstEntryDataBefore = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[2]/div/div[3]/div[2]/span"));
        String text = firstEntryDataBefore.getText();

        //opening new entry form
        driver.findElement(By.xpath("//div[@class='create-block']")).click();

        WebElement newEntryMood = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-new-record/p-dialog/div/div/div[2]/form/div[6]/div[2]/textarea"));
        newEntryMood.sendKeys(String.valueOf(Math.random()*10000));
        WebElement newEntrySaveBtn = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-new-record/p-dialog/div/div/div[2]/form/div[11]/button"));
        newEntrySaveBtn.click();

        driver.navigate().refresh();
        WebElement firstEntryDataAfter = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[2]/div/div[3]/div[2]/span"));
        String text2 = firstEntryDataAfter.getText();

        Assert.assertNotEquals(text, text2);
    }
}
