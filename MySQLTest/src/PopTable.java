import java.sql.SQLException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class PopTable {
	static XSSFRow row;
	static XSSFRow row1;
	static XSSFRow row2;
	static XSSFRow row3;
	static XSSFRow row4;
	int rowIndex=0;
	@SuppressWarnings("deprecation")
	public void populateTable() throws Exception{
		Connection c = connectionSetup.conn;
		Statement st = connectionSetup.stmt;
		st = c.createStatement();
		@SuppressWarnings("unused")
		ResultSet resultset = st.executeQuery("select * from feedback.comments");
		PreparedStatement pst= connectionSetup.preparedstatement;
		
		FileInputStream file = new FileInputStream("/home/lalitha/Downloads/IoT Workbook (1).xlsx"); 
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(file); 
		XSSFSheet sheet = workbook.getSheetAt(0); 
		Iterator<Row> rowIterator = sheet.iterator(); 
		 while (rowIterator.hasNext()) 
	      {
	         row = (XSSFRow) rowIterator.next();
	         rowIndex= rowIndex+1;
	    /*    if(rowIndex==1)
	         {
	        	 row1=row;
	         } */
	    /*    if(rowIndex==2)
	         {
	        	 row2=row;
	         } */
	      /*   if(rowIndex==3)
	         {
	        	 row3=row;
	         }*/
	         if(rowIndex==4)
	         {
	        	 row4=row;
	         }
	         
	         Iterator < Cell > cellIterator = row.cellIterator();
	         while ( cellIterator.hasNext()) 
	         {
	            Cell cell = cellIterator.next();
	            switch (cell.getCellType()) 
	            {
	               case Cell.CELL_TYPE_NUMERIC:
	               System.out.print( cell.getNumericCellValue() + " \t\t " );
	               break;
	               case Cell.CELL_TYPE_STRING:
	               System.out.print(cell.getStringCellValue() + " \t\t " );
	               break;
	            }
	         }
	         System.out.println();
	      }
	      file.close();
	  /*   String date1= row1.getCell(0).getStringCellValue();
	      String  what_excited_me1= row1.getCell(1).getStringCellValue();
	      String  Job_Skills1= row1.getCell(3).getStringCellValue();
	      String  Concepts_learned1= row1.getCell(5).getStringCellValue();
	      String  Questions_I_asked1= row1.getCell(7).getStringCellValue();
	      String How_I_was_challenged1 = row1.getCell(9).getStringCellValue();
	      String  Research_to_do1= row1.getCell(12).getStringCellValue();
	      String What_I_would_like_to_see1 = row1.getCell(14).getStringCellValue();
	      String Employer_discussions1 = row1.getCell(15).getStringCellValue();
	      String  Help_I_Offered1= row1.getCell(17).getStringCellValue();
	      String  Help_I_took1= row1.getCell(19).getStringCellValue();
	      pst = c.prepareStatement("insert into  feedback.comments(DATE, what_excited_me,Job_Skills,Concepts_learned,Questions_I_asked,Research_to_do,How_I_was_challenged,What_I_would_like_to_see,Employer_discussions,Help_I_Offered,Help_I_took) values (STR_TO_DATE(?,'%Y/%m/%d'),?,?,?,?, ?, ?, ?, ? , ?, ?)");
	  	pst.setDate(1, java.sql.Date.valueOf(date1));
		pst.setString(2, what_excited_me1);
		pst.setString(3, Job_Skills1);
		pst.setString(4,Concepts_learned1);
		pst.setString(5, Questions_I_asked1);
		pst.setString(6,How_I_was_challenged1);
		pst.setString(7,Research_to_do1);
		pst.setString(8,What_I_would_like_to_see1);
		pst.setString(9,Employer_discussions1);
		pst.setString(10, Help_I_Offered1);
		pst.setString(11,Help_I_took1);
		pst.execute(); */
	    /*  Double date= row2.getCell(0).getNumericCellValue();
	      String  what_excited_me= row2.getCell(1).getStringCellValue();
	      String  Job_Skills= row2.getCell(3).getStringCellValue();
	      String  Concepts_learned= row2.getCell(5).getStringCellValue();
	      String  Questions_I_asked= row2.getCell(7).getStringCellValue();
	      String Research_to_do = row2.getCell(9).getStringCellValue();
	      String  How_I_was_challenged= row2.getCell(12).getStringCellValue();
	      String What_I_would_like_to_see = row2.getCell(14).getStringCellValue();
	      String Employer_discussions = row2.getCell(15).getStringCellValue();
	      String  Help_I_Offered= row2.getCell(17).getStringCellValue();
	      String  Help_I_took= row2.getCell(19).getStringCellValue();
	      pst = c.prepareStatement("insert into  feedback.comments(DATE, what_excited_me,Job_Skills,Concepts_learned,Questions_I_asked,Research_to_do,How_I_was_challenged,What_I_would_like_to_see,Employer_discussions,Help_I_Offered,Help_I_took) values (?,?,?,?,?, ?, ?, ?, ? , ?, ?)");
	  	pst.setDouble(1,  date);
		pst.setString(2, what_excited_me);
		pst.setString(3, Job_Skills);
		pst.setString(4,Concepts_learned);
		pst.setString(5, Questions_I_asked);
		pst.setString(6,Research_to_do);
		pst.setString(7,How_I_was_challenged);
		pst.setString(8,What_I_would_like_to_see);
		pst.setString(9,Employer_discussions);
		pst.setString(10, Help_I_Offered);
		pst.setString(11,Help_I_took);
		pst.execute(); */
		
	   /*   Double date3= row3.getCell(0).getNumericCellValue();
	      String  what_excited_me3= row3.getCell(1).getStringCellValue();
	      String  Job_Skills3= row3.getCell(3).getStringCellValue();
	      String  Concepts_learned3= row3.getCell(5).getStringCellValue();
	      String  Questions_I_asked3= row3.getCell(7).getStringCellValue();
	      String Research_to_do3 = row3.getCell(9).getStringCellValue();
	      String  How_I_was_challenged3= row3.getCell(12).getStringCellValue();
	      String What_I_would_like_to_see3 = row3.getCell(14).getStringCellValue();
	      String Employer_discussions3 = row3.getCell(15).getStringCellValue();
	      String  Help_I_Offered3= row3.getCell(17).getStringCellValue();
	      String  Help_I_took3= row3.getCell(19).getStringCellValue();
	      pst = c.prepareStatement("insert into  feedback.comments(DATE, what_excited_me,Job_Skills,Concepts_learned,Questions_I_asked,Research_to_do,How_I_was_challenged,What_I_would_like_to_see,Employer_discussions,Help_I_Offered,Help_I_took) values (?,?,?,?,?, ?, ?, ?, ? , ?, ?)");
	  	pst.setDouble(1,  date3);
		pst.setString(2, what_excited_me3);
		pst.setString(3, Job_Skills3);
		pst.setString(4,Concepts_learned3);
		pst.setString(5, Questions_I_asked3);
		pst.setString(6,Research_to_do3);
		pst.setString(7,How_I_was_challenged3);
		pst.setString(8,What_I_would_like_to_see3);
		pst.setString(9,Employer_discussions3);
		pst.setString(10, Help_I_Offered3);
		pst.setString(11,Help_I_took3);
		pst.execute(); */
		
	     Date date4= row4.getCell(0).getDateCellValue();
	      String  what_excited_me4= row4.getCell(1).getStringCellValue();
	      String  Job_Skills4= row4.getCell(3).getStringCellValue();
	      String  Concepts_learned4= row4.getCell(5).getStringCellValue();
	      String  Questions_I_asked4= row4.getCell(7).getStringCellValue();
	      String Research_to_do4 = row4.getCell(9).getStringCellValue();
	      String  How_I_was_challenged4= row4.getCell(12).getStringCellValue();
	      String What_I_would_like_to_see4 = row4.getCell(14).getStringCellValue();
	      String Employer_discussions4 = row4.getCell(15).getStringCellValue();
	      String  Help_I_Offered4= row4.getCell(17).getStringCellValue();
	      String  Help_I_took4= row4.getCell(19).getStringCellValue();
	      pst = c.prepareStatement("insert into  feedback.comments(DATE, what_excited_me,Job_Skills,Concepts_learned,Questions_I_asked,Research_to_do,How_I_was_challenged,What_I_would_like_to_see,Employer_discussions,Help_I_Offered,Help_I_took) values (?,?,?,?,?, ?, ?, ?, ? , ?, ?)");
	      DateFormat df4= new SimpleDateFormat("dd/MM/yyyy");
	      String rd4 = df4.format(date4);
	      pst.setString(1,  rd4);
	  	pst.setString(1,  rd4);
		pst.setString(2, what_excited_me4);
		pst.setString(3, Job_Skills4);
		pst.setString(4,Concepts_learned4);
		pst.setString(5, Questions_I_asked4);
		pst.setString(6,Research_to_do4);
		pst.setString(7,How_I_was_challenged4);
		pst.setString(8,What_I_would_like_to_see4);
		pst.setString(9,Employer_discussions4);
		pst.setString(10, Help_I_Offered4);
		pst.setString(11,Help_I_took4);
		pst.execute(); 
	      
	     /* Date date= row.getCell(0).getDateCellValue();
	      String  what_excited_me= row.getCell(1).getStringCellValue();
	      String  Job_Skills= row.getCell(3).getStringCellValue();
	      String  Concepts_learned= row.getCell(5).getStringCellValue();
	      String  Questions_I_asked= row.getCell(7).getStringCellValue();
	      String Research_to_do = row.getCell(9).getStringCellValue();
	      String  How_I_was_challenged= row.getCell(12).getStringCellValue();
	      String What_I_would_like_to_see = row.getCell(14).getStringCellValue();
	      String Employer_discussions = row.getCell(15).getStringCellValue();
	      String  Help_I_Offered= row.getCell(17).getStringCellValue();
	      String  Help_I_took= row.getCell(19).getStringCellValue();
	      pst = c.prepareStatement("insert into  feedback.comments(DATE, what_excited_me,Job_Skills,Concepts_learned,Questions_I_asked,Research_to_do,How_I_was_challenged,What_I_would_like_to_see,Employer_discussions,Help_I_Offered,Help_I_took) values (?,?,?,?,?, ?, ?, ?, ? , ?, ?)");
	      DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	      String rd = df.format(date);
	      pst.setString(1,  rd);
		pst.setString(2, what_excited_me);
		pst.setString(3, Job_Skills);
		pst.setString(4,Concepts_learned);
		pst.setString(5, Questions_I_asked);
		pst.setString(6,Research_to_do);
		pst.setString(7,How_I_was_challenged);
		pst.setString(8,What_I_would_like_to_see);
		pst.setString(9,Employer_discussions);
		pst.setString(10, Help_I_Offered);
		pst.setString(11,Help_I_took);
		pst.execute(); */
	   }
	
	}
		


