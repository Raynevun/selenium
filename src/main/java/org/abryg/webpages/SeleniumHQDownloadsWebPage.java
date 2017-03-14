package org.abryg.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumHQDownloadsWebPage extends AbstractSeleniumHQWebPage {

    private By seleniumJavaVersionLocator = By.cssSelector("p +table > tbody > tr:first-child > td:nth-child(2)");
    private By navigationMenu = By.id("nav");
    private String downloadLink = "//div[@id='mainContent']//table[1]//tbody//td[text()='%s']//..//td[4]//a[text()='Download']";

    public SeleniumHQDownloadsWebPage() {
        super("Downloads", "download/");
    }

    @Override
    public SeleniumHQDownloadsWebPage initializePage() {
        super.initializePage();
        locateElement(navigationMenu);
        locateElement(seleniumJavaVersionLocator);
        return this;
    }

    public Boolean verifySeleniumJavaVersion(String expectedSeleniumJavaVersion) {
        return verifyElementText(seleniumJavaVersionLocator, expectedSeleniumJavaVersion);
    }

    public WebElement hasDownloadLinkFor(String linkText) {
        By downloadLinkLocator = By.xpath(String.format(downloadLink, linkText));
        return locateElement(downloadLinkLocator);
    }
}
