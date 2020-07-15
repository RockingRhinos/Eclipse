package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcel(String fileName) throws IOException {
		
		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet wsheet = wbook.getSheetAt(0);
		int rowCount = wsheet.getLastRowNum();
		int colCount = wsheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][colCount];
		
		for (int j = 1; j <= rowCount; j++) {
			XSSFRow row = wsheet.getRow(j);
			for (int i = 0; i < colCount; i++) {
				XSSFCell cell = row.getCell(i);
				data[j-1][i] = cell.getStringCellValue();
//				System.out.print(data+"\t");
			} 
//			System.out.println();
		}
		
		return data;
		
	}
	
}
