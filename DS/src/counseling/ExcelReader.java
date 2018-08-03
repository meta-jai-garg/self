package counseling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import queue.LinkedQueue;
import queue.Queue;

public class ExcelReader {
	public static List<Programs> readXLSXFile() throws IOException {
		List<Programs> proList = new ArrayList<Programs>();
		final String path = "C:/Users/User22/Downloads/course_data.xlsx";
		InputStream ExcelFileToRead = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);

		XSSFWorkbook test = new XSSFWorkbook();

		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row;
		XSSFCell cell;
		int capacity = 0;
		String name = " ";
		Iterator rows = sheet.rowIterator();
		row = (XSSFRow) rows.next();
		while (rows.hasNext()) {
			row = (XSSFRow) rows.next();
			Iterator cells = row.cellIterator();
			while (cells.hasNext()) {
				cell = (XSSFCell) cells.next();
				
				if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
					name = cell.getStringCellValue();
				} else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
					capacity = (int) cell.getNumericCellValue();
				}

				
			}
			proList.add(new Programs(name, capacity));
		}
		return proList;
	}

	public static void main(String[] args) throws IOException {
		List<Programs> pro = readXLSXFile();
		for (Programs programs : pro) {
			System.out.println(programs.getName() + " "
					+ programs.getCapacity());
		}
	}
}
