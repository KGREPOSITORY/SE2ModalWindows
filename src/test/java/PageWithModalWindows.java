import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageWithModalWindows {
    final private String  jsAlertButtonXPath = "//button[@onclick='jsAlert()']";
    final private String   jsConfirmButtonXPath = "//button[@onclick='jsConfirm()']";
    final private String   jsPromptButtonXPath = "//button[@onclick='jsPrompt()']";
    final private String   resultXPath = "//p[@id='result']";
    final private String   resultJSAlertText = "You successfuly clicked an alert";
    final private String   resultJSConfirmText = "You clicked: Ok";
    final private String   resultJSPromptText = "You entered: ";
    private String randomText = new TextGenerator().generateText();


    public boolean ClickJsAlertButtonAndClickOkAtModalWindow (ChromeDriver driver, String jsAlertButtonXPath) throws InterruptedException {
        driver.findElement(By.xpath(jsAlertButtonXPath)).click();
        Thread.sleep(1000);
        Alert alert = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.alertIsPresent());
        alert.accept();
        if (driver.findElement(By.xpath(resultXPath)).getText().equals(resultJSAlertText)){
            return true;
        }else return false;
    }
    public boolean ClickJsConfirmButtonAndClickOkAtModalWindow (ChromeDriver driver, String jsConfirmButtonXPath) throws InterruptedException {
        driver.findElement(By.xpath(jsConfirmButtonXPath)).click();
        Thread.sleep(1000);
        Alert alert = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.alertIsPresent());
        alert.accept();
        if (driver.findElement(By.xpath(resultXPath)).getText().equals(resultJSConfirmText)){
            return true;
        }else return false;
    }
    public boolean ClickJjsPromptButtonEnterTextAndClickOkAtModalWindow (ChromeDriver driver, String jsPromptButtonXPath) throws InterruptedException {
        driver.findElement(By.xpath(jsPromptButtonXPath)).click();
        Thread.sleep(1000);
        Alert alert = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.alertIsPresent());
        alert.sendKeys(randomText);
        alert.accept();
        if (driver.findElement(By.xpath(resultXPath)).getText().equals(resultJSPromptText + randomText)) {
            return true;
        } else return false;
    }


    public String getJsAlertButtonXPath() {
        return jsAlertButtonXPath;
    }

    public String getJsConfirmButtonXPath() {
        return jsConfirmButtonXPath;
    }

    public String getJsPromptButtonXPath() {
        return jsPromptButtonXPath;
    }
}
