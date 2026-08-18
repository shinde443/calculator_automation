package Trigonometry;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class cos_testcase {
	ChromeDriver driver;
	
	@BeforeSuite
	void lounch()
	{
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.calculator.net/");
	}
	
	@BeforeMethod
	void cos30() throws InterruptedException
	{
		 driver.findElement(By.xpath("//span[text()='cos']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(1000);
	}
	
	@Test
	void cos45() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='cos']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(1000);
	}
	
	@AfterClass
	void cos60() throws InterruptedException
	{
		 driver.findElement(By.xpath("//span[text()='cos']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(1000);
	}
	
	@AfterMethod
	void cos90() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='cos']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(9)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(1000);
	}
	
	@AfterTest
	void cospi() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='cos']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='π']")).click();
	     driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(1000);
	}

}
