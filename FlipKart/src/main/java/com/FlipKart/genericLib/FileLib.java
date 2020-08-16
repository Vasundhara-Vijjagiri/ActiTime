package com.FlipKart.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This generic class used to handle files like excel and property files
 * @author Vasundhara
 *
 */
public class FileLib {
	/**
	 * 
	 * @param excelPath
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return excelValue
	 * @throws Throwable
	 */
	
	public String getCellData(String excelPath,String sheetName,int row,int cell) throws Throwable
	{
	FileInputStream fis=new FileInputStream(excelPath);
	Workbook wb=WorkbookFactory.create(fis);
   String excelValue=wb.getSheet(sheetName).getRow(row).getCell(cell).toString();
    return excelValue;
}
public int getRowCount(String excelPath,String sheetName) throws Throwable
/**
 * @return rCount
 */
{
	FileInputStream fis=new FileInputStream(excelPath); 
	Workbook wb=WorkbookFactory.create(fis);
	int rCount=wb.getSheet(sheetName).getLastRowNum();
	return rCount;
}
/**
 * 
 * @param excelPath
 * @param sheetName
 * @param row
 * @param cell
 * @param data
 * @throws Throwable
 */
public void setCellData(String excelPath,String sheetName,int row,int cell,String data)throws Throwable
{
	FileInputStream fis=new FileInputStream(excelPath);
	Workbook wb=WorkbookFactory.create(fis);
  wb.getSheet(sheetName).getRow(row).createCell(cell).setCellValue(data);
    //open the file in write mode
    FileOutputStream fos=new FileOutputStream(excelPath);
    //save the file
    wb.write(fos);
}
/**
 * 
 * @param propPath
 * @param Key
 * @return propValue
 * @throws Throwable
 */
public String getPropertyValue(String propPath,String Key) throws Throwable
{
	FileInputStream fis=new FileInputStream(propPath);
	Properties prop=new Properties();
prop.load(fis);
	String propValue=prop.getProperty(Key, "Incorrect key");
	return propValue;
}

}