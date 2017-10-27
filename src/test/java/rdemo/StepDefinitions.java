package rdemo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitions {
	
	@Given("^I navigated to the zoo website$")
	public void i_navigated_to_the_zoo_website() throws Throwable {
		System.out.println("Navigated to Zoo Website");
	}

	@When("^I click on the adoption link$")
	public void i_click_on_the_adoption_link() throws Throwable {
		System.out.println("Clicked on Adoption link");
	}

	@Then("^I check to see that animals are available$")
	public void i_check_to_see_that_animals_are_available() throws Throwable {
		//System.out.println("Checked to see animals are available");
		Assert.assertFalse(true);
	}

}
