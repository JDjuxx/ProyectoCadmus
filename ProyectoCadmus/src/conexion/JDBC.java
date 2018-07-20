package conexion;

//STEP 1. Import required packages


import java.sql.*;

public class JDBC {
	// JDBC driver name and database URL

	static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
	static final String DB_URL = "jdbc:mariadb://localhost/proyecto_v3";

	//  Database credentials
	static final String USER = "root";
	static final String PASS = "";
	Connection conn = null;
	Statement stmt = null;

	public void openConection() {

		try {
			//STEP 2: Register JDBC driver
			Class.forName("org.mariadb.jdbc.Driver");
			//STEP 3: Open a connection
			System.out.println("Connecting to a selected database");
			conn = DriverManager.getConnection(
					DB_URL, USER, "");
			System.out.println("Connected database successfully");

		}catch (SQLException se) {
			//Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			//Handle errors for Class.forName
			e.printStackTrace();
		}

	}


	public void closeConection() {

		try {   
			conn.close();
			System.out.println("Conexion closed successfully");

		} catch (SQLException se) {
		}// do nothing

	}


	public Connection getConn() {
		return conn;
	}


	public void setConn(Connection conn) {
		this.conn = conn;
	}


	public Statement getStmt() {
		return stmt;
	}


	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}


}




