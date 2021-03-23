package march18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.guru99.com/creating-keyword-hybrid-frameworks-with-selenium.html";
		driver.get(url);
		
		int urlLength = url.length();
		
		System.out.println(url);
		System.out.println("Length of the Url  ---	"+urlLength);
		
		String actualUrl = driver.getCurrentUrl();
		  
		if (actualUrl.equals(url)) {
			
			System.out.println("ActualUrl is Equals CurrentUrl  ---	"+url);
		}
		else {
			System.out.println("ActualUrl is Not Equals CurrentUrl");
		}
		
		
		System.out.println();
		System.out.println("Title of the page	---	"+driver.getTitle());
		String  pagesource = driver.getPageSource();
		int pagesourcelength = pagesource.length();
		System.out.println("Lenth of the PageSource	---	"+pagesourcelength);
		driver.close();
	}
	
	

}
