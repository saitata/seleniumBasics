package implement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draggable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Documents\\sell\\drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("http://www.leafground.com/");
		 
		 
		 //drag and drop
		 
		 driver.findElement(By.xpath("//a[@href='pages/drop.html']")).click();
		 Actions action=new Actions(driver);
		    action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
			.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
			.release()
			.build()
			.perform();
		 
		 
	}

}
