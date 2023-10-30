package orangeHRM;

import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String actualTitle=driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle="OrangeHRM";
		
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Title matched");
			
		}
		else
			System.out.println("Title didn't match");
		
		driver.close();
		driver.quit();
	}
	

}
