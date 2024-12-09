package dataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateAndWriteDataExcel {
	public static void main(String[] args) throws IOException, InterruptedException {
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("create");
		XSSFRow row=sheet.createRow(0);
		XSSFCell cell=row.createCell(0);
		cell.setCellValue("autoauto");
		FileOutputStream fo=new FileOutputStream("./Testdata/singledata.xlsx");
		workbook.write(fo);
		workbook.close();
		fo.close();
	}
}
