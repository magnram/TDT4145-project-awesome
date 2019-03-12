package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class MySQLAccess {
	
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	final private String host = "mysql.stud.ntnu.no";
	final private String user = "magnram_db_acc";
	final private String passwd = "db_acc";
	final private String name = "magnram_db";

  
	public void readDataBase() throws Exception {
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
  
			// Setup the connection with the DB
			System.out.println("jdbc:mysql://" + host + "/feedback?" + "user=" + user + "&password=" + passwd );
			connect = DriverManager.getConnection("jdbc:mysql://" + host + "/" + name + "?" + "user=" + user + "&password=" + passwd );

			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			// Result set get the result of the SQL query
			resultSet = statement.executeQuery("select * from Apparat");
  
			while(resultSet.next()) {
				System.out.println(resultSet.getString("Navn"));
			}
			connect.close();  
		} catch (Exception e) { System.out.println(e);};
	}
}