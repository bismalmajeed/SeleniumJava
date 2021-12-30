package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "G:\\Katalon_Studio_Windows_64-8.1.0\\Katalon_Studio_Windows_64-8.1.0\\configuration\\resources\\drivers\\firefox_win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		
		WebElement Email = driver.findElement(By.id("identifierId"));
		
		Email.sendKeys("Bismalmajeed@gmail.com");
		
		//When user input any value then get text not work for this use get attribute.
		//System.out.println(Email.getText());
		
		System.out.println(Email.getAttribute("value"));
		System.out.println(Email.getAttribute("Type"));
		
		System.out.println(Email.isDisplayed());
		System.out.println(Email.isEnabled());
		
	 // Thread.sleep(5000);
		
		Email.clear();
		
		
		
		
		
		
		
		
		
		
		

	}

}
