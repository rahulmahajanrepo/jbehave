package com.raltd.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

/**
 * Created by Rahul on 07/07/2016.
 */
@Component
public class HeaderConmponent extends WebPage {
    public String getHeaderValue(){
        return driver().findElements(By.cssSelector(".pageHeader dl dd")).get(0).getText();
    }
}
