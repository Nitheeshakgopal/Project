package Excelread;
 
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {

	
 static FileInputStream f;
 static XSSFWorkbook w;
 static XSSFSheet sh;
 //to read string data
 public static String readStringData(int row,int col) throws IOException
 {
  //open
  f=new FileInputStream("C:\\Users\\sreek\\Downloads\\Excelreadsample.xlsx");
  //open workbook
  w=new XSSFWorkbook(f);
  //to get sheet
  sh=w.getSheet("Sheet1");
  //to fetch row
  XSSFRow r=sh.getRow(row);
  //to find which celll
  XSSFCell c=r.getCell(col);
  //to get data
  return c.getStringCellValue();
	
 }
 //read integer data
 public static String readIntegerData(int row,int col)throws IOException{
  f=new FileInputStream("C:\\Users\\sreek\\Downloads\\Excelreadsample.xlsx");
  w=new XSSFWorkbook(f);
  sh=w.getSheet("Sheet1");
  XSSFRow r=sh.getRow(row);
  XSSFCell c=r.getCell(col);
  //typecast- int
  int val=(int) c.getNumericCellValue();
  //
  return String.valueOf(val);
  
  
 }

}

