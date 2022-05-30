package test;

import org.testng.annotations.Test;

public class Day4 {

	@Test
	public void WebLoginHomeLoan() {
		System.out.println("Web Login Home");
	}

	@Test
	public void MobileLoginHomeLoan() {
		System.out.println("Mobile Login Home");
	}

	@Test(groups = { "Smoke" })
	public void LoginAPIHomeLoan() {
		System.out.println("Api Login Home");
	}
}
