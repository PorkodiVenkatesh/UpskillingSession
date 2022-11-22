package com.org.cabBookingSystem.dao;

import java.util.List;

import com.org.cabBookingSystem.models.Employee;

public interface EmployeeDAO {
	
	// insert into Employee values();
	void insertEmployee(Employee e);

// delete * from Employee where e_id = 13;
         void deleteEmployee(int eId);

// update employee set password = ;ljsvnc where e_id = 13;
          void updatePassword(String password, int eId);

// select * from employees where m_id = 12; -> return all employee rows
			List<Employee> findAllEmployees(int mId);

          // select * from employee where e_id = 13;
	 Employee findEmployee(int eId);

}
