package iyzico.AutomationCore;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;

public class Core {
	
	public String pUserName = "nbibsu@gmail.com";
	public String pPassword = "012345nB";
	public String ppPassword = "678910nB";
	public String pPhoneNumber = "05021213232";
	
	public void scrollDown() throws InterruptedException{
		
		WebElement we = driver.findElement(By.xpath(".//*[@id='application-link'][2]"));
		Coordinates coordinate = ((Locatable)we).getCoordinates();
		coordinate.inViewPort();
	}
	
	public static WebDriver driver;
	public WebElement element;
	
	public void browserRun() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(" https://sandbox-merchant.iyzipay.com/login");
		} catch (Exception e) {
			System.out.println("Browser run hatası!");
		}
	}

}
