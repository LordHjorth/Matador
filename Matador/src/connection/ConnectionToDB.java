package connection;

import java.sql.*;

public class ConnectionToDB {

	private static String dbUrl = "jdbc:mysql://localhost:3306/Matador";
	private static String dbUsername = "root";
	private static String dbPassword = "gruppe25";

	public Connection dbConnect() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			return connection;
		} catch (SQLException e) {
			System.err.print(e.getMessage() + " Noob - ingen sql bandit at hente her!");
		} catch (Exception e) {
			System.err.print(e.getMessage() + " Noob - nu er du bare en meget grim og dum abe :-)");
		}
		return connection;
	}

}
