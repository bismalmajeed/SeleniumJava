package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class All_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "G:\\Katalon_Studio_Windows_64-8.1.0\\Katalon_Studio_Windows_64-8.1.0\\configuration\\resources\\drivers\\firefox_win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	//ctrl+shift+o;
		
		//By link text
		/*WebElement Element = driver.findElement(By.linkText("Forgot your password?"));
		System.out.println("text of link is "+ Element.getText());
		Element.click();*/
		
		/*WebElement PI = driver.findElement(By.partialLinkText("Orange"));
		System.out.println(PI.getText());
		PI.click();*/
		
		
	/*	WebElement tag = driver.findElement(By.tagName("a"));
		System.out.println(tag.getText());
		tag.click();*/
		
		WebElement tag = driver.findElement(By.name("Submit"));
		//System.out.println(tag.getText());
		tag.click();
		/*
		WebElement username = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/form[1]/div[2]/input[1]"));
		username.sendKeys("Admin");
		
		
		WebElement pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/form[1]/div[3]/input[1]"));
		pass.sendKeys("admin123");
		
		WebElement btn = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/form[1]/div[5]/input[1]"));
		btn.click( );*/
		
		
		
		/*WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin");
		
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		pass.sendKeys("admin123");
		
		WebElement btn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		btn.click( );
		*/
		
		WebElement username = driver.findElement(By.cssSelector("#txtUsername"));
		username.sendKeys("Admin");
		
		
		WebElement pass = driver.findElement(By.cssSelector("#txtPassword"));
		pass.sendKeys("admin123");
		
		WebElement btn = driver.findElement(By.cssSelector("#btnLogin"));
		btn.click( );
		
		
		
		
		
		
		
		
	}
	 

}
