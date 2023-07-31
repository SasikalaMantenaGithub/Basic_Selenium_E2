package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_Write_Excel {

	public static void main(String[] args) throws Throwable {
		//creating an object for physical file
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData1.xlsx");
		//calling create method to hold fis
		 Workbook wb = WorkbookFactory.create(fis);
		 //reading data from particular cell
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println(url);
		String title = driver.getTitle();
		//writing data into excel sheet
		wb.getSheet("Sheet1").createRow(7).createCell(0).setCellValue(title);
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\TestData1.xlsx");
		wb.write(fos);
		
	
	
	
	
	}

}
