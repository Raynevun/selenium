package org.abryg.webpages;

public class GoogleMainWebPage extends AbstractGoogleWebPage {

    public GoogleMainWebPage() {
        super("Google", "");
    }

    @Override
    public GoogleMainWebPage initializePage() {
        super.initializePage();
        return this;
    }
}
