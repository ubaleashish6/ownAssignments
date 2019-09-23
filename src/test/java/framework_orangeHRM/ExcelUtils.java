package framework_orangeHRM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static XSSFWorkbook wb=null;
	public static FileInputStream fin=null;
	public static XSSFSheet sheet=null;
	public static XSSFRow row=null;
	public static XSSFCell cell=null;
	
	public static Object[][] getData(String filePath, String sheetName) throws IOException{
		Hashtable<String, String> table=null;
		fin=new FileInputStream(filePath);
		wb=new XSSFWorkbook(fin);
		sheet=wb.getSheet(sheetName);
		
		//int totalRows=
		int rowCount=getTotalRowCount(sheetName);
		int colCount=getTotalCellCount(sheetName);
		Object data[][]=new Object[rowCount-1][1];
		int index=0;
		for(int rowNum=1;rowNum<=rowCount;rowNum++){
			table=new Hashtable<String, String>();
			for(int colNum=0;colNum<colCount;colNum++){
				String key=getCellData(1, colNum, sheetName);
				String value=getCellData(rowNum+1,colNum,sheetName);
				table.put(key, value);
				data[index][0]=table;
			}
			index++;
		}
		return data;
	}
	public static int getTotalRowCount(String sheetName){
		
		sheet=wb.getSheet(sheetName);
		int totalRows=sheet.getLastRowNum();
		return totalRows;
	}
	public static int getTotalCellCount(String sheetName){
		
		sheet=wb.getSheet(sheetName);
		int totalColumns=sheet.getRow(0).getLastCellNum();
		return totalColumns;
	}
	public static String getCellData(int rowNum, int colNum, String sheetName){
		sheet=wb.getSheet(sheetName);
		if(rowNum<0){
			return "";
		}
		int index=wb.getSheetIndex(sheetName);
		if(index==-1)
			return "";
		row=sheet.getRow(rowNum-1);
		if(row==null)
			return "";
		cell=row.getCell(colNum);
		if(cell.getCellType()== Cell.CELL_TYPE_STRING){
			return cell.getStringCellValue();
		}
		else if(cell.getCellType()== Cell.CELL_TYPE_NUMERIC || cell.getCellType()==Cell.CELL_TYPE_FORMULA){
			return cell.getStringCellValue();
		}
		else if(cell.getCellType()==Cell.CELL_TYPE_BLANK){
			return "";
		}
		else
			return String.valueOf(Cell.CELL_TYPE_BOOLEAN);
		//return "";
	}


}
