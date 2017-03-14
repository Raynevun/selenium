package org.abryg.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.abryg.BaseWebTest;
import org.abryg.webpages.SeleniumHQDownloadsWebPage;
import org.abryg.webpages.SeleniumHQMainWebPage;

public class StepDefinitions extends BaseWebTest {
    private SeleniumHQMainWebPage seleniumHQMainWebPage;
    private SeleniumHQDownloadsWebPage seleniumHQDownloadsWebPage;

    @Given("^I am on the Selenium homepage$")
    public void I_am_on_the_Selenium_homepage() {
        seleniumHQMainWebPage = new SeleniumHQMainWebPage();
        seleniumHQMainWebPage.openPage();
    }

    @When("^I click \"([^\"]*)\" tab$")
    public void I_click_tab_on(String tab) {
        if (tab.equals("Download")) {
            seleniumHQDownloadsWebPage = seleniumHQMainWebPage.navigateToDownloadsSeleniumHQWebPage();
        } else {
            throw new RuntimeException("Unrecognised tab: " + tab);
        }
    }

    @Then("^I should see \"([^\"]*)\" download link on Download page$")
    public void I_should_see_download_link_on_download_page(String linkText) {
        seleniumHQDownloadsWebPage.hasDownloadLinkFor(linkText);
    }
}
