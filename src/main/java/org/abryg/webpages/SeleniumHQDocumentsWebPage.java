package org.abryg.webpages;

public class SeleniumHQDocumentsWebPage extends AbstractSeleniumHQWebPage {

    public SeleniumHQDocumentsWebPage() {
        super("Selenium Documentation — Selenium Documentation", "docs/");
    }

    @Override
    public SeleniumHQDocumentsWebPage initializePage() {
        super.initializePage();
        return this;
    }
}
