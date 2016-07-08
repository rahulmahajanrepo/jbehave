package com.raltd.steps;

import com.raltd.page.HomePage;
import com.raltd.page.WebPage;
import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.springframework.beans.factory.annotation.Autowired;

@Steps
public class SharedSteps {

    @Autowired
    private HomePage homePage;


    @Given("user is on $pageName site")
    public void userOnHomePage(String pageName) {
        homePage.go();
    }

//    @Then("close page")
//    public void closePage(){
//        homePage.close();
//    }

    @AfterScenario
    public void closeWebPage(){
        homePage.close();
    }
}