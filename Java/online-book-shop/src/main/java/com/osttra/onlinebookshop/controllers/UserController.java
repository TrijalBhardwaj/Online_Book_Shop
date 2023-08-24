package com.osttra.onlinebookshop.controllers;

import java.util.Scanner;

import com.osttra.onlinebookshop.DTO.UserDTO;
import com.osttra.onlinebookshop.services.BookService;
import com.osttra.onlinebookshop.services.UserService;

public class UserController {

	private static Scanner scn = new Scanner(System.in);
	private static UserService userService;

	public void viewSignUpLoginPage() throws Exception {
		boolean exitSignUpLoginPageFlag = false;

		while (exitSignUpLoginPageFlag != true) {
			userService = new UserService();
			System.out.print("\n<-----SignUp/Login Page----->\n");

			System.out.print("\n1. New User?, Sign Up");
			System.out.print("\n2. Existing User? Log In");
			System.out.print("\n3. Exit The Application\n");
			System.out.print("\nPlease Enter Your Choice : ");
			int choice = scn.nextInt();
			switch (choice) {
			case 1:
				signUp();
				break;
			case 2:
				logIn();
				System.out.print("\n1. Add A New Book");
				System.out.print("\n2. See All Users\n");
				System.out.print("\nPlease Enter Your Choice : ");
				int choice1 = scn.nextInt();
				switch (choice1) {
				case 1:
					BookService bookService = new BookService();
					bookService.adminUserAddNewBook();
					break;
				case 2:
					UserService userService = new UserService();
					userService.adminUserSeeAllUsersDetails();					
					break;
				default:
					System.out.print("\nInvalid Choice, Please Select A Valid Choice\n");
					break;
				}
				break;
			case 3:
				System.out.print("\n<-----Exiting The Application----->\n");
				exitSignUpLoginPageFlag = true;
				break;
			default:
				System.out.println("Invalid Choice, Please Select A Valid Choice");
				break;
			}
		}
	}

	public static void signUp() throws Exception {
		System.out.println("=====New User SignUp Page=====");
		System.out.println();
		System.out.println("1. Normal User Sign Up");
		System.out.println("2. Admin User Sign Up");
		System.out.println();
		System.out.print("Please Enter Your Choice : ");
		int choice = scn.nextInt();
		switch (choice) {
		case 1:
			userService.normalUserSignUp();
			break;
		case 2:
			userService.adminUserSignUp();
			break;
		default:
			System.out.println("Invalid Choice, Please Select A Valid Choice");
			break;
		}
	}

	public static void logIn() throws Exception {
		System.out.println("=====Existing User LogIn Page=====");
		System.out.println();
		System.out.println("1. Normal User Log In");
		System.out.println("2. Admin User Log In");
		System.out.println();
		System.out.print("Please Enter Your Choice : ");
		int choice = scn.nextInt();
		switch (choice) {
		case 1:
			userService.normalUserLogIn();
			break;
		case 2:
			userService.adminUserLogIn();
			break;
		default:
			System.out.println("Invalid Choice, Please Select A Valid Choice");
			break;
		}
	}

}