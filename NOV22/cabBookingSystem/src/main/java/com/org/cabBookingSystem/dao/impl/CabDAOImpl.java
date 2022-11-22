package com.org.cabBookingSystem.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.org.cabBookingSystem.dao.CabDAO;
import com.org.cabBookingSystem.models.Cab;
import com.org.cabBookingSystem.util.ConnectionUtil;


public class CabDAOImpl implements CabDAO {

	public void insertCab(Cab c) {
		try {

			Connection con = ConnectionUtil.getConnection();
			PreparedStatement preparedStmt = con
					.prepareStatement("insert into manager(c_number, c_name, seaters) values(?, ?, ?)");

			preparedStmt.setInt(1, c.getcNumber());
			preparedStmt.setString(2, c.getcName());
			preparedStmt.setInt(3, c.getSeaters());

			if (preparedStmt.executeUpdate() == 1)
				System.out.println("Added Cab!!");

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public void deleteCab(int cNumber) {
		try {
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement preparedStmt = con
				.prepareStatement("delete * from cab where c_number = ?");

		preparedStmt.setInt(1, cNumber);
	

		if (preparedStmt.executeUpdate() == 1)
			System.out.println("Deleted Cab!!");

	} catch (Exception e) {
		System.err.println(e.getMessage());
	}


	}

	public List<Cab> findAllCab() {
		ArrayList<Cab> cList = new ArrayList<Cab>();

		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement preparedStmt = con
					.prepareStatement("Select * from manager");

			ResultSet rs = preparedStmt.executeQuery();
			while (rs.next()) {

	             Cab c = new Cab();
	             
	             c.setcNumber(rs.getInt(1));
	             c.setcName(rs.getString(2));
	             c.setSeaters(rs.getInt(3));
	             
	             cList.add(c);

			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return cList;
	}

	public Cab findCab(int cNumber) {
		
		Cab c = new Cab();
		
		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement preparedStmt = con
					.prepareStatement("Select * from manager where c_number = ? ");

			preparedStmt.setInt(1, cNumber);
			
			ResultSet rs = preparedStmt.executeQuery();
			while (rs.next()) {   	             
	             c.setcNumber(rs.getInt(1));
	             c.setcName(rs.getString(2));
	             c.setSeaters(rs.getInt(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return c;
	}

}
