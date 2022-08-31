package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

/**
 * @author MOULALI
 *
 */
public class Hooks {

	@Before("SanityTest")
	public void setup() {
		//code for prerequsite steps
	}
	
	@After("SanityTest")
	public void teardown() {
		//code for after scenario steps
	}
}
