package calculatorautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class claculator {
	ChromeDriver driver;
	
	@BeforeSuite
	void lounch()
	{
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
	}
	@BeforeTest
	void addition() throws InterruptedException
	{
      driver.findElement(By.xpath("//span[@onclick='r(7)']")).click();
      driver.findElement(By.xpath("//span[@class='sciop']")).click();
      driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
      driver.findElement(By.xpath("//span[@class='scieq']")).click();
      Thread.sleep(1000);
	}
	@BeforeClass
	void subtraction() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		//driver.findElement(By.xpath("//span[@onclick='r('-')]")).click();
		driver.findElement(By.xpath("//span[text()='–']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
		driver.findElement(By.xpath("//span[@class='scieq']")).click();
		Thread.sleep(1000);
		
	}
	@BeforeMethod
	void multiplication() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
		//driver.findElement(By.linkText("×")).click();
		driver.findElement(By.xpath("//span[text()='×']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		driver.findElement(By.xpath("//span[@class='scieq']")).click();
		Thread.sleep(1000);
	}
	
	@Test
	void division() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('/')\"]")).click();
		//driver.findElement(By.xpath("//span[text()='by']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@class='scieq']")).click();
		Thread.sleep(1000);
	}

}
