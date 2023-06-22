import cabinet.CabinetLogIn;
import cabinet.personal.PersonalCabinet;
import cabinet.personal.other.HealthIndicators.HealthIndicators;
import cabinet.personal.other.OtherTab;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
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

}
