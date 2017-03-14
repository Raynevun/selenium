package org.abryg.webpages;

public class SeleniumHQProjectsWebPage extends AbstractSeleniumHQWebPage {

    public SeleniumHQProjectsWebPage() {
        super("Selenium Projects", "projects/");
    }

    @Override
    public SeleniumHQProjectsWebPage initializePage() {
        super.initializePage();
        return this;
    }
}
