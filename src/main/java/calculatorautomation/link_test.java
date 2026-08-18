package calculatorautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class link_test {
	ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		link_test lt=new link_test();
		lt.launch();
		lt.Financial();
		lt.Fitness();
		lt.Math();
		lt.Other();

	}
	void launch()
	{
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.calculator.net/");
	}
	void Financial() throws InterruptedException
	{
		driver.findElement(By.linkText("Mortgage Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Loan Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Auto Loan Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Interest Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Payment Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Retirement Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Amortization Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Investment Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Inflation Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Finance Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Income Tax Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Compound Interest Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Salary Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Interest Rate Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Sales Tax Calculator")).click();
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	void Fitness() throws InterruptedException
	{
		driver.findElement(By.linkText("BMI Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Calorie Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Body Fat Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("BMR Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Ideal Weight Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Pace Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Pregnancy Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Pregnancy Conception Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Due Date Calculator")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		
	}
	
	void Math() throws InterruptedException
	{
		driver.findElement(By.linkText("Scientific Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Fraction Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Percentage Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Random Number Generator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Triangle Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Standard Deviation Calculator")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		
	}
	
	void Other () throws InterruptedException
	{
		driver.findElement(By.linkText("Age Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Date Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Time Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Hours Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("GPA Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Grade Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Concrete Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Subnet Calculator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Password Generator")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Conversion Calculator")).click();
		driver.navigate().back();
		Thread.sleep(2000);
	}

}
