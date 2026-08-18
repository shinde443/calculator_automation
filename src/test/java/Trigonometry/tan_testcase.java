package Trigonometry;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class tan_testcase {
	
	ChromeDriver driver;
	
	@BeforeSuite
	void lounch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
	}
	
	@BeforeMethod
	void tan30() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='tan']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(1000);
	}

	@AfterClass
	void tan45() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='tan']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(1000);
		 
	}
	
	@Test
	void tan60() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='tan']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(1000);
	}
	
	
	@Test(priority=0)
	void tan90() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='tan']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(9)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(1000);
	}
	
	
	@Test(priority=0)
	void tanpi() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='tan']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='π']")).click();
	     driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(1000);
	}
}
