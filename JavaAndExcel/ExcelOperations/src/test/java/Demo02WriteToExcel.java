import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo02WriteToExcel {
	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("EmpInfo");

		Object empdata[][] = {

				{ "EmpId", "Name", "Job" }, { 101, "David", "Engineer" }, { 102, "Smith", "Manager" },
				{ 103, "Scott", "Analyst" } };

		// using for loop
		int rows = empdata.length;
		int cols = empdata[0].length;

		System.out.println(rows);
		System.out.println(cols);

		for (int i = 0; i < rows; i++) {
			XSSFRow row = sheet.createRow(i);
			for (int j = 0; j < cols; j++) {
				XSSFCell cell = row.createCell(j);
				Object value = empdata[i][j];

				if (value instanceof String) {
					cell.setCellValue((String) value);
				}
				if (value instanceof Integer) {
					cell.setCellValue((Integer) value);
				}
				if (value instanceof Boolean) {
					cell.setCellValue((Boolean) value);
				}
			}
		}
/*	
		//using for each loop
		int rowCount=0;
		for(Object[] emp:empdata) {
			XSSFRow row = sheet.createRow(rowCount++);
			int columnCount=0;
			for(Object value:emp) {
				XSSFCell cell = row.createCell(columnCount++);
				if (value instanceof String) {
					cell.setCellValue((String) value);
				}
				if (value instanceof Integer) {
					cell.setCellValue((Integer) value);
				}
				if (value instanceof Boolean) {
					cell.setCellValue((Boolean) value);
				}
			}
		}
*/
		String filePath = ".\\dataFiles\\employee.xlsx";
		FileOutputStream fos = new FileOutputStream(filePath);
		workbook.write(fos);
		fos.close();
		System.out.println("Employee.xlsx file written successfully");
	}
}
