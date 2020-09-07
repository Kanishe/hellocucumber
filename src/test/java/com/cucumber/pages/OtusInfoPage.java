package com.cucumber.pages;

import org.openqa.selenium.By;

public class OtusInfoPage extends BasePage{

    public void selectContactPage (String tabName){
        waitForElement(By.linkText("Контакты")).click();
    }
    public String getContactTitlePage() {
        return waitForElement(By.xpath("//div[@class = 'container']/h1")).getText().trim();
    }
    public String getEmail(){
        return waitForElement(By.xpath("//div[@class = 'contacts__email']/a[@title = 'help@otus.ru']")).getText();
    }
}
