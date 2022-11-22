package com.org.cabBookingSystem.service;

import com.org.cabBookingSystem.models.Booking;

/*
-> Login/Logout
-> read their details, update their details
-> generate a cab request 
 */
public interface EmployeeService {
	
	boolean login(int eId, String password);
 
	void requestCab(Booking b);
	
}
