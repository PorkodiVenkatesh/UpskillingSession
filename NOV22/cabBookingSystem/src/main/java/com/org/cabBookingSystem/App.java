package com.org.cabBookingSystem;

import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;
import com.org.cabBookingSystem.controller.AdminController;
import com.org.cabBookingSystem.dao.EmployeeDAO;
import com.org.cabBookingSystem.dao.ManagerDAO;
import com.org.cabBookingSystem.dao.impl.EmployeeDAOImpl;
import com.org.cabBookingSystem.dao.impl.ManagerDAOImpl;
import com.org.cabBookingSystem.models.Employee;
import com.org.cabBookingSystem.models.Manager;
import com.org.cabBookingSystem.util.ConnectionUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    //	try {
    		
   //	
//    	
//    	Manager m  = new Manager();
//    	
//    	System.out.println("Enter Manager Name: ");
//    	m.setmName(sc.next());
//    	
//    	System.out.println("Enter Manager Email: ");
//    	m.setmEmail(sc.next());
//    	
//    	System.out.println("Enter Password: ");
//    	m.setmPassword(sc.next());
//    	
//    	ManagerDAO  mDAO = new ManagerDAOImpl();
//    	
//    	mDAO.insertManager(m);
//    	
    		
//        Employee e = new Employee();
//        
//    	System.out.println("Enter Employee Name: ");
//    	e.seteName(sc.next());
//    	
//    	System.out.println("Enter Employee Email: ");
//    	e.seteEmail(sc.next());
//    	
//    	System.out.println("Enter Password: ");
//    	e.setePassword(sc.next());
//    	
//    	
//    	System.out.println("Enter Manager ID: ");
//    	 	e.setmId(sc.nextInt()); 
//    	 	
//    	 	EmployeeDAO  eDAO  = new EmployeeDAOImpl();
//    	 	
//    	 	eDAO.insertEmployee(e);
//    	 	
//    	 	
//    	 	System.out.println("Enter Employee ID to delete: ");
//    	 	
//    	 	eDAO.deleteEmployee(sc.nextInt());
//    	 	
//    	 	
//    	 	
//    	 	System.out.println("Enter Employee ID to Update the password: ");
//    	 	int idToUpdate = sc.nextInt();
//    	 	
//            System.out.println("Enter New Password: ");
//            String password = sc.next();
//            
//            eDAO.updatePassword(password, idToUpdate);
//            
//            List<Employee>  eList = eDAO.findAllEmployeesByManagerID(2);
//            
//            System.out.println("Employess under Manager ID = 2: ");
//            for (Employee employee : eList) {
//				System.out.println(employee.geteId() + " " +
//						employee.geteName()+ "  " +
//						employee.geteEmail() + " " + 
//						employee.getePassword()+ " " +
//						employee.getmId());
//			}
//            
//            System.out.println("Enter Employee ID: ");
//    	 	int idToGet = sc.nextInt();
//            
//            Employee employee = eDAO.findEmployee(idToGet);
//            
//            System.out.println(employee.geteId() + " " +
//					employee.geteName()+ "  " +
//					employee.geteEmail() + " " + 
//					employee.getePassword()+ " " +
//					employee.getmId());
//    	 	
//    	}
//    	
//    	catch(Exception e) {
//    		System.err.println(e.getMessage());
//    	}
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println(" 1. Admin \n 2. Manager \n 3. Employee");
    	
    	System.out.println("Select your role: ");
    	int role = sc.nextInt();
    	
    	System.out.println("-----LOGIN------");
    	
    	System.out.println("Enter Id: ");
		int id = sc.nextInt();
		
		System.out.println("Enter password: ");
		String password = sc.next();
		
    	switch(role) {
    	
    	case 1: 
    		AdminController.Login(id, password);
    		break;
    	}
    	
    }
    
}
