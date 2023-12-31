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

import java.time.Duration;

@Test
public class testHealthIndicatorsFilter {
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
//        WebElement clearFilter = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[2]/p-dropdown/div/div[2]/i"));
//        WebElement indicatorFilterTemperature = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]"));
//        WebElement indicatorFilterWeight = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]"));
//        WebElement indicatorFilterPressure = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]"));
//        WebElement indicatorFilterSugar = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[4]"));
//        WebElement indicatorFilterPulse = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[5]"));
//        WebElement indicatorFilterMood = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[6]"));
//        WebElement indicatorFilterAlcohol = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[7]"));
//        WebElement indicatorFilterAmbivalence = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[8]"));
//        WebElement indicatorFilterHealthStatus = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[9]"));
//        WebElement indicatorFilterSkin = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[10]"));

    @Test(description="Filter options clickable")
    public void filterOptionClickable() {
        WebElement indicatorFilterType = driver.findElement(By.xpath("//div[@class='indicator-filter']"));
        Assert.assertTrue(indicatorFilterType.isEnabled());
    }

    @Test(description="Temperature filter works")
    public void filterTemperatureWorks() {
        WebElement indicatorFilterType = driver.findElement(By.xpath("//div[@class='indicator-filter']"));
        indicatorFilterType.click();
        WebElement indicatorFilterTemperature = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]"));
        indicatorFilterTemperature.click();
    }

    //The same for other filter options

    @Test(description = "Can clear filter selection", dependsOnMethods = {"filterTemperatureWorks"})
    public void filterClear() {
        WebElement clearFilter = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[2]/p-dropdown/div/div[2]/i"));
        clearFilter.click();
    }

    @Test(description = "Entry deletion button works")
    public void checkDeletion() {
        WebElement firstEntryDeleteBtn = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[2]/div/div[4]/div/a[2]"));
        WebElement firstEntryDataBefore = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[2]/div/div[3]/div[2]/span"));
        String text = firstEntryDataBefore.getText();
        firstEntryDeleteBtn.click();
        WebElement confirmDeletion = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/p-confirmdialog/div/div/div[3]/p-footer/button[1]"));
        confirmDeletion.click();
        driver.navigate().refresh();

        WebElement firstEntryDataAfter = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[2]/div/div[3]/div[2]/span"));
        String text2 = firstEntryDataAfter.getText();
        Assert.assertNotEquals(text, text2);
    }

}
