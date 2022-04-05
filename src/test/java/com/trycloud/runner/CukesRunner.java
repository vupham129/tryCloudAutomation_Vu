package com.trycloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                // "pretty", //just prints out additional information about the scenario that is being executed
                "json:target/cucumber.json",
                "html:target/cucumber-reports.html",
                "junit:target/junit/junit-report.xml",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"

        },
        features = "src/test/resources/features",
        glue = "src/test/java/com/trycloud/step_definitions",
        dryRun = false,
        tags ="@wip",
        publish = true //will enable a functionality from cucumber to generate a public link to share someone

)
public class CukesRunner {
}
