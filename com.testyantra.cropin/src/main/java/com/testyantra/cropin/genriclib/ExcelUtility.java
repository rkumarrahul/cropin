package com.testyantra.cropin.genriclib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
		public void setExcelData(String sheetName , int rowNum , int colNum ,String data) throws Throwable {
			FileInputStream fis = new FileInputStream("./testdata/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row row = sh.getRow(rowNum);
			Cell cel = row.createCell(colNum);
			cel.setCellValue(data);
			FileOutputStream fos = new FileOutputStream("./testdata/TestData.xlsx");
			wb.write(fos);
			fos.flush();
			wb.close();
		}
}


