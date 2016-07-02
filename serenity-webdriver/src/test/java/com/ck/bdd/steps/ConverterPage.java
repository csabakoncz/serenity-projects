package com.ck.bdd.steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import net.serenitybdd.core.pages.PageObject;

public class ConverterPage extends PageObject {

    @FindBy(how = How.NAME, name = "F")
    WebElement fahrenheitInput;

    @FindBy(how = How.NAME, name = "C")
    WebElement celsiusInput;

    public void enterCelsius(String value) {
        celsiusInput.sendKeys(value);
    }

    public String getFahrenheit() {
        return fahrenheitInput.getAttribute("value");
    }
}
