package advance_Selenium_Sessiom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {

		File src=new File("F:\\ExcelFileDemo\\ExcelFile1.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wrk=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wrk.getSheetAt(0);
		
		int rowcount=sheet1.getLastRowNum();
		
		System.out.println(rowcount);
		
		for(int i=0;i<=rowcount;i++) {
			
			String data0=sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println(data0);
		}
		/*
		 * String data0= sheet1.getRow(0).getCell(0).getStringCellValue();
		 * 
		 * System.out.println(data0);
		 * 
		 * String data1= sheet1.getRow(0).getCell(1).getStringCellValue();
		 * 
		 * System.out.println(data1);
		 */
		
		wrk.close();
		
	}

}
