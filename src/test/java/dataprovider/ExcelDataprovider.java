package dataprovider;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataprovider {
	
	XSSFWorkbook wb;

	public ExcelDataprovider()
	{
		
		File src = new File("./ApplicationTestData/AppData.xlsx");
		
		try 
		{
			FileInputStream fis = new FileInputStream(src);
			
			 wb =new XSSFWorkbook(fis);
		} catch (Exception e) 
		{
			
			System.out.println("exception is" + e.getMessage());
		}
	}
	
	public String getData(int sheetIndex,int row,int col)
	{
		String data = wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue();
		
		return data;
	}
	
	public String getData(String sheetName,int row,int col)
	{
		String data = wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
		
		return data;
	}

	
}
