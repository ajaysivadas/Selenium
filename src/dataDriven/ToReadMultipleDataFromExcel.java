package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("/Users/ajaysivadas/eclipse-workspace/ELF/testResources/testData.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheetTwo = workbook.getSheet ("Sheet2") ;
		int rowCount = sheetTwo.getPhysicalNumberOfRows() ;
		int colCount = sheetTwo.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rowCount);
		System.out.println(colCount);
		String[][] sarr = new String[rowCount][colCount];
		for (int i=0;i<rowCount;i++) 
		{
			for (int j=0;j<colCount;j++) 
			{
				sarr[i][j]=sheetTwo.getRow(i).getCell(j).toString();
			}

		}

	}
}
