import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class TestRunner extends Settings {
    PageWithModalWindows pageWithModalWindows = new PageWithModalWindows();



    @Before
    public void setupSettings(){
        setupConfig();
    }

    @Test
    public void RunTest () throws InterruptedException, IOException {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        Assert.assertTrue(pageWithModalWindows.
                ClickJsAlertButtonAndClickOkAtModalWindow(driver, pageWithModalWindows.getJsAlertButtonXPath()));
        Thread.sleep(1000);
        Assert.assertTrue(pageWithModalWindows.
               ClickJsConfirmButtonAndClickOkAtModalWindow(driver, pageWithModalWindows.getJsConfirmButtonXPath()));
        Thread.sleep(1000);
        Assert.assertTrue(pageWithModalWindows.
                ClickJjsPromptButtonEnterTextAndClickOkAtModalWindow(driver, pageWithModalWindows.getJsPromptButtonXPath())); 

    }
}
