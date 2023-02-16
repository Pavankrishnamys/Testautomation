package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Generic_Browser
{
	WebDriver driver1;
	@BeforeMethod
	public void launch()
	{
		WebDriverManager.chromedriver().setup();
		driver1=new ChromeDriver();
	}

}
