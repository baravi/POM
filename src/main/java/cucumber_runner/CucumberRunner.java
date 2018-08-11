package cucumber_runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/main/java/cucumberproject/cucumberFeature.feature",glue="cucummberjavapackage",monochrome=true,tags="@Smoke and @Sanity")


public class CucumberRunner {


}
