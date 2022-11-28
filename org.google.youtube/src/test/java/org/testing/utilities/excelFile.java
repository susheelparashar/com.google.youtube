package org.testing.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class excelFile {
	
	DataFormatter df = new DataFormatter();
	
		public void readData() throws IOException
		{
			String path = "C:\\Users\\susheel.parashar\\Desktop\\read.xlsx";
			FileInputStream fis = new FileInputStream(path);
			Workbook workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheetAt(0);
			int lastRow = sheet.getLastRowNum();
			System.out.println("Last row- " + lastRow);
	
			for (int i = 0; i <= lastRow; i++) {
				Row row = sheet.getRow(i);
				int lastCell = row.getLastCellNum();
				for (int j = 0; j < lastCell; j++) {
					Cell cell = sheet.getRow(i).getCell(j);
					String value = df.formatCellValue(cell);
					System.out.print(value + " ");
				}
				System.out.println();
			}
		}
		
		 public void writeData() throws IOException
		 {
			 String path = "C:\\Users\\susheel.parashar\\Desktop\\write.xlsx";
			 FileInputStream fs = new FileInputStream(path);
			 Workbook wb = new XSSF Workbook(fs);
			 Sheet sheet1 = wb.getSheetAt(0);
			 int lastRow = sheet1.getLastRowNum();
			 for(int i=0; i<=lastRow; i++){
			 Row row = sheet1.getRow(i);
			 Cell cell = row.createCell(2);

			 cell.setCellValue("WriteintoExcel");
			 System.out.println("content write successfully");

			 }

			 FileOutputStream fos = new FileOutputStream(path);
			 wb.write(fos);
			 fos.close();
			 }
		 }
		 

