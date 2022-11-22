package com.org.cabBookingSystem.service.impl;

import java.util.List;

import com.org.cabBookingSystem.dao.BookingDAO;
import com.org.cabBookingSystem.dao.EmployeeDAO;
import com.org.cabBookingSystem.dao.ManagerDAO;
import com.org.cabBookingSystem.dao.impl.BookingDAOImpl;
import com.org.cabBookingSystem.dao.impl.EmployeeDAOImpl;
import com.org.cabBookingSystem.dao.impl.ManagerDAOImpl;
import com.org.cabBookingSystem.models.Booking;
import com.org.cabBookingSystem.models.Employee;
import com.org.cabBookingSystem.models.Manager;
import com.org.cabBookingSystem.service.ManagerService;

public class ManagerServiceImpl  implements ManagerService{
	
	ManagerDAO mDao = new ManagerDAOImpl();
	EmployeeDAO eDao = new EmployeeDAOImpl();
	BookingDAO  bDao = new  BookingDAOImpl();

	

	public Manager showDetails(int mId) {
		return mDao.findManager(mId);
	}

	public void updatePassword(int mId, String password) {
		mDao.updatePassword(password, mId);
		
	}

	public List<Employee> viewEmployees(int mId) {
		
		return eDao.findAllEmployeesByManagerID(mId);
	}

	public boolean login(int mID, String password) {
		
		 Manager m  = mDao.findManager(mID);
		 if (m.getmPassword().equals(password))
			 return true;
		 
		 return false;
	}

	public List<Booking> viewCabRequest(int mId) {
		
		return  bDao.findEmployeesByManager(mId);
	}

	public void approveRequest(int bId, boolean approve) {
			bDao.updateApprove(approve, bId);	
	}
	
	
	

}
