package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Daraz_Locators {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "G:\\Katalon_Studio_Windows_64-8.1.0\\Katalon_Studio_Windows_64-8.1.0\\configuration\\resources\\drivers\\firefox_win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sastaticket.pk/");
		
		driver.findElement(By.xpath("//div[contains(text(),'Bus')]")).click();
		
		driver.findElement(By.id("react-select-2-input")).sendKeys("LHR");
		
		driver.findElement(By.id("//div[@class='sc-bdVaJa dJaiQv']//div[@class=' css-gwx3o5-control']")).
			//Element not interactable exception occur due to dependency of one field input to the other field
	}

}
