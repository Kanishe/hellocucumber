package com.cucumber.steps;

import com.cucumber.pages.OtusCalendarLink;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class OtusCalendarLinkAvailableStepdef {
    @When("I open calendar {string}")
    public void iOpenCalendarLink(String calendaXpath) {
        OtusCalendarLink otusCalendarLink = new OtusCalendarLink();
        otusCalendarLink.navigateToCalendarPage(calendaXpath);
    }

    @Then("I can see calendar {string}" )
    public void iCanDownloadCalendar(String titleCal) {
        OtusCalendarLink otusCalendarLink = new OtusCalendarLink();
        otusCalendarLink.navigateToCalendarPageSet();
        otusCalendarLink.getTitleCalendarSet(titleCal);
    }
}
