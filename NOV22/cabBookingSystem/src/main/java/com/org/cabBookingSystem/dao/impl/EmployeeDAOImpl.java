package com.org.cabBookingSystem.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.org.cabBookingSystem.dao.EmployeeDAO;
import com.org.cabBookingSystem.models.Employee;
import com.org.cabBookingSystem.util.ConnectionUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	public void insertEmployee(Employee e) {
		try {
			// insert into Employee values();

			Connection con = ConnectionUtil.getConnection();
			PreparedStatement stmt = con
					.prepareStatement(" insert into employee (e_name, e_email, e_password, m_id) values (?,?, ? ,?) ");

			stmt.setString(1, e.geteName());
			stmt.setString(2, e.geteEmail());
			stmt.setString(3, e.getePassword());
			stmt.setInt(4, e.getmId());

			if (stmt.executeUpdate() == 1) {
				stmt = con.prepareStatement("select e_id from employee where e_email = ?");
				stmt.setString(1, e.geteEmail());
				ResultSet rs = stmt.executeQuery();
				if (rs.next()) {
					System.out.println("Added Employee!!! and Id is  " + rs.getInt(1));

				}

			}
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}

	}

	public void deleteEmployee(int eId) {
		try {
			// insert into Employee values();

			Connection con = ConnectionUtil.getConnection();
			PreparedStatement stmt = con.prepareStatement(" delete from employee where e_id = ? ");
			stmt.setInt(1, eId);

			if (stmt.executeUpdate() == 1) {
				System.out.println("Deleted employee with id = " + eId);

			}
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}

	}

	public void updatePassword(String password, int eId) {
		
		try {
		
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement stmt = con.prepareStatement("update employee set e_password =  ? where e_id = ? ");
			stmt.setString(1, password);
			stmt.setInt(2, eId);

			if (stmt.executeUpdate() == 1) {
				System.out.println("Updated password for the employee with id = " + eId);

			}
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}

	public List<Employee> findAllEmployeesByManagerID(int mId) {

		List<Employee> eList = new ArrayList<Employee>();
		try {
			// insert into Employee values();

			Connection con = ConnectionUtil.getConnection();
			PreparedStatement stmt = con.prepareStatement(" Select * from employee where m_id =  ?");
			
			stmt.setInt(1, mId);
			// set of rows -> resiult set

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// each row -> each object

				Employee e = new Employee();

				// in a row
				// column index -> 1. e_id
				e.seteId(rs.getInt(1));

				// 2. e_name

				e.seteName(rs.getString(2));

				// 3. e_email

				e.seteEmail(rs.getString(3));
				// 4. e_password

				e.setePassword(rs.getString(4));

				// 5. m_id
				e.setmId(rs.getInt(5));

				eList.add(e);

			}

		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}

		return eList;
	}

	public Employee findEmployee(int eId) {

		Employee e = new Employee();
		try {

			// insert into Employee values();

			Connection con = ConnectionUtil.getConnection();
			PreparedStatement stmt = con.prepareStatement(" Select * from employee  where e_id = ?");

			stmt.setInt(1, eId);
			// set of rows -> resiult set

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				// each row -> each object
				// in a row
				// column index -> 1. e_id
				e.seteId(rs.getInt(1));

				// 2. e_name

				e.seteName(rs.getString(2));

				// 3. e_email

				e.seteEmail(rs.getString(3));
				// 4. e_password

				e.setePassword(rs.getString(4));

				// 5. m_id
				e.setmId(rs.getInt(5));

			}

		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}

		return e;
	}

}
