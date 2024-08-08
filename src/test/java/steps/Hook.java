package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class Hook {

	public WebDriver driver;

	@Before
	public void setup() {

		SeleniumDriver.setUpDriver();
	}

	@After
	public void tearDown(Scenario scenario) {
		// capture the screen shot when fails
		
		if(scenario.isFailed()) {
			driver = SeleniumDriver.getDriver();
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "screenshot");
		}
		SeleniumDriver.tearDown();
	}

	@BeforeAll
	public static void beforeAll() {
		System.out.println("---- before all db connect");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("---- after all closing db connect");
	}

	@BeforeStep
	public void beforeEachStep() {
		System.out.println("----BeforeStep Adding a log");
	}

	@AfterStep
	public void afterEachStep() {

		System.out.println("----AfterStep deleting a log");

	}

}
