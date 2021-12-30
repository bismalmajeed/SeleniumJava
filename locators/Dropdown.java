package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "G:\\Katalon_Studio_Windows_64-8.1.0\\Katalon_Studio_Windows_64-8.1.0\\configuration\\resources\\drivers\\firefox_win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dropdown"); 
		
		Select obj = new Select(driver.findElement(By.id("dropdown")));
		 obj.selectByVisibleText("Option 2");
		 Thread.sleep(5000);
		 obj.selectByIndex(1);
		 Thread.sleep(5000);
		// obj.selectByValue("1");
		 	
		 List <WebElement> dropdownvalues = obj.getOptions();
		 System.out.println(dropdownvalues.size());
	
	
		 
		 		//Assignment # Print text of all the values n drop down
		 //Assignment # 2 IsSelected was giving False? Even though it was selected
		 //Assignment 3 =click on ijmage 
		 
	}

}
