import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.*;

public class Demo01ReadDataFromExcel {

	public static void main(String[] args) throws IOException {

		// step1: get the excel file path
		String path = System.getProperty("user.dir") + "\\dataFiles\\countries.xlsx";

		// Step2: Connect to the file
		FileInputStream fis = new FileInputStream(path);

		// Step3:Access the workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// Step4:Access the Sheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");// using sheetname
		// XSSFSheet sheet = workbook.getSheetAt(0);//we can also access using sheet
		// index

		// Find rows and columns in the sheet
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();

		// using for loop to read all the data from cells
		for (int i = 0; i <= rows; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < cols; j++) {
				XSSFCell cell = row.getCell(j);
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;

				}
				System.out.print("   |   ");
			}
			System.out.println();

		}

		///////////// Iterator //////////////////
		Iterator iter = sheet.iterator();
		while (iter.hasNext()) {
			XSSFRow row = (XSSFRow) iter.next();

			Iterator cellIter = row.cellIterator();

			while (cellIter.hasNext()) {
				XSSFCell cell = (XSSFCell) cellIter.next();
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				}
				System.out.print("  |  ");
			}
			System.out.println();
		}

	}
}
