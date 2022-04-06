package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "(//ul[@id='appmenu']/li)[11]//preceding-sibling::li")
    public List<WebElement> mainModules;

    public List<String> getTextOfModules() {
        List<String> moduleTexts = new ArrayList<>();

        for (WebElement module : mainModules ) {
            BrowserUtils.hover(module);
            BrowserUtils.sleep(1);
            moduleTexts.add(module.getText());
        }
        return moduleTexts;
    }

    public void clickModule(String moduleName) {
        String locator = "//ul[@id='appmenu']//span[normalize-space(.)='" + moduleName + "']/..";
        Driver.getDriver().findElement(By.xpath(locator)).click();

    }


}
