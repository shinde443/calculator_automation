package calculatorautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class calculatorpage {
	
	ChromeDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		
		calculatorpage op=new calculatorpage();
		op.driver=new ChromeDriver();
		
	
		op.driver.manage().window().maximize();
		op.driver.get("https://www.calculator.net/");
		
	
		op.addition();
		op.subtraction();
		op.multiplication();
		op.division();
		op.decimal();
		
	}
	void addition() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@class='scinm']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='sciop']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(9)']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		driver.findElement(By.xpath("//span[@class='scieq']")).click();

		Thread.sleep(1000);
		System.out.println("pluse button is clicked successfully");
		
	}
	void subtraction() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[text()='-']")).click();                                 //subtraction syambol
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='scieq']")).click();

		System.out.println("subtraction button is clicked successfully");
		//driver.findElement(By.linkText("Back")).click();
		driver.findElement(By.xpath("//span[text()='AC']")).click();
		Thread.sleep(1000);
		
		
	}
	void multiplication() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[text()='*']")).click();                                 //multiplication symbol
		//driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		//driver.findElement(By.linkText("Back")).click();
		driver.findElement(By.xpath("//span[@class='scieq']")).click();

		System.out.println("multiplication button is clicked successfully");
		
	}
	void division() throws InterruptedException {
		driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(7)']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[text()='/']")).click();                          //division symbol
		//driver.findElement(By.linkText("/")).click();
		
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		driver.findElement(By.xpath("//span[@class='scieq']")).click();
		System.out.println("division button is clicked successfully");
	}
	
	void decimal() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//span[@onclick='r('.')']")).click();                                       //decimal
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='sciop']")).click();                        //addition
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@onclick='r(9)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		
		driver.findElement(By.xpath("//span[@class='scieq']")).click();
		System.out.println("decimal button is clicked successfully");
		
	}
	
	

}

