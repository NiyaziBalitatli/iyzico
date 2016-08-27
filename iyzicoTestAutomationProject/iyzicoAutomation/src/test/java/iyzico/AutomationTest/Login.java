package iyzico.AutomationTest;

import org.junit.Test;

import iyzico.AutomationCore.Base;

public class Login extends Base {
	
	@Test
	public void loginn(){
		browserRun();
		login();
		driver.close();
	}

}
