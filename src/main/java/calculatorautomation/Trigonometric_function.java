package calculatorautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trigonometric_function {
	ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Trigonometric_function tf=new Trigonometric_function();
		tf.lounch();
		tf.sin();
		tf.cos();
		tf.tan();
	}
	
		void lounch()
		{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		}

	void sin() throws InterruptedException
	{
		
		//sin(30)
	 driver.findElement(By.xpath("//span[@class='scifunc']")).click();
	 driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[text()='AC']")).click();
	 Thread.sleep(2000);
	 
	 //sin(60)
	 driver.findElement(By.xpath("//span[@class='scifunc']")).click();
	 driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[text()='AC']")).click();
	 Thread.sleep(2000);
	 
	 
	 //sin(90)
	 driver.findElement(By.xpath("//span[@class='scifunc']")).click();
	 driver.findElement(By.xpath("//span[@onclick='r(9)']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[text()='AC']")).click();
	 Thread.sleep(2000);
	 
	 
	 //sin(45)
	 driver.findElement(By.xpath("//span[@class='scifunc']")).click();
	 driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[text()='AC']")).click();
	 Thread.sleep(2000);
	 
	 //sin(pi)
	 driver.findElement(By.xpath("//span[@class='scifunc']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[text()='π']")).click();
     driver.findElement(By.xpath("//span[text()='AC']")).click();
	 Thread.sleep(2000);
	}
	void cos() throws InterruptedException
	{
		
		//cos(pi)
		 driver.findElement(By.xpath("//span[text()='cos']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='π']")).click();
	     driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(2000);
		 
		//cos(0)
		
		 driver.findElement(By.xpath("//span[text()='cos']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(2000);
		
		
		//cos(30)
		 driver.findElement(By.xpath("//span[text()='cos']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(2000);
		 
		 //cos(60)
		 driver.findElement(By.xpath("//span[text()='cos']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(2000);
		 
		 
		 //cos(90)
		 driver.findElement(By.xpath("//span[text()='cos']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(9)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(2000);
		 
		 
		 //cos(45)
		 driver.findElement(By.xpath("//span[text()='cos']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(2000);
		 
	}
	
	void tan() throws InterruptedException
	{
		//tan(pi)
		 driver.findElement(By.xpath("//span[text()='tan']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='π']")).click();
	     driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(2000);
		 
		//tan(0)
		
		 driver.findElement(By.xpath("//span[text()='tan']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(2000);
		
		
		//tan(30)
		 driver.findElement(By.xpath("//span[text()='tan']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(2000);
		 
		 //tan(60)
		 driver.findElement(By.xpath("//span[text()='tan']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(2000);
		 
		 
		 //tan(90)
		 driver.findElement(By.xpath("//span[text()='tan']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(9)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(2000);
		 
		 
		 //tan(45)
		 driver.findElement(By.xpath("//span[text()='tan']")).click();
		 driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='AC']")).click();
		 Thread.sleep(2000);
		 
	}

}
