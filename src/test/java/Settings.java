import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Settings {

    protected ChromeDriver driver;

    public void setupConfig(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver  = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.MINUTES);


    }
}
