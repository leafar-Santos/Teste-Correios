package br.com.correios.utils;
import com.google.common.io.Files;
import org.checkerframework.checker.fenum.qual.AwtAlphaCompositingRule;
import org.junit.Rule;
import org.junit.jupiter.api.TestInfo;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;


import static br.com.correios.core.DriverFactory.getDriver;
public class TakeScreenShot {

    public static TestName testName = new TestName();
    public static void takeScreenShot() throws IOException {
        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File evd = ss.getScreenshotAs(OutputType.FILE);
        Files.copy(evd, new File("screenshots"+File.separator+testName.getMethodName()+".png"));
    }
}
