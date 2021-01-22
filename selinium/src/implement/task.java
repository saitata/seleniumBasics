package implement;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class task {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sai\\Documents\\sell\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
//		driver.findElement(By.linkText("Edit")).click();
//		driver.findElement(By.id("email")).sendKeys("sravan19sai@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("hello");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@value='TestLeaf']")).sendKeys("welcome");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@disabled='true']"));
//		driver.navigate().back();

//		driver.findElement(By.linkText("Button")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("home")).click();
//		
//		
//		driver.findElement(By.linkText("HyperLink")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Go to Home Page")).click();

//		driver.findElement(By.linkText("Drop down")).click();
//		Select select=new Select(driver.findElement(By.id("dropdown1")));
//		select.selectByVisibleText("Selenium");
//		Select select1=new Select(driver.findElement(By.name("dropdown2")));
//		select1.selectByVisibleText("Appium");

//		driver.findElement(By.linkText("Radio Button")).click();
//		driver.findElement(By.id("yes")).click();
//		driver.findElement(By.id("no")).click();

//		driver.findElement(By.xpath("//a[@href='pages/checkbox.html']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[3]/input")).click();
//		Thread.sleep(1000);

		// alerts

		driver.findElement(By.xpath("//a[@href='pages/Alert.html']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

		// writing text

		WebElement element = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		Thread.sleep(2000);
		Alert palert = driver.switchTo().alert();
		// Send some text to the alert
		palert.sendKeys("Test User");
		palert.accept();

		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", element1);
		Thread.sleep(2000);
		Alert palert1 = driver.switchTo().alert();
		// Send some text to the alert
		palert1.accept();
		
        driver.findElement(By.id("btn")).click();
            // frames
             //driver.findElement(By.xpath("//a[@href='pages/frame.html']")).click();
		// 3 frame
            // JavascriptExecutor exe = (JavascriptExecutor) driver;
            //Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
           //System.out.println("Number of iframes on the page are " + numberOfFrames);

//		driver.findElement(By.xpath("//a[@href='pages/Window.html']")).click();
//		driver.findElement(By.id("home")).click();

		// driver.quit();
	}

}
