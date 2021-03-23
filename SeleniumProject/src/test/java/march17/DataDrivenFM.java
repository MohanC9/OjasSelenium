package march17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.math3.analysis.function.Add;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenFM {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		File file = new File("C:\\Users\\mc21191\\Downloads\\Book1.xlsx");
		
		FileInputStream fileinput= new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fileinput);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		//XSSFRow row = sheet.getRow(1);
		
		//XSSFCell cell = row.getCell(3);
		
		//String string = cell.getStringCellValue();
		
		//System.out.println(string);
		
		int rowcount = sheet.getLastRowNum()- sheet.getFirstRowNum();
		
		/*for (int i = 0; i<=rowcount; i++) {
			int cellcount = sheet.getRow(i).getLastCellNum();
			System.out.println("Row No of "+i+" Data of --");
			
		for(int j=0; j<cellcount; j++) {
			System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+",");
			
		}
		System.out.println();
		
		}
		*/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement Name = driver.findElement(By.id("firstName"));
		Name.sendKeys("tydrtdyt");
		WebElement LastName = driver.findElement(By.id("lastName"));
		LastName.sendKeys("jdhgwuigd");
		WebElement MailId = driver.findElement(By.id("userEmail"));
		MailId.sendKeys("gjhsh@gmail.com");
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();;
		WebElement MobileNo = driver.findElement(By.id("userNumber"));
		MobileNo.sendKeys("8411444566");
		WebElement Address = driver.findElement(By.id("currentAddress"));
		Address.sendKeys("las vegas");
		WebElement Submit = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/form/div[11]/div/button"));
		Submit.submit();
		
		WebElement ConfirmationMsg = driver.findElement(By.id("example-modal-sizes-title-lg"));
		
		//XSSFCell cell = sheet.getRow(i).createCell(6);
		
		if (ConfirmationMsg.isDisplayed()) {
			 
			System.out.println("PASS");
		}
		else {System.out.println("FAIL");
	}
	
		/*for(int i =0; i<=rowcount; i++) {
			Name.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
			LastName.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
			MailId.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
			Gender.sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
			MobileNo.sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
			Address.sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click", Gender);
			
			
			Submit.submit();
			
			WebElement ConfirmationMsg = driver.findElement(By.id("example-modal-sizes-title-lg"));
			
			XSSFCell cell = sheet.getRow(i).createCell(6);
			
			if (ConfirmationMsg.isDisplayed()) {
				 
				cell.setCellValue("PASS");
			}
			else {cell.setCellValue("FAIL");
		}
		
	
			FileOutputStream outputfile = new FileOutputStream("C:\\Users\\mc21191\\Downloads\\Book1.xlsx");
			wb.write(outputfile);
	
	
	}*/
		
		//driver.findElement(By.id("closeLargeModal")).submit();
		
		Thread.sleep(4000);
		driver.close();
		driver.quit();
		
	}
}
