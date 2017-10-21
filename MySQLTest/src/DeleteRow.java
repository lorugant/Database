import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.ResultSetMetaData;

public class DeleteRow {

	public void deletingRow() throws Exception{
		Connection connecton = connectionSetup.conn;
		Statement stt = connectionSetup.stmt;
		stt = connecton.createStatement();
		ResultSet result_Set = stt.executeQuery("select * from feedback.comments");
		PreparedStatement pstmt= connectionSetup.preparedstatement;
	      pstmt = connecton.prepareStatement("delete from feedback.comments where Job_Skills= ? ; ");
	      pstmt.setString(1, "none");
	      pstmt.executeUpdate();
	      System.out.println("Deleting Done!!!");
          ResultSetMetaData result_Set1 = (ResultSetMetaData) result_Set.getMetaData();
	            int cols = result_Set1.getColumnCount();
	            System.out.printf("The query fetched %d columns\n",cols);
	            System.out.println("These columns are: ");
	            for (int i=1;i<=cols;i++) {
	                String colName = result_Set1.getColumnName(i);
	                String colType = result_Set1.getColumnTypeName(i);
	                System.out.println(colName+" of type "+colType);
	            }
	}
}

