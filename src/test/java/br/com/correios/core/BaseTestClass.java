package br.com.correios.core;


import org.junit.jupiter.api.AfterAll;

import java.io.IOException;

import static br.com.correios.core.DriverFactory.killDriver;
import static br.com.correios.utils.TakeScreenShot.takeScreenShot;

public class BaseTestClass {


    @AfterAll
    public static void quitDriver() throws IOException {
        killDriver();
    }

}
