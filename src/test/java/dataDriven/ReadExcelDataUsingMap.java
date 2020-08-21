package dataDriven;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataUsingMap {
	
	public static List<Map<String, String>> getDataFromExcelIntoMap(){
		
		List<Map<String, String>> testDataAllRows=null;
		
		Map<String,String> testData=null;
		
		try {
			FileInputStream fis=new FileInputStream("./src/test/java/dataDriven/testData.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(0);
			int rowCount=sheet.getLastRowNum();
			int colCount=sheet.getRow(0).getLastCellNum();
			List colList=new ArrayList<String>(); 
			for(int i=0;i<colCount;i++) {
				Row row=sheet.getRow(0);
				Cell cell=row.getCell(i);
				String rowHeader=cell.getStringCellValue();
				colList.add(rowHeader);
			}
			testDataAllRows = new ArrayList<Map<String,String>>();
			
			for(int j=1;j<=rowCount;j++) {
				testData=new HashMap<String, String>();
				Row row=sheet.getRow(j);
				for(int k=0;k<colCount;k++) {
					Cell cell=row.getCell(k);
					
					String cellValue=cell.getStringCellValue();
					testData.put((String)colList.get(k), cellValue);
				}
				testDataAllRows.add(testData);
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return testDataAllRows;
	}

}
