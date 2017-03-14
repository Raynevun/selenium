package org.abryg.smoketests;

import org.abryg.BaseWebTest;
import org.abryg.webpages.SeleniumHQAboutWebPage;
import org.testng.annotations.Test;

public class PageFactoryTest extends BaseWebTest {

    @Test(testName = "Page Factory Example", groups = "pageFactory")
    public void pageFactoryTest() {
        SeleniumHQAboutWebPage seleniumHQAboutWebPage = new SeleniumHQAboutWebPage();
        seleniumHQAboutWebPage.openPage();
        seleniumHQAboutWebPage.useDocumentationLink();
    }
}
