package com.org.cabBookingSystem.dao;

import java.util.List;

import com.org.cabBookingSystem.models.Manager;

public interface ManagerDAO {

	//insert into Manager values(" ", "" .) -> added as a row in the table
		void insertManager(Manager m);

	// select * from Manager where id = 12; -> return a row of table
	 	Manager findManager(int mId);

	// delete * from Manager where id = 12;
		void deleteManager(int mId);

	// update Manager set password = hjbdsdsjkv  where id = 12;
	     void updatePassword(String password, int mId);
	     
	     
	     List<Manager> findAllManager();

}
