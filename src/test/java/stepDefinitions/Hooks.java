package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks{
	

	public void createPlace() throws IOException
	{
		StepDefinitions m = new StepDefinitions();
		
		if(StepDefinitions.place_id==null)
		{
		m.add_Place_Payload_with("rahul", "french", "Asia");
		m.user_calls_with_http_request("AddPlaceAPI", "POST");
		StepDefinitions.place_id = m.getJsonPath(m.response, "place_id");
		
		}
	}
	
	@Before("@UpdatePlaceAddress")
		public void beforeUpdateScenario() throws IOException
		{
			createPlace();
		}
	
	@Before("@DeletePlace")
		public void beforeDeleteScenerio() throws IOException
		{
			createPlace();
		}
	
	
}
