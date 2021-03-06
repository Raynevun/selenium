package org.abryg.webpages;

import org.openqa.selenium.By;

import static org.abryg.Browser.IE;

public class SeleniumHQMainWebPage extends AbstractSeleniumHQWebPage {

    protected By testBirdsLogoLocator = By.cssSelector("img[src='/sponsors/testbirds.jpg']");


    public SeleniumHQMainWebPage() {
        super("Selenium - Web Browser Automation", "");
    }

    @Override
    public SeleniumHQMainWebPage initializePage() {
        super.initializePage();
        if (!(getBrowser().equals(IE))) {
            locateElement(testBirdsLogoLocator);
        }
        return this;
    }
}
