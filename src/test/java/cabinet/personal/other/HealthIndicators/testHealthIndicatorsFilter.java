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

    @Test(description="Can select filter option")
    public void filterTemperatureClickable() {
        WebElement indicatorFilterType = driver.findElement(By.xpath("//div[@class='indicator-filter']"));
        indicatorFilterType.click();
        WebElement indicatorFilterTemperature = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]"));
        indicatorFilterTemperature.click();
    }

    @Test(description="Temperature filter works")
    public void filterTemperatureWorks() {
        WebElement indicatorFilterType = driver.findElement(By.xpath("//div[@class='indicator-filter']"));
        indicatorFilterType.click();
        WebElement indicatorFilterTemperature = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]"));
        indicatorFilterTemperature.click();
        WebElement entryType = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[2]/div/div[2]/div[2]"));
        Assert.assertEquals(entryType.getText(), "Температура");
    }

    @Test(description = "Cal clear filter selection")
    public void filterClear() {
        WebElement indicatorFilterType = driver.findElement(By.xpath("//div[@class='indicator-filter']"));
        indicatorFilterType.click();
        WebElement indicatorFilterTemperature = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]"));
        indicatorFilterTemperature.click();
        WebElement clearFilter = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[2]/p-dropdown/div/div[2]/i"));
        clearFilter.click();
    }


    //The same for other filter options
}
