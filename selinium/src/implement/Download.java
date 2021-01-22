package implement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
 //import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Download {
	private RemoteWebDriver driver;
	@BeforeClass
	     public void setUp() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Documents\\sell\\drivers\\chromedriver_win32\\chromedriver.exe");
		   ChromeOptions options=new ChromeOptions();
		   Map<String, Object> prefs=new HashMap<String, Object>();
		   prefs.put("download.prompt_for_download", false);
			options.setExperimentalOption("prefs", prefs);
		 
		   
		   driver= new ChromeDriver(options);
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
	}
	
	@Test
	
	public void fileDownload() throws InterruptedException {
		 driver.get("http://www.leafground.com/");
		 driver.findElement(By.xpath("//a[@href='pages/download.html']")).click();
		 driver.findElement(By.linkText("Download Excel")).click();
		 Thread.sleep(7000);
	}
	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}
}
