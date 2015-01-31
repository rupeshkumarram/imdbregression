package utility;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String LoginLink = ObjectLocator("LoginLink.id");
		String LoginLinkPopup = ObjectLocator("LoginLinkPopup.xpath");
		String GEmail = ObjectLocator("Googleemail.id");
		String GPassword = ObjectLocator("GooglePassword.id");
		String GSignIn = ObjectLocator("GoogleSihnin.id");
		String FClose = ObjectLocator("CloseFrame.id");
		
		driver.findElement(By.id(LoginLink)).click();
		wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("cboxIframe")));
		driver.findElement(By.xpath(LoginLinkPopup)).click();
		
		String parrentWindow = driver.getWindowHandle();
		for(String childWindow : driver.getWindowHandles()){
			driver.switchTo().window(childWindow);
		}
		
		driver.findElement(By.id(GEmail)).sendKeys("rupesh925@gmail.com");
		driver.findElement(By.id(GPassword)).sendKeys("25rk1983");
		driver.findElement(By.id(GSignIn)).click();
		
		driver.close();
		driver.switchTo().window(parrentWindow);
		driver.findElement(By.id(FClose)).click();

		
	}
	
/*
 * Method Name: ExcelToArray
 * Method Description: This method will login into IMDB
 * Create Date: 05/01/2015
 * 
 */
	
/*
	 * Method Name: Handle multiple window
	 * Method Description: This method will move cursor to next window
	 * Create Date: 28/01/2015
	 * 
*/
	/*
	public static void multipleWindow(){
		String mainwindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		for(String childWindows:childWindow){
			driver.switchTo().window(childWindows);
			
		}
	}
		*/
	

}
