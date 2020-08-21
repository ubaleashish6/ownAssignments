package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataUtility {
	
	
	public static Map<String,String> getMapData(){
		
		Map<String,String> testData=new HashMap<String, String>();
		
		try {
			FileInputStream fis=new FileInputStream("./src/test/java/dataDriven/testData.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(0);
			int rowCount=sheet.getLastRowNum();
			int colCount=sheet.getRow(0).getLastCellNum();
			for(int i=0;i<=rowCount;i++) {
				Row row=sheet.getRow(i);
				Cell keyCell=row.getCell(0);
				String key=keyCell.getStringCellValue();
				
				Cell valueCell=row.getCell(1);
				String value=valueCell.getStringCellValue();
				testData.put(key, value);
			}		
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return testData;
	}
	
	
	

}
