package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepDefinitions","hooks"},
        tags = "@Smoke",
        plugin = {"html:target/cucumber-reports.html",
                "json:target/cucumber-json.json",// json formatında
                "junit:target/cucumber-xml.xml",
                "pretty"}
        // raporlari olustururken format:path seklinde raporun nerede ve hangi formatta olusturacagimizi belirtiriz
)

public class SmokeRunner {
}