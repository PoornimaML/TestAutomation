package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleDataExcel {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fs=new FileInputStream("./Testdata/FaceBookCredentials.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int lr=sheet.getLastRowNum();
		for (int i = 0; i <= lr; i++) {
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.getCell(0);
			XSSFCell cell2=row.getCell(1);
			System.out.println(cell.getStringCellValue()+" "+cell2.getStringCellValue());
		}
		workbook.close();
		fs.close();
	}	
		}
		
		