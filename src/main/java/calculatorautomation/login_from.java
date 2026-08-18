package calculatorautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_from {

	ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		login_from lf=new login_from();
		lf.launch();
		lf.info();

	}
	void launch()
	{
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.calculator.net/");
	}
	void info() throws InterruptedException
	{
		driver.findElement(By.linkText("sign in")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shindesujata@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sujata@123");
		
		driver.findElement(By.linkText("Forget password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/form/table/tbody/tr[1]/td/input")).sendKeys("patilsujata@gmail.com");
		//driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("Create a free account")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("sujata");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/table/tbody/tr[2]/td/input")).sendKeys("shindesujata@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/table/tbody/tr[3]/td/input")).sendKeys("sujata@1502");
		driver.findElement(By.xpath("//input[@name='password2']")).sendKeys("sujata@1502");
		driver.findElement(By.id("agreeterm")).click();
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

}
