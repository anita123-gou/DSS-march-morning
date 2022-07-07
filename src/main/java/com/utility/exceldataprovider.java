package com.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldataprovider {

	XSSFWorkbook wb;
	public exceldataprovider() throws IOException {
		
		String pathexcel="C:\\Users\\SHWETA GOUDAR\\eclipse-workspace\\frame1_demo\\testdata\\testdata.xlxs.xlsx";
		FileInputStream fis1=new FileInputStream(pathexcel);
		 wb=new XSSFWorkbook(fis1);
	}
	public String getStringdata(String sheetname,int row,int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		
		
	}
	
}
