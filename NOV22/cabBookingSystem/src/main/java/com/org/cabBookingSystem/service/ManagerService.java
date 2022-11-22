package com.org.cabBookingSystem.service;

import java.util.List;

import com.org.cabBookingSystem.models.Booking;
import com.org.cabBookingSystem.models.Employee;
import com.org.cabBookingSystem.models.Manager;

/*
-> Login/logout
-> read their details, update their details
-> view employess under him/her
-> view cab requested submitted
-> approve or deny any cab request

 */
public interface ManagerService {
	
	 //login ->  get email and password  -> check  -> store id
	
	boolean login(int mID, String password);
	
	//read their details -> get their id -> return row/object
	
	Manager showDetails(int mId);
	
	//update their details/password
	void  updatePassword(int mId , String password);
	
	List<Employee>  viewEmployees(int mId);	
	
	List<Booking>  viewCabRequest(int mId);
	
	void approveRequest(int bId, boolean approve);
	
	

}
