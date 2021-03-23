package march17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginingUser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/index.php");
		driver.findElement(By.name("uid")).sendKeys("mngr314829");
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("musyset");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	
		
	}
	
	
}
