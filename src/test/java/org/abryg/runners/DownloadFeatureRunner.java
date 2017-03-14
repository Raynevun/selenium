package org.abryg.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/org/abryg/features/Download.feature",
        glue = "org.abryg.glue",
        format = {"pretty", "html:target/cucumber"})
public class DownloadFeatureRunner extends AbstractTestNGCucumberTests {
}
