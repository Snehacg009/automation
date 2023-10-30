package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fb {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("abcdefg");
	}

}
