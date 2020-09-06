package com.cucumber.steps;

import com.cucumber.pages.OtusInfoPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class OtusContactEmailStepdefs {

    @When("When I select tab {string}")
    public void SelectTabName(String tabName) {
         OtusInfoPage otusInfoPage = new OtusInfoPage();
        otusInfoPage.selectContactPage(tabName);
    }

    @Then("I should see {string} on {string} page")
    public void iShouldSeeInfoOnTabNamePage(String contactInfo,String page) {
        OtusInfoPage infoPage = new OtusInfoPage();
        assertThat(infoPage.getEmail()).isEqualTo(contactInfo);
        assertThat(infoPage.getContactTitlePage()).isEqualTo(page);
    }
}
