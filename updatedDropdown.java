package introduction;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class updatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		for(int i=0;i<4;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();

		}
			
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//get the text inside of adult box
		System.out.println(
				driver.findElement(By.id("divpaxinfo")).getText()

				);

		
		//Select dropdown=new Select(driver);
		
	}

}
