package br.com.correios.utils;
import br.com.correios.core.DriverFactory;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;
public class TakeScreenShot {


    /*
    public static TestName testName = new TestName();
    public static void takeScreenShot() throws IOException {
        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File evd = ss.getScreenshotAs(OutputType.FILE);
        Files.copy(evd, new File("screenshots"+File.separator+testName.getMethodName()+".png"));
    }
*/
    @DisplayName("Evidência do teste")
    public static void takeScreenShot(){
        Allure.addAttachment("Evidência do teste", new ByteArrayInputStream(((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES)));
    }

}
