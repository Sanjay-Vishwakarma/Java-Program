package program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class ExcelFileRead {

	public static void main(String[] args) throws IOException {

		try {

			FileInputStream fis = new FileInputStream(new File("C:Users\\isanj\\Desktop\\card_number.xls"));

			HSSFWorkbook wb = new HSSFWorkbook(fis);
			HSSFSheet sheet = wb.getSheetAt(0);

			FormulaEvaluator formulaEvaluator = wb.getCreationHelper().createFormulaEvaluator();
			for (Row row : sheet) // iteration over row using for each loop
			{
				for (Cell cell : row) // iteration over cell using for each loop
				{
					switch (formulaEvaluator.evaluateInCell(cell).getCellType())
					{
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue() + "\t\t");
						break;
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue() + "\t\t");
						break;
					}
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
		}
	}
}
