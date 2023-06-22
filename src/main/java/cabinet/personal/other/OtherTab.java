package cabinet.personal.other;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OtherTab {

    public static void openingOtherTab(WebDriver driver) {
        driver.findElement(By.xpath("//a[@routerlink='card']")).click();
    }
}
