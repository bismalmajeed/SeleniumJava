package actionpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Daraz_mouse_hover {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
			
		ChromeDriver driver=new ChromeDriver();
		//FireFoxDriver driver = new FireFox();
			
	      driver.get("https://www.daraz.pk/");
			
			driver.manage().window().maximize();		
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
			//hover to Pets 
		    WebElement pets = driver.findElement(By.xpath("//span[contains(text(),'Groceries & Pets')]"));
			new Actions(driver).moveToElement(pets).perform();
		
			//hover mouse to cat
			WebElement billi = driver.findElement(By.xpath("//span[normalize-space()='Cat']\r\n"));
			new Actions(driver).moveToElement(billi).perform();
		
			//hover mouse to food
			WebElement food = driver.findElement(By.xpath("//ul[@class='lzd-site-menu-grand lzd-site-menu-grand-active']//span[contains(text(),'Food')]"));
			new Actions(driver).moveToElement(food).click().perform();
			
			//click on pouches category of cat food
			WebElement pouches = driver.findElement(By.xpath("//a[@title='Pouches']//img[@class='c36f5Z']"));
			new Actions(driver).moveToElement(pouches).click().perform();
			
			//Select the Felix jelly product
			WebElement felix = driver.findElement(By.xpath("//img[@alt='Felix Sachet Tuna Jelly - 100Gm - Cat Food']"));
			new Actions(driver).moveToElement(felix).click().perform();
			
			//login with email and password
			driver.findElement(By.xpath("//a[normalize-space()='login']")).click();
			driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("enter your enail");
			driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("pass ???");
			driver.findElement(By.xpath("//button[@type='submit']")).click();	
			
			//click on Buy button
			WebElement buy = driver.findElement(By.xpath("//button[contains(@class,'pdp-button pdp-button_type_text pdp-button_theme_bluedaraz pdp-button_size_xl')]"));
			new Actions(driver).moveToElement(buy).click().perform();
			
	}
}
