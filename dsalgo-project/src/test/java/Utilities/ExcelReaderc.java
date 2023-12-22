package Utilities;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class ExcelReaderc {
	
	public int totalRow;
	
	@SuppressWarnings({ "resource", "unused" })
	public List<Map<String ,String>> getData(String excelFilePath,String sheetname)throws InvalidFormatException, IOException, Exception{
		    
	 XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(new File(excelFilePath));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		XSSFSheet sheet = workbook.getSheet(sheetname);
		workbook.close();
		
		
		return readSheet(sheet);
	}
	private List<Map<String, String>> readSheet(Sheet sheet) {
	    Row row;
	    Cell cell;
		totalRow = sheet.getLastRowNum();
	
	
	
	List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();
	
	for (int currentRow =1 ;currentRow <= totalRow;currentRow++) {
		
		row = sheet.getRow(currentRow);
		int totalColumn	= row.getLastCellNum();
		LinkedHashMap<String,String> columnMapdata = new LinkedHashMap<String, String>();
		
		for(int currentColumn = 0; currentColumn <totalColumn;currentColumn++) {
			cell = row.getCell(currentColumn);
			String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn).getStringCellValue();
			columnMapdata.put(columnHeaderName,cell.getStringCellValue());
		}
		
		excelRows.add(columnMapdata);
	}
	
	return excelRows;
	
    }
	public int countRow() {
		
	return totalRow;
	
	}
}
	
			
			


