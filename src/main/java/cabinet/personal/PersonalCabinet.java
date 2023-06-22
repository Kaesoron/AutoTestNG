package cabinet.personal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalCabinet {

    public static void openingPersonalCabinet(WebDriver driver) {
        driver.findElement(By.cssSelector("body > app-root > app-header > header > div > div > app-header-desktop > div > div > div")).click();
        driver.findElement(By.xpath("//span [text()='Личный кабинет']")).click();
    }
}
