package com.cucumber.pages;

import org.openqa.selenium.By;

public class OtusTeacherInvitePage extends BasePage{
    private String teacherlinkXpath = "//div[@class = 'transitional-main__teachers']//a[@href = '/teachers-invite/']";
    private String teacherTileXpath = "//div[@class = 'teachers-invite-header__title']/b";
    private String teacherButtonXpath = "//button[@class = 'new-button new-button_blue new-button_md new-button_wh js-open-modal']";

    public void getTeacherlinkXpath(String teacher){
         waitForElement(By.xpath(teacherlinkXpath)).click();
    }

    public String getTeacherTileXpath (){
        return waitForElement(By.xpath(teacherTileXpath)).getText().trim();
    }

    public void getTeacherButtonXpath( String teacherButton){
        waitForElement(By.xpath(teacherButtonXpath)).click();
    }
}
