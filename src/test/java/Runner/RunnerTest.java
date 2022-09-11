package Runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/features",glue = {"StepDefinitions"},

        monochrome = true,
        plugin= {"pretty","json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/cucumber.html"   },

        strict = true


)

public class RunnerTest {

}