package datprovidermethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exceldataprovider {
	
	@Test(dataProvider="supplier")

	public void loginTest(String username,String Password)
	{
		
	}
	
	@DataProvider(name="supplier")
	
	public void datasupplier()
	{
		String excelFilepath=System.getProperty("user.dir")+"\\src\\tesr\\resources\\Sample.xlsx";
		File excelFile=new File(excelFilepath);
		FileInputStream fis;
		try {
		 fis=new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		
		try {
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		XSSFWorkbook workbook;
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		Iterator <Row> rows=sheet.iterator();
		
		while (rows.hasNext())
		{
			Row row=row.next();
			Iterator <Cell> cells=row.iterator();
			
			
		
	}
	
	
	
	
	
	
	
	
		


		
		
	}
	
	
	
	
}

