package cabinet.personal.other.HealthIndicators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HealthIndicators {

    public static void openingHealthIndicators(WebDriver driver) {
        driver.findElement(By.xpath("//a[@routerlink='/account/card/health']")).click();
    }

}
