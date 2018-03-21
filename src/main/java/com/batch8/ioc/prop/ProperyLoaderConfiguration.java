package com.batch8.ioc.prop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ProperyLoaderConfiguration {
	
	private String username;
	private String password;
	private String url;
	
	private Properties dbDetails;
	
	public void setDbDetails(Properties dbDetails) {
		this.dbDetails = dbDetails;
		username =dbDetails.getProperty("jdbc.username");
		password = dbDetails.getProperty("jdbc.password");
		url = dbDetails.getProperty("jdbc.url");
	}
	public void getConnection(){
		
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println(url + " " + username +" "+ password);
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
