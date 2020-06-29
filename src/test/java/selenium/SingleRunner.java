package selenium;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"pretty"},features = "src/test/resources/selenium", glue = "selenium")
public class SingleRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

/*
Tags:
@CucumberOptions:
tags = {"@tag1,@tag2"} -> tags = "@tag1 and @tag2" -> scenarios that have both the tags
                          tags = "@tag1 or @tag2" -> scenarios that have either of these tags

tags = {"~@tag1"} -> tags = "not @tag1" -> excluding scenarios that have this tag
*/