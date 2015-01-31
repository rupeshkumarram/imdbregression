package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.GMethods;
import utility.RSummary;

public class Summary_Search {
	
@BeforeTest
		public void setUp() throws IOException{
			GMethods.Login();
	}

@Test

public void search_All() throws IOException{
	
	String QSearch = RSummary.ObjectLocator("NavbarQuickSearch.id");
	String Submit = RSummary.ObjectLocator("NavbarSubmitButton.id");
	
	GMethods.driver.findElement(By.id(QSearch)).sendKeys("Help");
	RSummary.summaryDropdown("all");
	GMethods.driver.findElement(By.id(Submit)).click();
	
}

@Test

public void search_Titles() throws IOException{
	
	String QSearch = RSummary.ObjectLocator("NavbarQuickSearch.id");
	String Submit = RSummary.ObjectLocator("NavbarSubmitButton.id");
	
	GMethods.driver.findElement(By.id(QSearch)).sendKeys("Help");
	RSummary.summaryDropdown("tt");
	GMethods.driver.findElement(By.id(Submit)).click();
	
}

@Test

public void search_TVEpisodes() throws IOException{
	
	String QSearch = RSummary.ObjectLocator("NavbarQuickSearch.id");
	String Submit = RSummary.ObjectLocator("NavbarSubmitButton.id");
	
	GMethods.driver.findElement(By.id(QSearch)).sendKeys("Help");
	RSummary.summaryDropdown("ep");
	GMethods.driver.findElement(By.id(Submit)).click();
	
}

@Test

public void search_Names() throws IOException{
	
	String QSearch = RSummary.ObjectLocator("NavbarQuickSearch.id");
	String Submit = RSummary.ObjectLocator("NavbarSubmitButton.id");
	
	GMethods.driver.findElement(By.id(QSearch)).sendKeys("Help");
	RSummary.summaryDropdown("nm");
	GMethods.driver.findElement(By.id(Submit)).click();
	
}

@Test

public void search_Companies() throws IOException{
	
	String QSearch = RSummary.ObjectLocator("NavbarQuickSearch.id");
	String Submit = RSummary.ObjectLocator("NavbarSubmitButton.id");
	
	GMethods.driver.findElement(By.id(QSearch)).sendKeys("Help");
	RSummary.summaryDropdown("co");
	GMethods.driver.findElement(By.id(Submit)).click();
	
}

@Test

public void search_Keywords() throws IOException{
	
	String QSearch = RSummary.ObjectLocator("NavbarQuickSearch.id");
	String Submit = RSummary.ObjectLocator("NavbarSubmitButton.id");
	
	GMethods.driver.findElement(By.id(QSearch)).sendKeys("Help");
	RSummary.summaryDropdown("kw");
	GMethods.driver.findElement(By.id(Submit)).click();
	
}

@Test

public void search_Characters() throws IOException{
	
	String QSearch = RSummary.ObjectLocator("NavbarQuickSearch.id");
	String Submit = RSummary.ObjectLocator("NavbarSubmitButton.id");
	
	GMethods.driver.findElement(By.id(QSearch)).sendKeys("Help");
	RSummary.summaryDropdown("ch");
	GMethods.driver.findElement(By.id(Submit)).click();
	
}

@Test

public void search_Quotes() throws IOException{
	
	String QSearch = RSummary.ObjectLocator("NavbarQuickSearch.id");
	String Submit = RSummary.ObjectLocator("NavbarSubmitButton.id");
	
	GMethods.driver.findElement(By.id(QSearch)).sendKeys("Help");
	RSummary.summaryDropdown("qu");
	GMethods.driver.findElement(By.id(Submit)).click();
	
}

@Test

public void search_Bios() throws IOException{
	
	String QSearch = RSummary.ObjectLocator("NavbarQuickSearch.id");
	String Submit = RSummary.ObjectLocator("NavbarSubmitButton.id");
	
	GMethods.driver.findElement(By.id(QSearch)).sendKeys("Help");
	RSummary.summaryDropdown("bi");
	GMethods.driver.findElement(By.id(Submit)).click();
	
}

@Test

public void search_Plots() throws IOException{
	
	String QSearch = RSummary.ObjectLocator("NavbarQuickSearch.id");
	String Submit = RSummary.ObjectLocator("NavbarSubmitButton.id");
	
	GMethods.driver.findElement(By.id(QSearch)).sendKeys("Help");
	RSummary.summaryDropdown("pl");
	GMethods.driver.findElement(By.id(Submit)).click();
	
}

}
