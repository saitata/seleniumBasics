package implement;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Documents\\sell\\drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("http://www.leafground.com/");
		 driver.findElement(By.xpath("//a[@href='pages/Window.html']")).click();
		 driver.findElement(By.id("home")).click();
		 Set <String> handler=driver.getWindowHandles();
		 Iterator <String> it=handler.iterator();
		 String parentWindowId=it.next();
		 System.out.println("ParentId:"+ parentWindowId);
		 
		 String childWindowId=it.next();
		 System.out.println("ParentId:"+ childWindowId);
		 driver.switchTo().window(childWindowId);
		 System.out.println("window name:"+ driver.getTitle());

	}

}
