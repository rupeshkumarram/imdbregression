package utility;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GMethods {
	public static WebDriver driver;
	public static WebDriverWait wait;

/*
 * Method Name: ObjectLocator
 * Method Description: Read the object locator from properties file
 * Create Date: 02/01/2015
 * 
 */
	
	public static String ObjectLocator(String temp) throws IOException{
		FileReader reader = new FileReader("PropertiesFile\\globalProperties");
		Properties property = new Properties();
		property.load(reader);
		String ObjectValue = property.getProperty(temp);
		return ObjectValue;
	}
	
/*
 * Method Name: Login
 * Method Description: This method will login into IMDB
 * Create Date: 02/01/2015
 * 
 */
	
	public static void Login() throws IOException{
		driver = new FirefoxDriver();
		driver.get("http://imdb.com");
		
		String LoginLink = ObjectLocator("LoginLink.id");
		String LoginLinkPopup = ObjectLocator("LoginLinkPopup.css");
		driver.findElement(By.id(LoginLink)).click();
		wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(LoginLinkPopup)));
		driver.findElement(By.cssSelector(LoginLinkPopup)).click();
		
	}
	
/*
 * Method Name: ExcelToArray
 * Method Description: This method will login into IMDB
 * Create Date: 05/01/2015
 * 
 */
	
	

}
