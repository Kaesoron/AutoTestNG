package cabinet.personal.other.HealthIndicators;

import cabinet.CabinetLogIn;
import cabinet.personal.PersonalCabinet;
import cabinet.personal.other.OtherTab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

@Test
public class testHealthIndicatorsDate {
    public static WebDriver driver = new ChromeDriver();

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



    @Test(description = "Possibility to set up period from date")
    public void canSelectDateFrom() {
        WebElement fromDate = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[3]/div[1]"));
        Assert.assertTrue(fromDate.isEnabled());
    }

    @Test(description = "Possibility to set up period till date")
    public void canSelectDatetill() {
        WebElement tillDate = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[3]/div[2]"));
        Assert.assertTrue(tillDate.isEnabled());
    }

    @Test(description = "Date clearance clickable")
    public void canClearDates() {
        WebElement clearDate = driver.findElement(By.xpath("//a[@class='clear']"));
        clearDate.click();
    }

}
