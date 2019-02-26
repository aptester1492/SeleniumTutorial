package advance_Selenium_Sessiom;

import java.io.IOException;

import Resuse_lib_ForExcel.ExcelConfig;

public class GetExcelData {

	public static void main(String[] args) throws Exception {

		ExcelConfig conf = new ExcelConfig("F:\\ExcelFileDemo\\ExcelFile1.xlsx");

		System.out.println(conf.getData(1, 0, 0));

		/* Runtime.getRuntime().exec("");
		 * -------for upload file using autoIT Runtime
		 class use*/
		 

	}

}
