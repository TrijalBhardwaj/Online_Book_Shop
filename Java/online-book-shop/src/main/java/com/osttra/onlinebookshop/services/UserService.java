package com.osttra.onlinebookshop.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.osttra.onlinebookshop.DAO.UserDAO;
import com.osttra.onlinebookshop.DTO.UserDTO;

public class UserService {
	
	private static Scanner scn = new Scanner(System.in);
	private UserDAO userDAO = new UserDAO();
	
	public UserService() throws Exception {
		
	}
	
	public void normalUserSignUp() throws Exception {
		System.out.print("Enter Your First Name : ");
		String firstName = scn.next();
		
		System.out.print("\nEnter Your Last Name : ");
		String lastName = scn.next();
		
		System.out.print("\nEnter Your E-Mail ID : ");
		String emailID = scn.next();
		
		System.out.print("\nSet Your UserName : ");
		String userName = scn.next();
		
		System.out.print("\nSet Your Password : ");
		String password = scn.next();
		
		String userType = "Normal User";
		
		UserDTO userDTO = new UserDTO(userName, emailID, firstName, lastName, password, userType);
		
		userDAO.addNewUser(userDTO);
	}
	
	public void adminUserSignUp() throws Exception {
		System.out.print("Enter Your First Name : ");
		String firstName = scn.next();
		
		System.out.print("\nEnter Your Last Name : ");
		String lastName = scn.next();
		
		System.out.print("\nEnter Your E-Mail ID : ");
		String emailID = scn.next();
		
		System.out.print("\nSet Your UserName : ");
		String userName = scn.next();
		
		System.out.print("\nSet Your Password : ");
		String password = scn.next();
		
		String userType = "Admin";
		
		UserDTO userDTO = new UserDTO(userName, emailID, firstName, lastName, password, userType);
		
		userDAO.addNewUser(userDTO);
	}
	
	public void normalUserLogIn() throws Exception {
		System.out.print("Enter Your UserName : ");
		String userName = scn.next();
		
		System.out.print("\nEnter Your E-Mail ID : ");
		String emailID = scn.next();
		
		System.out.print("\nEnter Your Password : ");
		String password = scn.next();
		
		String userType = "Normal User";
		
		UserDTO userDTO = new UserDTO(userName, emailID, password, userType);
		
		userDAO.getExisitingUser(userDTO);
	}

	public void adminUserLogIn() throws Exception {
		System.out.print("Enter Your UserName : ");
		String userName = scn.next();
		
		System.out.print("\nEnter Your E-Mail ID : ");
		String emailID = scn.next();
		
		System.out.print("\nEnter Your Password : ");
		String password = scn.next();
		
		String userType = "Admin";
		
		UserDTO userDTO = new UserDTO(userName, emailID, password, userType);
		
		userDAO.getExisitingUser(userDTO);
	}
	
	public void adminUserSeeAllUsersDetails() throws Exception {
		List<UserDTO> allUsersList = userDAO.getAllUsers();
		System.out.println(allUsersList);
	}
	
}