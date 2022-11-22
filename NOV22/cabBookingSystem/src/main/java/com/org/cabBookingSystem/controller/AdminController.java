package com.org.cabBookingSystem.controller;

import java.util.Scanner;

import com.org.cabBookingSystem.models.Manager;
import com.org.cabBookingSystem.service.AdminService;
import com.org.cabBookingSystem.service.impl.AdminServiceImpl;

public class AdminController {

	public static void getMenu() {
		System.out.println(" 1. Add Manager "
				+ "\n 2. Add Employee"
				+ "\n 3. Add Cab ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		
		AdminService adminService = new AdminServiceImpl();
		
		switch(choice) {
		
		
		case 1:  
			Manager m  = new Manager();
    	
	    	System.out.println("Enter Manager Name: ");
	    	m.setmName(sc.next());
	    	
	    	System.out.println("Enter Manager Email: ");
	    	m.setmEmail(sc.next());
	    	
	    	System.out.println("Enter Password: ");
	    	m.setmPassword(sc.next());
	    	
			adminService.addManager(m);
			
		}
		
		
	}

	public static void Login(int id, String password) {
		
	  if (id == 1 && password.equals("porkodi@123")) {
		  getMenu();
	  }
	  else {
		  System.out.println("User Not Found");		
	  }
	
		
	}



}
