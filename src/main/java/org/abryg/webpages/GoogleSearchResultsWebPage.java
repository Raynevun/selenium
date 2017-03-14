package org.abryg.webpages;

import org.openqa.selenium.By;

import static org.abryg.Browser.EDGE;
import static org.abryg.Browser.IE;

public class GoogleSearchResultsWebPage extends AbstractGoogleWebPage {

    protected String textToSearch;
    private By searchResultsNavigationBarSelector = By.id("navcnt");

    public GoogleSearchResultsWebPage(String textToSearch) {
        super(textToSearch + " - Szukaj w Google", "#q=" + textToSearch + "&*");

        if (getBrowser().equals(IE) || getBrowser().equals(EDGE)) {
            setPageTitle(textToSearch + " - Google Search");
        }

        this.textToSearch = textToSearch;
    }

    @Override
    public GoogleSearchResultsWebPage initializePage() {
        super.initializePage();
        locateElement(searchResultsNavigationBarSelector);
        return this;
    }

    public void navigateToSearchResultByLink(String link) {
        clickOnElement(By.cssSelector("a[href='" + link + "']"));
    }

    public SeleniumHQMainWebPage navigateToMainSeleniumHQWebPage() {
        navigateToSearchResultByLink("http://www.seleniumhq.org/");
        return new SeleniumHQMainWebPage().initializePage();
    }
}
