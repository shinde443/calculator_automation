package Trigonometry;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sin_testcase {
	
	ChromeDriver driver;
	
//	@Test(priority=1)
//	void lounch()
//	{
//	 driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://www.calculator.net/");
//	}
	
	@Test(priority=2)
	void sin30() throws InterruptedException
	   {
		driver.findElement(By.xpath("//span[@class='scifunc']")).click();
	    driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(2000);
	  }
	
	@Test(priority=3)
	void sin60() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@class='scifunc']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(2000);
	}
	@Test(priority=4)
	void sin45() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@class='scifunc']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(2000);
	}
	
	@Test(priority=5)
	void sin90() throws InterruptedException
	{
		 driver.findElement(By.xpath("//span[@class='scifunc']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(9)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(2000);
	}
	
	@Test(priority=6)
	void sinpi() throws InterruptedException
	{
		 driver.findElement(By.xpath("//span[@class='scifunc']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='π']")).click();
	     driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(2000);
	}

}
