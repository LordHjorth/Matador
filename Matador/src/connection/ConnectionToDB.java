package connection;

import java.sql.*;

public class ConnectionToDB {

	private static String dbUrl = "jdbc:mysql://localhost/EmptyBandit";
	private static String dbUsername = "root";
	private static String dbPassword = "gruppe25";
	private int i = 0;

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
		return null;
	}

//	public void createDatabase() {
//		Connection con = dbConnect();
//		int i = 0;
//		while (i < 5) {
//			String databaseName = "Matador" + i;
//			String[] query = { "create database " + databaseName + ";", "use " + databaseName + ";",
//					"create table Spil(game_id integer primary key, name nvarchar(50), Tid_Start date, Tid_Slut date); ",
//					"create table Spiller_info(spiller_id integer, navn nvarchar(30), balance decimal, bil_farve varchar(20) unique, primary key (spiller_id), fængsel bit, chancekort nvarchar(50));",
//					"create table Bil(bil_farve varchar(20) primary key, placering integer, bil_id integer, constraint fk_Spiller_info_spiller_id foreign key (bil_id) references Spiller_info(spiller_id));",
//					"create table Ejerskab(felt_id integer, spiller_id integer, antal_huse integer, primary key (felt_id,spiller_id), constraint FK_SpillerInfo_SpillerID foreign key (spiller_id) references Spiller_info(spiller_id));",
//					"create table Spiller(spiller_id integer, game_id integer, constraint FK_Spiller_info_SpillerID foreign key(spiller_id) references Spiller_info(spiller_id), constraint FK_Spil_GameID foreign key (game_id) references Spil(game_id));" };
//			try {
//				Statement st = con.createStatement();
//				for (String q : query) {
//					st.executeUpdate(q);
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			i++;
//		}
//
//	}

	public void useOfStoredProcedure() {
		Connection con = dbConnect();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select count(*) from EmptyBandit.Spil;");
			if(rs.next()) {
				if(rs.getInt(1) == 0) {
					i = 0;
				}
				else {
					ResultSet rs1 = stmt.executeQuery("Select max(id) from EmptyBandit.Spil");
					if(rs1.next()) {
						i = rs1.getInt(1)+1;
					}
				}
			}
			stmt.executeUpdate("INSERT INTO EmptyBandit.Spil VALUES(" + i +");");
			CallableStatement st = con.prepareCall("call EmptyBandit.CreateNewGame(?)");
			st.setString(1, "_" + i);
			st.execute();
			stmt.executeUpdate("INSERT INTO Matador_" + i + ".Spil(game_id, Tid_Start) VALUES(" + i +", now());");
		} catch (SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

}
