package com.harwoodjp.Classes.Application;

public class Application {
	Database database;

	public Application(Database database) {
		this.database = database;
	}
	
	public boolean hasValidDatabase() {
		Database db = this.database;
		return db.getHost() != null && db.getPass() != null && db.getUser() != null;
	}
}
