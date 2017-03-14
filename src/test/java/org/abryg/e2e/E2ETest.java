package org.abryg.e2e;

import org.abryg.BaseWebTest;
import org.abryg.webpages.GoogleMainWebPage;
import org.abryg.webpages.GoogleSearchResultsWebPage;
import org.abryg.webpages.SeleniumHQDownloadsWebPage;
import org.abryg.webpages.SeleniumHQMainWebPage;
import org.testng.annotations.Test;

public class E2ETest extends BaseWebTest {

    @Test(testName = "E2E Test", groups = "E2E")
    public void e2eTest() {
        GoogleMainWebPage googleMainWebPage = new GoogleMainWebPage();
        googleMainWebPage.openPage();
        GoogleSearchResultsWebPage googleSearchResultsWebPage = googleMainWebPage.searchForSeleniumHQ();
        SeleniumHQMainWebPage seleniumHQMainWebPage = googleSearchResultsWebPage.navigateToMainSeleniumHQWebPage();
        SeleniumHQDownloadsWebPage seleniumHQDownloadsWebPage = seleniumHQMainWebPage.navigateToDownloadsSeleniumHQWebPage();
        seleniumHQDownloadsWebPage.verifySeleniumJavaVersion("3.3.1");
    }
}
