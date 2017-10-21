import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.ResultSetMetaData;

public class SearchTable {

	public void searchingTable() throws Exception{
		
		Connection connecting = connectionSetup.conn;
		Statement sttmt = connectionSetup.stmt;
		sttmt = connecting.createStatement();
		//ResultSet result_set = sttmt.executeQuery("select * from feedback.comments");
		PreparedStatement psttmt= connectionSetup.preparedstatement;
		psttmt = connecting.prepareStatement("SELECT what_excited_me from feedback.comments");
		ResultSet result_set=psttmt.executeQuery();
		System.out.println("Searching done!!");
        ResultSetMetaData result_Set1 = (ResultSetMetaData) result_set.getMetaData();
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