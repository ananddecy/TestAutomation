package org.ks.steps;

import org.apache.http.HttpStatus;
import org.ks.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j

public class StepsDefinition {
	
	Response response;
	
	Application applicationFunctions;
	
	String responseJSON = "SampleAPICallv2.json";
	
	@When("user makes a API call")
    public void the_client_issues_POST_hello() throws Throwable {

		response = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");

   
    }
	
	@Then("user gets a successful 200 response")
	public void displayCheapestPriceTest() {
		System.out.println("Then Step");
		System.out.println(response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Then("display the cheapest price for each car type")
	public void displayCheapestPriceForEachType() throws Exception {
		//Application.getMinPriceByCarCode(response.asString());
		Application.getMinPriceByCarCode(responseJSON);
		
	}
	
	@Then("display the cheapest overall price for all cars")
	public void displayCheapestPriceForAllType() throws Exception {
		Double cheapestCarPrice = Application.getMinPriceAcrossAllCars(responseJSON);
		
		
	}
	
	@Then("sorting Corporate Car Group from low to high prices")
	public void sortPriceForCorporateCarGroup() throws Exception {
		Application.sortPriceCorporateCarGroup(responseJSON, "CORPORATE");
		
		
	}
	
	
}
