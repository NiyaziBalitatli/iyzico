package iyzico.AutomationTest;

import org.junit.Test;

import iyzico.AutomationCore.Base;

public class Settings extends Base {
	
	@Test
	public void apiKeyControl(){
		browserRun();
		login();
		apiKey();
	}
	
	@Test //Fail case 
	public void updateMyInformationControl(){
		browserRun();
		login();
		updateMyInformation();
	}
	
	@Test
	public void updateLogoControl(){
		browserRun();
		login();
		updateLogo();
	}
	
	@Test
	public void threeDsecureSettingsUpdateControl(){
		browserRun();
		login();
		threeDsecureSettingsUpdate();
	}
}
