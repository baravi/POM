package cucummberjavapackage;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void beforeScn (Scenario scn) {
		
		
		System.out.println(scn.getName());
		System.out.println(scn.getId());
		
		
	}

	@After
	public void afterScn(Scenario scn) {
		
		System.out.println(scn.getStatus());
		System.out.println(scn.isFailed());
		
		
	}
	
	
	
	
	
	

}
