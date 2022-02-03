package ReadWrite_Files;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	 FileInputStream fil = new FileInputStream("G:\\\\Selenium tranings\\\\WorkSpace\\\\Session14_1\\\\src\\\\test\\\\java\\\\ReadWrite_Files\\\\TestLogin.properties");
	 Properties prop=new Properties();
	 prop.load(fil);
	 
	 System.setProperty("webdriver.gecko.driver", "G:\\Katalon_Studio_Windows_64-8.1.0\\Katalon_Studio_Windows_64-8.1.0\\configuration\\resources\\drivers\\firefox_win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
	 
	 driver.get(prop.getProperty("url"));
	 //Maximize the window 
	 driver.manage().window().maximize();
	// Its a simple test case to read the details from textfile to login to the Orange HRM site 
	 
	 driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("username"));
	 
	 driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("password"));
 	 
	 driver.findElement(By.id("btnLogin")).click();
	 
	 driver.close();
	 }
}