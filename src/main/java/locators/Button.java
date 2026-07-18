package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Button {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "G:\\Katalon_Studio_Windows_64-8.1.0\\Katalon_Studio_Windows_64-8.1.0\\configuration\\resources\\drivers\\firefox_win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		
		WebElement btn = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
		
		btn.click();
		
	}

}
