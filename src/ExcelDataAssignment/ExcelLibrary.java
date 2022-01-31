package ExcelDataAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/***
 * 
 * @author Ajay S
 *
 */
public class ExcelLibrary {

	
 static String excelPath="/Users/ajaysivadas/eclipse-workspace/ELF/testResources/testData.xlsx";
 //STRINGDATA
 /**
	 * This method is Used to read String data from an Excel
	 * @author User SheetName provide the SheetName where You have test data
	 * @author User rowNum provide the row number  where You have test data
	 * @author User cellNum provide the cell number  where You have test data
	 * return it returns the data in that respective sheet,row,cell in the form of String 
	 */
	public static String readStringData(String sheetName, int rowNum, int cellNum) {
		Workbook workbook= null;
		File absPath= new File(excelPath);
		try
		{
			FileInputStream fis= new FileInputStream(absPath);
			workbook= WorkbookFactory.create(fis);
		}
		catch (FileNotFoundException e ) {
			e.printStackTrace();
		} 
		catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	//BOOLEANDATA
	/**
	 * This method is Used to read Boolean data from an Excel
	 * @author User SheetName provide the SheetName where You have test data
	 * @author User rowNum provide the row number  where You have test data
	 * @author User cellNum provide the cell number  where You have test data
	 * return it returns the data in that respective sheet,row,cell in the form of True or False 
	 */
	public static boolean readBooleanData(String sheetName, int rowNum, int cellNum) {
		Workbook workbook= null;
		File absPath = new File(excelPath);
		try
		{
			FileInputStream fis= new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (EncryptedDocumentException e) {
			e.printStackTrace();
		}
		catch (IOException e) {

			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();
	}
	/**
	 * This method is Used to read Numeric data from an Excel
	 * @author User SheetName provide the SheetName where You have test data
	 * @author User rowNum provide the row number  where You have test data
	 * @author User cellNum provide the cell number  where You have test data
	 * return it returns the data in that respective sheet,row,cell in the form of Numeric Value
	 */
	public static double readNumericData(String sheetName, int rowNum, int cellNum) {
		Workbook workbook = null;
		File absPath = new File(excelPath);
		try
		{
			FileInputStream fis= new FileInputStream(absPath);
			workbook= WorkbookFactory.create(fis);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return workbook. getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
	}
	/**
	 * This method is Used to read LocalDateTime data from an Excel
	 * @author User SheetName provide the SheetName where You have test data
	 * @author User rowNum provide the row number  where You have test data
	 * @author User cellNum provide the cell number  where You have test data
	 * return it returns the data in that respective sheet,row,cell in the form of LocalDateTime value
	 */
	public static LocalDateTime readLocalDateTimeData(String sheetName, int rowNum, int cellNum) {
	Workbook workbook = null;
	File absPath= new File(excelPath);
	try {
	FileInputStream fis= new FileInputStream(absPath);
	workbook= WorkbookFactory.create(fis);
	} 
	catch (FileNotFoundException e) {
	e.printStackTrace();
	}
	catch (EncryptedDocumentException e) {
	e.printStackTrace();
	}
	catch (IOException e) {
	e.printStackTrace();
	}
	return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getLocalDateTimeCellValue();
}

}
