package utility;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RSummary {
	
/*
* Method Name: ObjectLocator
* Method Description: Read the object locator from properties file
* Create Date: 02/01/2015
* 
*/
		
	public static String ObjectLocator(String temp) throws IOException{
		FileReader reader = new FileReader("PropertiesFile\\Summary");
		Properties property = new Properties();
		property.load(reader);
		String ObjectValue = property.getProperty(temp);
		return ObjectValue;
	}
	
	
	
/*
* Method Name: summaryDrodown
* Method Description: Select option from dropdown
* Create Date: 29/01/2015
* 
*/
	public static void summaryDropdown(String value){
		WebElement dropdown = GMethods.driver.findElement(By.id("quicksearch"));
		Select select = new Select(dropdown);
	//	List<WebElement> options = select..getOptions();
	//	for(WebElement option : options){
	//		if(option.)
	//	}
		select.selectByValue(value);
	}

}
