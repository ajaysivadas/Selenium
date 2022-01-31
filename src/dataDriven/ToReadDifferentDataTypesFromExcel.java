package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDifferentDataTypesFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("/Users/ajaysivadas/eclipse-workspace/ELF/testResources/testData.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		Row row1=workbook.getSheet("Sheet1").getRow(0);
		String data1 = row1.getCell(0).getStringCellValue();
		boolean data2 = row1.getCell(1).getBooleanCellValue();
		Date data3 = row1.getCell(2).getDateCellValue();
		LocalDateTime data4 = row1.getCell(2).getLocalDateTimeCellValue();
		double data5 = row1.getCell(3).getNumericCellValue();
		System.out.println(data1+","+data2+","+data3+","+data4+","+data5);
	}

}
