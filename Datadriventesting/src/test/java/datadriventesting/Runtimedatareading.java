package datadriventesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Runtimedatareading {
	
	@Test
	
	public void runtimedata() throws IOException
	{
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Ramya\\eclipse-workspace\\Datadriventesting\\Files\\myfile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Random data");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter how many rows");
		int rows=sc.nextInt();
		System.out.println("Enter how many cells in a row");
		int cells=sc.nextInt();
		for(int r=0;r<=rows;r++)
		{
			XSSFRow currentrow = sheet.createRow(r);
			for(int c=0;c<cells;c++)
			{
				XSSFCell currentcell = currentrow.createCell(c);
				currentcell.setCellValue(sc.next());
			}
		}
		
		workbook.write(fout);
		workbook.close();
		fout.close();
		System.out.println("file is created");
		
		
	}

}
