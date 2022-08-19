package Neeraj;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Techlistic {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Reema\\Desktop\\Selenium\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			

	driver.get("https://www.techlistic.com/p/selenium-practice-form.html");		
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	WebElement continent = driver.findElement(By.xpath("//span[text()='Continents']"));

	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollIntoView();",continent);

	WebElement listCon = driver.findElement(By.xpath("//select[@id='continents']"));
	listCon.click();
	
	Select s = new Select(listCon);
	s.selectByIndex(5);
	
	
	

	}

}
