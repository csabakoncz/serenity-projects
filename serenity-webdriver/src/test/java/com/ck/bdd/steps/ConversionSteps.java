package com.ck.bdd.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Managed;

public class ConversionSteps {

    @Managed
    private WebDriver webDriver;

    private ConverterPage converterPage;

    @Given("the site '$site' is open")
    public void givenTheSiteIsOpen(String site) {
        webDriver.get(site);
    }

    @When("I enter '$celsius' degrees Celsius")
    public void whenIEnterCelsius(String celsius) {
        converterPage.enterCelsius(celsius);
    }

    @Then("I obtain '$fahrenheit' degrees Fahrenheit")
    public void thenIObtainFahrenheit(String fahrenheit) {
        Assert.assertEquals(fahrenheit, converterPage.getFahrenheit());
    }

}
