package com.raltd.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by Rahul on 06/07/2016.
 */
@Component
public class HomePage extends WebPage {

    @Autowired
    public HeaderConmponent headerConmponent;

    public void go(){
        driver().manage().window().maximize();
        driver().get("http://localhost:9000/viewer/#/cob/nom/ns/summary");
        //sleep();
        WebDriverWait wait = new WebDriverWait(driver(), 30L);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("treemap-controls-panel")));
        //driver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //sleep();
    }

    public String getPageTitle(){
        //sleep();
        return driver().getTitle();
    }

    public void close(){
        driver().close();
    }

    private void sleep(){
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
