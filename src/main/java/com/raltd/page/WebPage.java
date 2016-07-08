package com.raltd.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by Rahul on 06/07/2016.
 */
@Component
public class WebPage {

    @Autowired
    @Qualifier("ieWebDriver")
    private WebDriver driver;

    public WebDriver driver(){
        //if(driver == null){
            //System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
            //System.setProperty("webdriver.ie.driver", "c:\\IEDriverServer.exe");
            //this.driver = new InternetExplorerDriver();
            //this.driver = new ChromeDriver();;
        //}
        return driver;
    }
}
