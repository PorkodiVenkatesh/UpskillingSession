package com.org.cabBookingSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;
import com.org.cabBookingSystem.util.ConnectionUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
        
    	Connection con = ConnectionUtil.getConnection();
    	
    	System.out.println(con);
    	
    	PreparedStatement stmt = con.prepareStatement("Select * from admin");
    	
    	ResultSet rs = stmt.executeQuery();
    	
    	if(rs.next())    	
    	 System.out.println( rs.getInt(1) + " " + rs.getString(2)+ " " +  rs.getString(3)+ " " + rs.getString(4));
    	
    	Connection con1 = ConnectionUtil.getConnection();
    	
    	System.out.println(con1);
    	
    	PreparedStatement stmt1 = con1.prepareStatement("Select * from admin");
    	
    	ResultSet rs1 = stmt1.executeQuery();
    	
    	if(rs1.next())    	
    	 System.out.println( rs1.getInt(1) + " " + rs1.getString(2)+ " " +  rs1.getString(3)+ " " + rs1.getString(4));
    	
    	
    	}
    	
    	catch(Exception e) {
    		System.err.println(e.getMessage());
    	}
    }
    
}
