package com.cucumber.pages;

import org.openqa.selenium.By;

public class OtusCalendarLink extends BasePage{
    private String calendarXpath = "//div[@class = 'header2-menu__dropdown']/a[@href = '/events/near/']";
    private String calendarXpathLinkSett = "https://otus.ru/events/calendar/";
    private String calendarXpathTitle = "//div[@class = 'container__col container__col_6 container__col_md-8 container__col_sm-12']//h3";


    public void navigateToCalendarPage ( String calendaXpath){
         waitForElement(By.xpath(calendarXpath)).click();
    }

    public void navigateToCalendarPageSet (){
        waitForElement(By.xpath(calendarXpathLinkSett)).click();

    }

    public void getTitleCalendarSet( String title){
        waitForElement(By.xpath(calendarXpathTitle)).getText();
    }
}
