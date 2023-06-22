package cabinet.personal.other.HealthIndicators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HealthIndicators {

    public static void openingHealthIndicators(WebDriver driver) {
        driver.findElement(By.xpath("//a[@routerlink='/account/card/health']")).click();
    }
}
