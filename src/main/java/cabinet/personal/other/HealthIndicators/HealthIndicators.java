package cabinet.personal.other.HealthIndicators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HealthIndicators {

    public static void openingHealthIndicators(WebDriver driver) {
        driver.findElement(By.xpath("//a[@routerlink='/account/card/health']")).click();
    }

    public static void findElements(WebDriver driver) {
//        WebElement addIndicator = driver.findElement(By.xpath("//div[@class='create-block']"));
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


//        WebElement indicatorFilterType = driver.findElement(By.xpath("//div[@class='indicator-filter']"));
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


        WebElement fromDate = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[3]/div[1]"));
        WebElement tillDate = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/div/div[3]/div[2]"));
        WebElement clearDate = driver.findElement(By.xpath("//a[@class='clear']"));


//        WebElement optionsBtn = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[1]/a"));
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

        WebElement firstEntryDateAndTime = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[3]/div/div[1]/div[2]"));
        WebElement firstEntryMeasure = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[3]/div/div[2]/div[2]"));
        WebElement firstEntryData = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[3]/div/div[3]/div[2]/span"));
        WebElement firstEntryEditBtn = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[3]/div/div[4]/div/a[1]"));
        WebElement firstEntryDeleteBtn = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[3]/div/div[4]/div/a[2]"));


//        WebElement entryListBackPage = driver.findElement(By.xpath("//a[@aria-label='Назад page']"));
        WebElement entryListForwardPage = driver.findElement(By.xpath("//a[@aria-label='Вперед page']"));
        WebElement entryListPareThree = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[2]/div/div/div[2]/pagination-controls/pagination-template/ul/li[5]/a"));
        WebElement entryListQuantityCheckbox = driver.findElement(By.xpath("//*[@id=\"page-size-container\"]/p-dropdown/div/div[2]"));
        entryListQuantityCheckbox.click();
        WebElement entryListQuantity5 = driver.findElement(By.xpath("//*[@id=\"page-size-container\"]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]"));
        WebElement entryListQuantity10 = driver.findElement(By.xpath("//*[@id=\"page-size-container\"]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]"));
        WebElement entryListQuantity20 = driver.findElement(By.xpath("//*[@id=\"page-size-container\"]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]"));

    }



}
