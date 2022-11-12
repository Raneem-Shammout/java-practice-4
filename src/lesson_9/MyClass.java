package lesson_9;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\my new driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
//		driver.get("http://127.0.0.1:5500/index.html");
//		
//		driver.findElement(By.id("My-Select")).click();
//		
//		Keys theKeys = Keys.ARROW_DOWN;
				
//		driver.findElement(By.id("My-Select")).sendKeys("c"+Keys.ENTER);

		
		driver.get("https://www.booking.com/");
		
		driver.manage().window().maximize();
		
		String testCase = "amman";
		Keys ktesKey = Keys.ARROW_DOWN;
		Keys etestKey = Keys.ENTER;
		
		
		driver.findElement(By.name("ss")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("ss")).sendKeys(testCase);
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("ss")).sendKeys(ktesKey);
		
		Thread.sleep(3000);

		driver.findElement(By.name("ss")).sendKeys(etestKey);
		
		

	}

}
