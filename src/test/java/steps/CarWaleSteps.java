package steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.objects.HomePage;
import pages.objects.NewCarsPage;
import pages.objects.ToyotaCarsPage;
import utils.SeleniumDriver;

public class CarWaleSteps {

	HomePage homePage = new HomePage();
	NewCarsPage newCarspage = new NewCarsPage();
	ToyotaCarsPage toyotaCarsPage = new ToyotaCarsPage();

	@Given("user navigates to carwale website")
	public void user_navigates_to_carwale_website() {
		SeleniumDriver.openPage(SeleniumDriver.config.getProperty("testsiteurl"));
	}

	@When("user mouseover to new cars")
	public void user_mouseover_to_new_cars() {

		homePage.mouseOverNewCars();

	}

	@Then("user clicks on find new cars")
	public void user_clicks_on_find_new_cars() {

		homePage.clickFindNewcars();

	}

	@Then("user clicks on toyota car")
	public void user_clicks_on_toyota_car() {
		newCarspage.gotoToyota();
	}

	@Then("user validates cartitle as toyota cars")
	public void user_validates_cartitle_as_toyota_cars() {
		
		System.out.println(toyotaCarsPage.getCarTitle());

		Assert.assertTrue(toyotaCarsPage.getCarTitle().equals("Toyota Cars"));

	}
	
	/*
	 * @Then("user clicks on {string} car") public void user_clicks_on_car(String
	 * carBrand) {
	 * 
	 * if(carBrand.equals("Toyota")) newCarspage.gotoToyota(); else
	 * if(carBrand.equals("Kia")) newCarspage.gotoKia(); else
	 * if(carBrand.equals("Honda")) newCarspage.gotoHonda();
	 * 
	 * }
	 */
	
	/*
	 * @Then("user validates cartitle as {string} cars") public void
	 * user_validates_cartitle_as_cars(String carTitle) {
	 * 
	 * System.out.println(toyotaCarsPage.getCarTitle());
	 * 
	 * Assert.assertTrue(toyotaCarsPage.getCarTitle().equals(carTitle));
	 * 
	 * 
	 * }
	 */

}
