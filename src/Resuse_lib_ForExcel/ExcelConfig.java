package Resuse_lib_ForExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {

	XSSFWorkbook wrk;
	XSSFSheet sheet1;

	public ExcelConfig(String ExcelPath) {

		try {
			File src = new File(ExcelPath);

			FileInputStream fis = new FileInputStream(src);

			wrk = new XSSFWorkbook(fis);

		} catch (Exception e) {

			System.out.println((e.getMessage()));
		}

	}

	public String getData(int sheetNumber, int row, int column) {

		sheet1 = wrk.getSheetAt(sheetNumber);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;

	}

}