package introduction;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		//selecting present day only
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		
		//checking enabled or disabled
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		System.out.println(
				driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled()

				);
		

	}

}
