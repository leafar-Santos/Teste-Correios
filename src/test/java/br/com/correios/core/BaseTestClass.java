package br.com.correios.core;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import java.io.IOException;

import static br.com.correios.core.DriverFactory.killDriver;
import static br.com.correios.utils.TakeScreenShot.takeScreenShot;

public class BaseTestClass {


    
    @AfterEach
    @DisplayName("Evidência do teste")
    public void screenshoot_test(){
        takeScreenShot();
    }

    @AfterAll
    @DisplayName("Fecha o Browser")
    public static void quitDriver(){
        killDriver();
    }

}
