package com.org.cabBookingSystem.dao;

import java.util.List;

import com.org.cabBookingSystem.models.Cab;

public interface CabDAO {
	
	//insert into Cab values()
	void insertCab(Cab c);
	
// delete * from Cab where c_number= 12;
	void deleteCab(int cNumber);

// select * from cab;
	List<Cab> findAllCab();
	
// select * from cab where c_number = 12;
	Cab  findCab(int cNumber);

}
