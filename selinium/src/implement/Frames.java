package implement;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Documents\\sell\\drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("http://www.leafground.com/");
		 driver.findElement(By.xpath("//a[@href='pages/frame.html']")).click();
		 //No of frames in page 
			List<WebElement> numOfFrames = driver.findElements(By.tagName("iframe"));
			int numberOfFrames = numOfFrames.size();
            System.out.println("Number of frames in main page : " +numberOfFrames);
            
            //frame1
            WebElement frameOne=driver.findElement(By.xpath("//iframe[@src='default.html']"));
            driver.switchTo().frame(frameOne);
            driver.findElement(By.id("Click")).click();
            Thread.sleep(1000);
            driver.switchTo().defaultContent();
            
            //frame 2
            WebElement frameTwo = driver.findElement(By.xpath("//iframe[@src='page.html']"));
    		driver.switchTo().frame(frameTwo);
    		int numOfFramesInNest = driver.findElements(By.tagName("iframe")).size();
    		System.out.println("Num Of Nested frames : " +numOfFramesInNest);
    		driver.switchTo().frame(0);
    		driver.findElement(By.id("Click1")).click();
    		driver.switchTo().defaultContent();
            
    		//frame 3
    		 WebElement frameThree = driver.findElement(By.xpath("//iframe[@src='countframes.html']"));
     		driver.switchTo().frame(frameThree);
     		int totalFrames=driver.findElements(By.tagName("iframe")).size();
     		System.out.println("Total Frames:"+ totalFrames);
     		Thread.sleep(1000);
     		  driver.switchTo().defaultContent();
     		  driver.navigate().back();
     		  Thread.sleep(1000);
     			driver.close();
     		
	}

}
