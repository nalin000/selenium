package introduction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class autoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		List<WebElement>options=driver.findElements(By.cssSelector("ul.ui-autocomplete li.ui-menu-item a"));
		
		for( WebElement option: options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		//click the checknox and finding if it is already clicked or not
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		
//		System.out.println(
//				driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected()
//
//				);
//		
		//to find the no. of checkboxes present, we need to find the common locator to all the boxes
		
		//driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		//using assertions
		//Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		
		Assert.assertEquals(6, driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	}

}
