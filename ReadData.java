package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException 
	{
		
		File src=new File("C:\\Users\\saipna\\Documents\\testdata.xlsx");

		
		FileInputStream fis =new FileInputStream(src); 

		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		int rowCount=sheet.getLastRowNum();
		
		System.out.println("Total no of rows:"+rowCount);
		
		
		
		for(int i=0;i<=rowCount;i++)
		{
			
			String username=sheet.getRow(i).getCell(1).getStringCellValue();
			
			String password=sheet.getRow(i).getCell(2).getStringCellValue();
			
			System.out.println("Username of row "+i+" is: "+username);
			System.out.println("password of row "+i+" is: "+password);
			
			
		}
		
		
	}

}
