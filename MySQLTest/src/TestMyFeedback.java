        import java.sql.Connection;

        import java.sql.DriverManager;
        import java.sql.PreparedStatement;
        import java.sql.ResultSet;
        import java.sql.SQLException;
        import java.sql.Statement;
        import java.util.Properties;
        //import java.util.Date;
        import java.sql.Date;

public class TestMyFeedback {
	
private ResultSet resultSet = null;
	
	public static void main(String[] args) throws Exception {
		
		connectionSetup cs=new connectionSetup();
		cs.connsetup();
	//	InsertRow pt= new InsertRow();
	//	pt.InsertingRow(); 
		
		
	//PopTable pt = new PopTable();
	//	pt.populateTable(); 
		
		/*DeleteRow dr= new DeleteRow();
		dr.deletingRow(); */
		
		SearchTable st=new SearchTable();
		st.searchingTable(); 
		
	}

}
