package com.cucumber.steps;

import com.cucumber.pages.OtusMainPage;
import com.cucumber.pages.OtusTeacherInvitePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class OtusInviteTeacherStepdefs {
    @When("I select page {string}")
    public void iSelectPageString(String teacher) {
        OtusTeacherInvitePage otusTeacherInvitePage = new OtusTeacherInvitePage();
        otusTeacherInvitePage.getTeacherlinkXpath(teacher);
    }

    @Then("I can click to button invite {string}")
    public void iCanClickToButtonInviteTeacherString( String teacherTileXpath) {
        OtusTeacherInvitePage otusTeacherInvitePage = new OtusTeacherInvitePage();
        assertThat(otusTeacherInvitePage.getTeacherTileXpath()).isEqualToIgnoringCase(teacherTileXpath);
        otusTeacherInvitePage.getTeacherButtonXpath(teacherTileXpath);


    }
}
