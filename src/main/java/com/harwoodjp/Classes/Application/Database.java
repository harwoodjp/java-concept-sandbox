package com.harwoodjp.Classes.Application;

public class Database {
	private String host;
	private String user;
	private String pass;

	public Database(String host, String user, String pass) {
		this.host = host;
		this.user = user;
		this.pass = pass;
	}

	public String getHost() {
		return host;
	}

	public String getUser() {
		return user;
	}

	public String getPass() {
		return pass;
	}
}
