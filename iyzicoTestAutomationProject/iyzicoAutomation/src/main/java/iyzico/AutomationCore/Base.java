package iyzico.AutomationCore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base extends Core {
	
	public String pMerchant = "222";
	public String pWorkingArea = "Şirket";
	public String pLegalCompanyTitle = "Yasal alan";
	public String pWebsite = "wwww.niyazi.com";
	public String pTrIban = "0000000000000";
	public String pLogo = "https://upload.wikimedia.org/wikipedia/commons/a/ab/Logo_TV_2015.png";
	public String pThreeDsAmount = "1000000";
	public String pName = "Niyazi";
	public String pSurname = "Balıtatlı";
	

//	Signup Elements
	@FindBy(id = "not-member")
	public WebElement signUpBttn;

	@FindBy(id = "email")
	public WebElement txtEmail;
	
	@FindBy(id = "secretWord")
	public WebElement code;
	
	@FindBy(id = "confirmSecretWord")
	public WebElement confirmCode;
	
	@FindBy(id = "phoneNumber")
	public WebElement phone;
	
	@FindBy(xpath = ".//*[@class='form-group']/button[1]")
	public WebElement signUp;
	
//	Login Elements
	@FindBy(id = "password")
	public WebElement password;
	
	@FindBy(id = "login-button")
	public WebElement loginButton;
	
//	Settings Elements
	@FindBy(xpath = ".//*[@id='application-link'][2]")
	public WebElement settingsButton;
	
	@FindBy(xpath = ".//*[@class='panel-body']/form/div[1]/div/pre")
	public WebElement apiKey;
	
	@FindBy(id = "merchantId")
	public WebElement merchantId;
	
	@FindBy(id = "workingArea")
	public WebElement workingArea;
	
	@FindBy(id = "legalCompanyTitle")
	public WebElement legalCompanyTitle;
	
	@FindBy(id = "website")
	public WebElement website;
	
	@FindBy(id = "iban")
	public WebElement TrIban;
	
	@FindBy(id = ".//*[@id='settingsForm']")
	public WebElement myProfileUpdateButton;////
	
	@FindBy(id = "logoUrl")
	public WebElement logo;
	
	@FindBy(xpath = ".//*[@id='merchantCompanyForm']/div[3]/div/button")
	public WebElement logoUptadeBttn;
	
	@FindBy(id = "forceThreeDsAmount")
	public WebElement threeDsAmount;
	
	@FindBy(xpath = ".//*[@id='forceThreedsForm']/div[2]/div/button")
	public WebElement threeDsecureSettingsUpdateButton;
	
//	Profil Settings Elements
	@FindBy(xpath = ".//*[@class= 'dropdown-toggle']//span")
	public WebElement goToProfileSettings;
	
	@FindBy(xpath = ".//*[@class= 'fa-user']")
	public WebElement userProfileMenu;
	
	@FindBy(id = "name")
	public WebElement name;
	
	@FindBy(id = "surname")
	public WebElement surname;
	
	@FindBy(id = "gsmNumber")
	public WebElement gsmNumber;
	
	@FindBy(xpath = ".//*[@id='profileForm']/div[4]/div/button")
	public WebElement profileUpdateButton;
	
	
//	Change Password Elements
	@FindBy(id = "oldSecretWord")
	public WebElement oldPassword;
	
	@FindBy(id = "newSecretWord")
	public WebElement newPassword;
	
	@FindBy(id = "confirmSecretWord")
	public WebElement newPasswordSecond;
	
	@FindBy(id = "passwordSaveButton")
	public WebElement changePasswordButton;
	
	
//	METHODS
	
	public void SignUpControl(){
		try {
			PageFactory.initElements(driver, this);
			signUpBttn.click();
			txtEmail.sendKeys(pUserName);
			code.sendKeys(pPassword);
			confirmCode.sendKeys(pPassword);
			phone.sendKeys(pPhoneNumber);
			signUp.click();
			Thread.sleep(2000);
			String x = driver.findElement(By.xpath(".//*[@class='form-group']/button[1]")).getText();
			System.out.println(x + " butonuna tıklandı");
			
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Kayıt ol sayfası bulunamadı!");
		}
		driver.close();
	}
	
	
	public void login(){
		try {
			PageFactory.initElements(driver, this);
			txtEmail.sendKeys(pUserName);
			password.sendKeys(pPassword);
			loginButton.click();
			System.out.println("Giriş yapıldı.");
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Giriş yapılamadı!");
		}
	}
	
	public void apiKey(){
		try {
			PageFactory.initElements(driver, this);
			scrollDown();
			settingsButton.click();
			apiKey.click();
			Thread.sleep(2000);
			String x = driver.findElement(By.xpath(".//*[@class='panel-body']/form/div[1]/div/pre")).getText();
			System.out.println(x + " = API anahtarı");
			
		} catch (Exception e) {
			e.getMessage();
			System.out.println("API anahtarı bulunamadı!");
		}
		driver.close();
	}
	
	public void updateMyInformation(){
		try {
			PageFactory.initElements(driver, this);
			scrollDown();
		    settingsButton.click();
		    merchantId.sendKeys(pMerchant);
		    workingArea.sendKeys(pWorkingArea);
		    legalCompanyTitle.sendKeys(pLegalCompanyTitle);
		    website.sendKeys(pWebsite);
		    TrIban.sendKeys(pTrIban);
		    txtEmail.clear();
		    txtEmail.sendKeys(pUserName);
		    myProfileUpdateButton.click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Bilgilerim kısmı güncellenemedi!");
		}
		driver.close();
	}
	
	public void updateLogo(){
		try {
			PageFactory.initElements(driver, this);
			scrollDown();
			settingsButton.click();
			logo.sendKeys(pLogo);
			Thread.sleep(2000);
			logoUptadeBttn.click();
			
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Üye İşyeri Logosu güncellenemedi!");
		}
		driver.close();
	}
	
	public void threeDsecureSettingsUpdate(){
		try {
			PageFactory.initElements(driver, this);
			scrollDown();
			settingsButton.click();
			threeDsAmount.sendKeys(pThreeDsAmount);
			threeDsecureSettingsUpdateButton.click();
			
		} catch (Exception e) {
			e.getMessage();
			System.out.println("3D secure ayarları güncellenemedi!");
		}
		driver.close();
	}
	
	public void profileSettings(){
		try {
			PageFactory.initElements(driver, this);
			goToProfileSettings.click();
			userProfileMenu.click();
			name.clear();name.sendKeys(pName);
			surname.clear();surname.sendKeys(pSurname);
			gsmNumber.clear();gsmNumber.sendKeys(pPhoneNumber);
			profileUpdateButton.click();
			
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Profil ayarları değiştirilemedi!");
		}
		driver.close();
	}
	
	public void changepPassword(){
		try {
			PageFactory.initElements(driver, this);
			goToProfileSettings.click();
			userProfileMenu.click();
			oldPassword.sendKeys(pPassword);
			newPassword.sendKeys(ppPassword);
			newPasswordSecond.sendKeys(ppPassword);
			changePasswordButton.click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Şifre değiştirilemedi!");
			}
	}
	
	public void turnFirstPassword(){
		try {
				PageFactory.initElements(driver, this);
				oldPassword.sendKeys(ppPassword);
				newPassword.sendKeys(pPassword);
				newPasswordSecond.sendKeys(pPassword);
				changePasswordButton.click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Şifre eski haline getirilemedi!");
		}
		driver.close();
	}
}
