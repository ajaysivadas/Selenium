package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/***
 * 
 * @author Ajay S
 *
 */
public class ExcelLib {

	/**
	 * This method is Used to read String data from an Excel
	 * @author User SheetName provide the SheetName where You have test data
	 * @author User rowNum provide the row number  where You have test data
	 * @author User cellNum provide the cell number  where You have test data
	 * return it returns the data in that respective sheet,row,cell in the form of String 
	 */
 static String excelpath="/Users/ajaysivadas/eclipse-workspace/ELF/testResources/testData.xlsx";
 public static String readStringData(String sheetName,int rowNum,int cellNum) {
	Workbook workbook=null;
	try{
	File absPath=new File(excelpath);
	FileInputStream fis=new FileInputStream(absPath);
	workbook=WorkbookFactory.create(fis);
	}
	catch(FileNotFoundException e){
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
 		//return Workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	 return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
}

	}


