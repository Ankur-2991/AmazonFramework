package testData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

	
	public static Workbook book;
	public static Sheet sheet;
	public static Object[][] readdata(String Sheetname){
		FileInputStream file=null;
		
		try {
			file=new FileInputStream("C:\\Users\\bansa\\eclipse-workspace\\AmazonFramework\\src\\test\\java\\testData\\Details.xlsx");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			book=WorkbookFactory.create(file);
		} 
		catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sheet=book.getSheet(Sheetname);
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0;i<sheet.getLastRowNum();i++) {
			for(int x=0;x<sheet.getRow(0).getLastCellNum();x++) {
				data[i][x]=sheet.getRow(i+1).getCell(x).toString();
				System.out.println(data);
			}
		}
		return data;
	}
			
}
