package com.org.cabBookingSystem.service.impl;

import com.org.cabBookingSystem.dao.BookingDAO;
import com.org.cabBookingSystem.dao.impl.BookingDAOImpl;
import com.org.cabBookingSystem.models.Booking;
import com.org.cabBookingSystem.service.EmployeeService;

public class EmployeeServiceImpl  implements EmployeeService {
	
	BookingDAO  bDao  = new BookingDAOImpl();

	public boolean login(int eId, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public void requestCab(Booking b) {
		bDao.insertBooking(b);
	}
	
	

}
