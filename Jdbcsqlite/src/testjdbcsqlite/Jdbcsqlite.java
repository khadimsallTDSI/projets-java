package testjdbcsqlite;

import java.sql.*;

public class Jdbcsqlite {

	public static void main(String[] args) {
		Connection c=null;
		Statement stmt=null;
		try {
			Class.forName("org.sqlite.JDBC");
			c=DriverManager.getConnection("jdbc:sqlite:test.db");
			stmt=c.createStatement();
			 String sql = "CREATE TABLE personne " +
                     "(Nom      CHAR(50)," +
                     " Prenom   CHAR(50), " + 
                     " Age            INT )"; 
			 stmt.executeUpdate(sql);
	         stmt.close();
	         c.close();
		} catch (Exception e) {
			 System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
			
		}
		System.out.println("Table created successfully");

	}

}
