package march17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic {
  public static void main(String[] args) throws InterruptedException {
	  WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	}

}
