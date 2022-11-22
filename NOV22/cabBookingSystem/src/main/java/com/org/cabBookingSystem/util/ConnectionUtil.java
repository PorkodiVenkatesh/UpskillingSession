package com.org.cabBookingSystem.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
	
   static Connection con = null;
   
  private ConnectionUtil() {}
	
	public static Connection getConnection() throws SQLException, FileNotFoundException, IOException {

		Properties prop = new Properties();
		
		prop.load(new FileReader("C:\\Users\\PorkodiVenkatesh\\eclipse-workspace\\Maven\\cabBookingSystem\\src\\main\\resources\\db.properties"));
		
		String url = prop.getProperty("url");
		String username= prop.getProperty("username");
		String password= prop.getProperty("password");
		
		if (con == null){
			con = DriverManager.getConnection(url, username, password);
		
		}
			
			if (con != null)
			{
				System.out.println("Connected Sucessfully");
			}
		
		return con;
		
		
		
	}
}
