/*
package com.provilac.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {

	public static List<Map<String, String>> getData(String filePath, String sheetName) {
		List<Map<String, String>> dataList = new ArrayList<>();

		String baseDir = System.getProperty("user.dir");
		try {
			FileInputStream fis = new FileInputStream(baseDir + filePath);
			try {
				Workbook workbook = WorkbookFactory.create(fis);
				Sheet sheet = workbook.getSheet(sheetName);
				Row headerRow = sheet.getRow(0);
				for (int i = 1; i <= sheet.getLastRowNum(); i++) {
					Row row = sheet.getRow(i);
					Map<String, String> rowData = new HashMap<>();

					for (int j = 0; j < row.getLastCellNum(); j++) {
						String key = headerRow.getCell(j).getStringCellValue();
						String value = row.getCell(j).toString();
						rowData.put(key, value);
					}
					dataList.add(rowData);
				}
			} catch (EncryptedDocumentException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return dataList;
	}

	
}
*/