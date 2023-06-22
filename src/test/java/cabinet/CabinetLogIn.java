package cabinet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CabinetLogIn {
    public static void logIn(WebDriver driver) {
        String username = "71450643575";
        String password = "123";

        //Opening logging in page
        driver.findElement(By.xpath("//a[@data-testid='signInBtn']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Logging in
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("kc-login")).click();
    }
}
