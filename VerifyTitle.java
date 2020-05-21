import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
	
	
	@Test
	public void run()
	{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://google.com);
	}
   
	
	//WebDriver driver
	
	/*@Test
	@Parameters("browser")
	public void verifyTitle(String browserName)
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		    driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("ie"))
		{
			driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS)
		driver.get("https://demo.actitime.com/login.do");
		
		System.out.println(driver.getTitle());*/
	}

}
