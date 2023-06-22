package cabinet.personal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalCabinet {

    public static void openingPersonalCabinet(WebDriver driver) {
        driver.findElement(By.xpath("//div[@class='menu-block login-menu-block ng-star-inserted']")).click();
        driver.findElement(By.xpath("//span [text()='Личный кабинет']")).click();
    }
}
