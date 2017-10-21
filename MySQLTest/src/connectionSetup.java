import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class connectionSetup {
	public static Connection conn = null;
	public static Statement stmt=null;
	public static PreparedStatement preparedstatement = null;  

	public void connsetup() throws Exception
	{
	    conn = DriverManager.getConnection("jdbc:mysql://localhost/feedback?autoReconnect=true&useSSL=false" "user=root&password=chinnu41093");
	   
	    System.out.println("Connected to database");
	}
}
