package automation.selenium.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
    public static FileInputStream fis;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    
    public static int rows;
    public static int cols;
	
	public static Object[][] getDataFromExcel() throws IOException {
		
		fis = new FileInputStream("C:\\Users\\Siva\\eclipse-workspace\\NewTours\\src\\test\\resources\\Testdata.xlsx");
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
		
		rows = sheet.getPhysicalNumberOfRows(); 
		System.out.println("No. of rows "+ rows);
	
		cols = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("No. of columns "+ cols);
		
		Object[][] data = new Object[rows-1][cols];
		
	 	for(int i= 0; i< rows-1; i++) {
			for(int j= 0; j < cols; j++) {
			data[i][j] = sheet.getRow(i+1).getCell(j).toString();
		
			}
		}
		return data;
		
	}

}
	