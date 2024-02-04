package Excelread;

import java.io.IOException;

public class Excelmain {

 public static void main(String[] args) throws IOException {
  //stataic method from another class- string data cell
  String s=ExcelCode.readStringData(1, 0);
  System.out.println(s);
  String s1=ExcelCode.readIntegerData(1, 1);
  System.out.println(s1);
  

 }

}