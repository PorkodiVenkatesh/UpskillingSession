package com.org.cabBookingSystem.service.impl;

import com.org.cabBookingSystem.dao.BookingDAO;
import com.org.cabBookingSystem.dao.CabDAO;
import com.org.cabBookingSystem.dao.EmployeeDAO;
import com.org.cabBookingSystem.dao.ManagerDAO;
import com.org.cabBookingSystem.dao.impl.BookingDAOImpl;
import com.org.cabBookingSystem.dao.impl.CabDAOImpl;
import com.org.cabBookingSystem.dao.impl.EmployeeDAOImpl;
import com.org.cabBookingSystem.dao.impl.ManagerDAOImpl;
import com.org.cabBookingSystem.models.Cab;
import com.org.cabBookingSystem.models.Employee;
import com.org.cabBookingSystem.models.Manager;
import com.org.cabBookingSystem.service.AdminService;

public class AdminServiceImpl  implements AdminService{
	
	CabDAO cDao = new CabDAOImpl();
	EmployeeDAO eDao = new EmployeeDAOImpl();
	ManagerDAO mDao = new ManagerDAOImpl();
	BookingDAO bdao = new BookingDAOImpl();
	

	public void addCab(Cab c) {
		cDao.insertCab(c);
	}

	public void addEmployee(Employee e) {
		eDao.insertEmployee(e);
		
	}

	public void addManager(Manager m) {
	  mDao.insertManager(m);
		
	}

	public void allocateCab(int cNumber , int bId) {
		
		bdao.updateCabNumber(cNumber, bId);
	}

	public boolean login(int aId, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
