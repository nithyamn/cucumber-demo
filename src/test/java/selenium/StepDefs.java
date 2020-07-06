package selenium;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class StepDefs {
    WebDriver driver;
    DesiredCapabilities caps;
    public static final String USERNAME = System.getenv("BROWSERSTACK_USERNAME");
    public static final String AUTOMATE_KEY = System.getenv("BROWSERSTACK_ACCESS_KEY");
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @Given("Open Browser")
    public void open_Browser() throws MalformedURLException {
        //System.setProperty("webdriver.chrome.driver", "/Users/nithyamani/Desktop/chromedrivers/chromedriver83");
        //driver = new ChromeDriver();
        caps = new DesiredCapabilities();
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "80.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("name", "parallel_test");
        caps.setCapability("build", "Cucumber Parallel Execution");


        driver = new RemoteWebDriver(new URL(URL), caps);
    }
    @When("{string} is searched")
    public void is_searched(String string) {
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys(string, Keys.ENTER);
    }
    @Then("Search result should be {string}")
    public void search_result_should_be(String string) {
        if(driver.getTitle().equals(string))
            System.out.println(driver.getTitle());
        else
            System.out.println("False");
        driver.quit();
    }

}
