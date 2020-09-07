package com.cucumber.steps;

import com.cucumber.pages.OtusRecruterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class OtusRecruiterButtonStepDef {


        @When("When I select page {string}")
        public void selectRecruiterPage (String pageName){
            OtusRecruterPage otusRecruterPage = new OtusRecruterPage();
            otusRecruterPage.navigateToRectuterPage(pageName);
        }




        @Then("I should see button {string} on {string}")
        public void verifyButtonCooperate(String cooperate,String isPageRecruiter) {
            OtusRecruterPage otusRecruterPage = new OtusRecruterPage();
            assertThat(otusRecruterPage.getRecruiterTitlePage()).isEqualToIgnoringCase(isPageRecruiter);
            assertThat(otusRecruterPage.buttonIsAvailability()).isEqualTo(cooperate);
        }

}
