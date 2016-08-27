package iyzico.AutomationTest;

import org.junit.Test;

import iyzico.AutomationCore.Base;

public class ProfileSettings extends Base {
	
	@Test
	public void profileSettingsControl(){
		browserRun();
		login();
		profileSettings();
	}
	
	@Test
	public void changePassword(){
		browserRun();
		login();
		changepPassword();
		try {
			Thread.sleep(10000);
			turnFirstPassword();
		} catch (InterruptedException e) {
			System.out.println("İlk şifre onaylanamadı!");
			e.printStackTrace();
		}
	}
}
