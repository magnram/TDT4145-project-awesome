package sample;

import javafx.application.Application;

class Runner {

	public static void main(String[] args) {
		MySQLAccess dao = new MySQLAccess();
        try {
			dao.readDataBase();
		} catch (Exception e) {
			e.printStackTrace();
        }
		Application.launch(Main.class, args);
	}

}