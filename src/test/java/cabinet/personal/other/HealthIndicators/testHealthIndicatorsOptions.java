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
public class testHealthIndicatorsOptions {
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

        //Click at "Options" button
        driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/a")).click();
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

//        WebElement optionsCloseBtn = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[1]/div/a"));
//        WebElement optionsTempMin = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[1]/div[2]/div[1]/div[1]/input"));
//        WebElement optionsTempMax = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[1]/div[2]/div[1]/div[3]/input"));
//        WebElement optionsWeightMin = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[2]/div[2]/div[1]/div[1]/input"));
//        WebElement optionsWeightMax = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[2]/div[2]/div[1]/div[3]/input"));
//        WebElement optionsPressureUpperMin = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[3]/div[2]/div[1]/div[1]/div[1]/input"));
//        WebElement optionsPressureLowerMin = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[3]/div[2]/div[1]/div[1]/div[3]/input"));
//        WebElement optionsPressureUpperMax = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[3]/div[2]/div[1]/div[2]/div[1]/input"));
//        WebElement optionsPressureLowerMax = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[3]/div[2]/div[1]/div[2]/div[3]/input"));
//        WebElement optionsSugarMin = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[4]/div[2]/div[1]/div[1]/input"));
//        WebElement optionsSugarMax = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[4]/div[2]/div[1]/div[3]/input"));
//        WebElement optionsPulseMin = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[5]/div[2]/div[1]/div[1]/input"));
//        WebElement optionsPulseMax = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[5]/div[2]/div[1]/div[3]/input"));
//        WebElement optionsAlcoholMin = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[6]/div[2]/div[1]/div[1]/input"));
//        WebElement optionsAlcoholMax = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[6]/div[2]/div[1]/div[3]/input"));
//        WebElement optionsAmbivalenceMin = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[7]/div[2]/div[1]/div[1]/input"));
//        WebElement optionsAmbivalenceMax = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[7]/div[2]/div[1]/div[3]/input"));
//        WebElement optionsSaveBtn = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[8]/button"));

    @Test(description = "Closing options works")
    public void closingOptions() {
        WebElement optionsCloseBtn = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[1]/div/a"));
        optionsCloseBtn.click();
        WebElement fromDate = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[3]/div[1]"));
        Assert.assertTrue(fromDate.isEnabled());
    }

    @Test(description = "Opening options works", dependsOnMethods = {"closingOptions"})
    public void openingOptions() {
        driver.navigate().refresh();
        driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/a")).click();
    }

    @Test(description = "Filtering wrong data in text fields", dependsOnMethods = {"openingOptions"})
    public void wrongData() {
        WebElement optionsTempMin = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[1]/div[2]/div[1]/div[1]/input"));
        optionsTempMin.sendKeys("sss");
        WebElement optionsSaveBtn = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[8]/button"));
        Assert.assertFalse(optionsSaveBtn.isEnabled());
    }

    @Test(description = "Options save works", dependsOnMethods = {"wrongData"})
    public void saveOptions() {
        WebElement optionsTempMin = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[1]/div[2]/div[1]/div[1]/input"));
        WebElement optionsSaveBtn = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/app-threshold-setting/p-dialog/div/div/div[2]/div/form/div[8]/button"));

        optionsTempMin.clear();
        optionsTempMin.sendKeys("34");
        optionsSaveBtn.click();

        WebElement textSuccess = driver.findElement(By.xpath("/html/body/app-root/app-toaster/p-toast[1]/div/p-toastitem/div/div/div/div[2]"));
        Assert.assertEquals(textSuccess.getText(), "Пороговые значения сохранены");
    }

}


