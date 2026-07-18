package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Daraz_Locators {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "G:\\Katalon_Studio_Windows_64-8.1.0\\Katalon_Studio_Windows_64-8.1.0\\configuration\\resources\\drivers\\firefox_win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sastaticket.pk/");
		
		driver.findElement(By.xpath("//div[contains(text(),'Bus')]")).click();
		
		driver.findElement(By.id("react-select-2-input")).sendKeys("LHR");
		
		// was previously By.id() with an XPath string passed in by mistake - id doesn't take an XPath
		WebElement destinationInput = driver.findElement(By.cssSelector(".sc-bdVaJa.dJaiQv .css-gwx3o5-control"));
		// Element not interactable exception occurs here since this field depends on the "from" field being filled first
		destinationInput.click();
	}

}
