package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlconnection {

	public static void main(String[] args) throws SQLException {
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// 1. Get a connection to database
			String url="jdbc:sqlserver://localhost;databaseName=master;";
			String username="sa";
			String password="12345";
			myConn = DriverManager.getConnection(url,"sa","Chetu@123");  
			
			// 2. Create a statement
			myStmt = myConn.createStatement();
			
			// 3. Execute SQL query
			myRs = myStmt.executeQuery("select * from Customer");
			
			// 4. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("FirstName") + ", " + myRs.getString("LastName"));
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();
			}
		}
		

	}

}
