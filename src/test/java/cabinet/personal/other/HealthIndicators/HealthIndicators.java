package cabinet.personal.other.HealthIndicators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HealthIndicators {

    public static void openingHealthIndicators(WebDriver driver) {
        driver.findElement(By.xpath("//a[@routerlink='/account/card/health']")).click();
    }

    public static void findElements(WebDriver driver) {

        WebElement firstEntryDateAndTime = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[3]/div/div[1]/div[2]"));
        WebElement firstEntryMeasure = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[3]/div/div[2]/div[2]"));
        WebElement firstEntryData = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[3]/div/div[3]/div[2]/span"));
        WebElement firstEntryEditBtn = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[3]/div/div[4]/div/a[1]"));
        WebElement firstEntryDeleteBtn = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[1]/div/div[2]/div[3]/div/div[4]/div/a[2]"));


//        WebElement entryListBackPage = driver.findElement(By.xpath("//a[@aria-label='Назад page']"));
        WebElement entryListForwardPage = driver.findElement(By.xpath("//a[@aria-label='Вперед page']"));
        WebElement entryListPareThree = driver.findElement(By.xpath("/html/body/app-root/div/app-account/main/app-patient-card/main/div/app-health-indicators/main/div[2]/div/div/div[2]/pagination-controls/pagination-template/ul/li[5]/a"));


        WebElement entryListQuantityCheckbox = driver.findElement(By.xpath("//*[@id=\"page-size-container\"]/p-dropdown/div/div[2]"));
//        WebElement entryListQuantity5 = driver.findElement(By.xpath("//*[@id=\"page-size-container\"]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]"));
//        WebElement entryListQuantity10 = driver.findElement(By.xpath("//*[@id=\"page-size-container\"]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]"));
//        WebElement entryListQuantity20 = driver.findElement(By.xpath("//*[@id=\"page-size-container\"]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]"));

    }



}
