package calculatorautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class search_field {
	ChromeDriver driver;

	public static void main(String[] args) {
		search_field sf=new search_field();
		sf.launch();
		sf.search();

	}
	
	void launch()
	{
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.calculator.net/");
	}
	
	void search()
	{
		driver.findElement(By.id("calcSearchTerm")).sendKeys("math");
	}

}
