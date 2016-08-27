package iyzico.AutomationTest;

import org.junit.Test;

import iyzico.AutomationCore.Base;

public class SignUp extends Base {
	
	@Test
	public void signUpTest(){
		browserRun();
		SignUpControl();
	}

}
