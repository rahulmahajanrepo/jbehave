package com.raltd.steps;

import com.raltd.page.HomePage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.Objects;

/**
 * Created by Rahul on 06/07/2016.
 */
@Steps
public class HomePageStep {
    @Autowired
    HomePage homePage;

    @Given("user name is $userName")
    public void userIs(String userName) {
        System.out.println("User is: " + userName);
    }

    @Then("header is $title")
    public void headerTitle(String title) {
        Assert.isTrue(Objects.equals("2,210,452", homePage.headerConmponent.getHeaderValue()));
    }
}
