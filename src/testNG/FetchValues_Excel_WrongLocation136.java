package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class FetchValues_Excel_WrongLocation136 {
	
	@Test
	public void dataFetchingFromExcel() throws EncryptedDocumentException, IOException {
	
	FileInputStream f1 = new FileInputStream("H:\\Java 2024\\JavaPrograms\\SeleniumProject\\DataFet\\DataProider.xlsx");
	Workbook b1 = WorkbookFactory.create(f1);
	String un = b1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
	System.out.println(un);

	}

}
