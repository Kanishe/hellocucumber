package com.cucumber.steps;

import com.cucumber.pages.InfoPage;
import com.cucumber.pages.OtusMainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class OtusGetInfo {
    @When("When I select tab {string}")
    public void whenISelectTabTabName(String tabName) {
        OtusMainPage otusMainPage = new OtusMainPage();
        otusMainPage.selectStream(tabName);
    }

    @Then("I should see {string} on {string} page")
    public void iShouldSeeInfoOnTabNamePage() {
        InfoPage infoPage = new InfoPage();

    }
}
