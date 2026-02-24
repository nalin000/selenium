package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class windowsActivity {
	
	public static void main (String[]args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		//select the drodown by making object of select class
		
		//storing the drodown in a webElement
		WebElement drop=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		//passing the webElement(address of a drodown)
		Select dropdown=new Select(drop);
		//dropdown.selectByIndex(3);
		System.out.println(
				dropdown.getFirstSelectedOption().getText()
				);
		
		
		//if you select by value
		dropdown.selectByValue("USD");
		
	}

}
