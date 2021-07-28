package march19;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.CloseIgnoringInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Select drpDwn = new Select(driver.findElement(By.xpath("//tbody/tr[11]/td[2]/select[1]")));
		drpDwn.selectByVisibleText("INDIA");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://output.jsbin.com/osebed/2");
		
		Select drpdwn = new Select(driver1.findElement(By.id("fruits")));
		drpdwn.selectByIndex(1);
	/*	Wait wait = new FluentWait<WebDriver>(driver1)
			.withTimeout(Duration.ofSeconds(5));
			.pollingEvery(Duration.ofSeconds(2));
			.CloseIgnoringInputStream(Exception.class);*/
		
		//drpdwn.deselectAll();
		//System.out.println(drpdwn);
		
		String lrt = "http://demo.guru99.com/test/newtours/register.php";
		
		driver.findElement(By.linkText("ADD TO CART")).click();
		//WebDriver.Options.addCookie(null);
		driver1.close();
		driver1.quit();
		
		//driver.close();
		driver.quit();
		
		
		
	}

}
