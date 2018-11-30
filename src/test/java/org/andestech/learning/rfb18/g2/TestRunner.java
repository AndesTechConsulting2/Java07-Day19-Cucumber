package org.andestech.learning.rfb18.g2;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {"pretty","html:target/reports", "json:target/reports/cucke_report.json"},
        snippets = SnippetType.CAMELCASE,
        glue = {"org.andestech.learning.rfb18.g2.steps"}
        //,tags = {"@summa_params"}
       )
public class TestRunner {

}
