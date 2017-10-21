import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertRow {
	public void InsertingRow() throws Exception {
	Connection con = connectionSetup.conn;
	Statement s = connectionSetup.stmt;
	s = con.createStatement();
	ResultSet resultSet = s.executeQuery("select * from feedback.comments");
	PreparedStatement ps= connectionSetup.preparedstatement;
	ps = con.prepareStatement("insert into  feedback.comments values (?,?,?,?,?, ?, ?, ?, ? , ?, ?)");
	ps.setDate(1, java.sql.Date.valueOf("2017-09-29") );
	ps.setString(2,"linkedlist" );
	ps.setString(3,"none" );
	ps.setString(4,"java hashmaps" );
	ps.setString(5,"Usage of collections" );
	ps.setString(6,"Combining codes to requirement" );
	ps.setString(7,"none" );
	ps.setString(8,"none" );
	ps.setString(9,"none" );
	ps.setString(10,"none" );
	ps.setString(11,"none" );
	ps.execute();
	con.close();
	System.out.println("Inserting done!!!"); 
	}
}
