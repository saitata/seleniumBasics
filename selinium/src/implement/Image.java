package implement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Documents\\sell\\drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("http://www.leafground.com/");
		 driver.findElement(By.xpath("//a[@href='pages/Image.html']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[@href='pages/Image.html']")).click();
		 driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
		driver.quit();
	}

}
