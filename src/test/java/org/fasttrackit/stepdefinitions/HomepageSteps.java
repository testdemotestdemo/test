package org.fasttrackit.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.fasttrackit.TestBase;

public class HomepageSteps extends TestBase {

    @Given("^I open the homepage$")
    public void iOpenTheHomepage() {
        openHomepage();
    }

}
