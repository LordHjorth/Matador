 package game;

import connection.ConnectionToDB;

public class Main {
	
	public static void main(String[] args) {
		ConnectionToDB connect = new ConnectionToDB();
		connect.dbConnect();
		SpilController spilController = new SpilController(); //opretter et objekt af SpilController
		spilController.playGame(); //på det objekt kaldes meotden PlayGame som indeholder opsætning af gui, spillet og gameloopet.
	} 
}
