package selenium;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"pretty"},features = "src/test/resources/selenium", glue = "selenium", tags = "@Feature3")
public class Runner3 extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
