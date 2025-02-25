package com.tricenties.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author charan
 */
public class ExcelUtility {
	/**
	 * This method will read String data from excel and return value based on row and coloumn index
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getStringFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException  {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScript.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
	}
	public boolean getBooleanFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException  {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScript.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
	}
	public double getNumericFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException  {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScript.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
	}
	public LocalDateTime getDateAndTimeFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException  {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScript.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getLocalDateTimeCellValue();
	}
	
}
