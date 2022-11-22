package com.org.cabBookingSystem.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.org.cabBookingSystem.dao.ManagerDAO;
import com.org.cabBookingSystem.models.Manager;
import com.org.cabBookingSystem.util.ConnectionUtil;

public class ManagerDAOImpl implements ManagerDAO {

	public void insertManager(Manager m) {
		// insert into manager (m_name, m_email, m_password) values ("porkodi",
		// "porkodi@gmail.com", "porkodi");

		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement preparedStmt = con
					.prepareStatement("insert into manager(m_name, m_email, m_password)values(?, ?, ?)");

			preparedStmt.setString(1, m.getmName());
			preparedStmt.setString(2, m.getmEmail());
			preparedStmt.setString(3, m.getmPassword());

			if (preparedStmt.executeUpdate() == 1) {
				preparedStmt = con.prepareStatement("select m_id from manager where m_email = ?");
				preparedStmt.setString(1, m.getmEmail());
				ResultSet  rs = preparedStmt.executeQuery();
				if(rs.next()) {
					System.out.println("Added Manager!!! and Id is  " + rs.getInt(1));
				}
			}
				
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public Manager findManager(int mId) {
		Manager m = new Manager();

		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement preparedStmt = con.prepareStatement("select * from manager where m_id = ? ");
			preparedStmt.setInt(1, mId);
			ResultSet rs = preparedStmt.executeQuery();

			boolean isIdFound = false;
			while (rs.next()) {
				isIdFound = true;
				
				m.setmId(rs.getInt(1));;
				m.setmName(rs.getString(2));
				m.setmEmail(rs.getString(3));
				m.setmPassword(rs.getString(4));

			}
			if (isIdFound == false)
				System.out.println("Manager ID not found.. enter the valid one!!");

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return m;
	}

	public void deleteManager(int mId) {
		// TODO Auto-generated method stub

	}

	public void updatePassword(String password, int mId) {
		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement preparedStmt = con
					.prepareStatement("update manager set m_password = ? where m_id =  ?");

			preparedStmt.setString(1, password);
			preparedStmt.setInt(2, mId);
		

			if (preparedStmt.executeUpdate() == 1)
				System.out.println("updated Manager to the table");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public List<Manager> findAllManager() {
		// select * from managers;

		List<Manager> mList = new ArrayList<Manager>();

		try {
			Connection con = ConnectionUtil.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from manager");
			while (rs.next()) {

				Manager m = new Manager();
				m.setmId(rs.getInt(1));
				m.setmName(rs.getString(2));
				m.setmEmail(rs.getString(3));
				m.setmPassword(rs.getString(4));

				mList.add(m);

			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return mList;
	}

}
