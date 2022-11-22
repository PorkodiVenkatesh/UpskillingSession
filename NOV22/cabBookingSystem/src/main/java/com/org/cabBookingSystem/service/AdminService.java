package com.org.cabBookingSystem.service;

import com.org.cabBookingSystem.models.Cab;
import com.org.cabBookingSystem.models.Employee;
import com.org.cabBookingSystem.models.Manager;

/*
-> add a cab, update a cab details, delete a cab, read/retrive a cab
-> add a employee, update a employee details, delete a employee, read/retrive employee
-> add a manager, update a manager details, delete a manager, read/retrive a manager
-> allocate the cab to the employee
 */
public interface AdminService {
	
	boolean login(int aId, String password);
	
	void addCab(Cab c);
	
	void addEmployee(Employee e);
	
	void addManager(Manager m);
	
	void allocateCab(int cNumber, int bId);
	
	

}
