package com.cucumber.pages;

import org.openqa.selenium.By;

public class OtusRecruterPage extends BasePage {
    private String rectuterPageXpath = "//a[@href = '/recruiters-invite/']";
    private String cooperateButtonXpath = "//div[@class= 'container ri-header__content']//button[@title = 'Заполнить заявку на сотрудничество']";

    public void navigateToRectuterPage (String pageName){
        waitForElement(By.xpath(rectuterPageXpath)).click();
    }

    public String getRecruiterTitlePage(){
        return waitForElement(By.xpath(rectuterPageXpath)).getText();
    }

    public String buttonIsAvailability(){
        return waitForElement(By.xpath(cooperateButtonXpath)).getText();
    }
}
