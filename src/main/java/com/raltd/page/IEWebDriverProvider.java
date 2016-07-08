package com.raltd.page;

import java.io.*;

import org.apache.commons.io.IOUtils;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * Created by Rahul on 08/07/2016.
 */
@Component
public class IEWebDriverProvider implements WebDriverProvider {

    @Autowired
    @Qualifier("ieWebDriver")
    private WebDriver driver;

    @Override
    public WebDriver get() {
        System.out.println("IEWebDriverProvider Get");
        return driver;
    }

    @Override
    public void initialize() {
        System.out.println("IEWebDriverProvider initialize");
    }

    @Override
    public boolean saveScreenshotTo(String path) {
        if (driver instanceof TakesScreenshot) {
            File file = new File(path);
            byte[] bytes = (byte[]) ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            file.getParentFile().mkdirs();

            try {
                file.createNewFile();
                IOUtils.write(bytes, new FileOutputStream(file));
                return true;
            } catch (IOException e) {
                throw new RuntimeException("Can not save file");
            }
        } else {
            return false;
        }
    }

    @Override
    public void end() {
        System.out.println("IEWebDriverProvider end");
        this.driver.quit();
    }
}
