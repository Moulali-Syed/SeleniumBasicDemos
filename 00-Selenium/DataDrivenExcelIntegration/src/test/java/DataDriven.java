import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	// identify testcase column by scanning entire 1st row
	// once column is identified then scan entire testcase column to identify
	// purchase testcase row
	// after you grab purchase testcase row - pull all data of that row and feed
	// into test
	public ArrayList<String> getData(String testcaseName) throws IOException {
		ArrayList<String> a = new ArrayList<String>();
		// step1: access the file
		FileInputStream fis = new FileInputStream("C://Testing//SeleniumJava//dataDriven.xlsx");
		// step2 : create object of XSSFWorkbook and pass the workbook control
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// step3: access sheet
		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {

				XSSFSheet sheet = workbook.getSheetAt(i);

				// step4:iterate all through rows of sheet
				Iterator<Row> rows = sheet.iterator();// sheet is collection of rows
				Row firstRow = rows.next();
				Iterator<Cell> ce = firstRow.cellIterator();// row is collection of cells

				int k = 0;
				int column = 0;
				while (ce.hasNext()) {
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("Testcases")) {
						// desired column
						column = k;
					}
					k++;
				}
				System.out.println(column);

				// once column is identified then scan entire testcase column to identify
				// purchase testcase row
				while (rows.hasNext()) {
					Row r = rows.next();
					// only the require column
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)) {
						// pull all data from the specific row
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {

							DataFormatter formatter = new DataFormatter();
							String text = formatter.formatCellValue(cv.next());
							a.add(text);
//							Cell c = cv.next();
//							if (c.getCellTypeEnum() == CellType.STRING) {
//								a.add(c.getStringCellValue());
//							} else {
//								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
//							}

							// System.out.println(cv.next().getStringCellValue());

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
