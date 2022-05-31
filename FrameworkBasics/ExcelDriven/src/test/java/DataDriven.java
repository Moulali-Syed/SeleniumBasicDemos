import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public ArrayList<String> getData(String testcaseName) throws IOException {
//		identify testcases column by scanning the entire 1st row
		// once column is identified then scan entire testcase column to identify a
		// specific testcase row
		// after you grab purchase testcase row , pull all data of that row and feed
		// into test

		ArrayList<String> a = new ArrayList<String>();

		// get access to excel file
		FileInputStream fis = new FileInputStream(
				"C:\\Testing\\SeleniumJava\\FrameworkBasics\\ExcelDriven\\Book1.xlsx");
		// step1:
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// step2: get count of sheets
		int sheets = workbook.getNumberOfSheets();
		// iterate thru sheets and check for the required sheetName
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {

				XSSFSheet sheet = workbook.getSheetAt(i);

//				identify testcases column by scanning the entire 1st row
				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next();

				Iterator<Cell> ce = firstRow.cellIterator();
				int k = 0;
				int column = 0;
				;
				while (ce.hasNext()) {
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("Testcases")) {
						// desired column
						column = k;
					}
					k++;
				}
				System.out.println(column);
				// once column is identified then scan entire testcase column to identify a
				// specific testcase row
				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)) {
						// after you grab purchase testcase row , pull all data of that row and feed
						// into test
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							Cell c = cv.next();
							if (c.getCellType() == CellType.STRING) {
								a.add(c.getStringCellValue());
							} else {
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));

							}


						}
					}

				}

			}
		}
		return a;
	}

	public static void main(String[] args) throws IOException {

	}
}
