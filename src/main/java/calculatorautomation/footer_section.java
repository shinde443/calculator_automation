package calculatorautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class footer_section {
	ChromeDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		footer_section fs=new footer_section();
		fs.launch();
		fs.footer();
		
	}
		
		void launch()
		{
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.calculator.net/");
		}
		
		void footer() throws InterruptedException
		{
			driver.findElement(By.linkText("about us")).click();
			driver.navigate().back();
			Thread.sleep(1000);
			
			driver.findElement(By.linkText("sitemap")).click();
			driver.navigate().back();
			Thread.sleep(1000);
			
			driver.findElement(By.linkText("terms of use")).click();
			driver.navigate().back();
			Thread.sleep(1000);
			
			driver.findElement(By.linkText("privacy policy")).click();
			driver.navigate().back();
			Thread.sleep(1000);
			
			driver.findElement(By.linkText("calculator.net")).click();
			driver.navigate().back();
			Thread.sleep(1000);
			
		}

	

}
