package com.osttra.onlinebookshop;

import java.util.Scanner;

import com.osttra.onlinebookshop.controllers.UserController;

public class OnlineBookShopRunner {

	public static void main(String[] args) throws Exception {
		System.out.print("\n<-----Online Book Shop Home Page----->\n");

		Scanner scn = new Scanner(System.in);

		boolean exitApplicationFlag = false;

		while (exitApplicationFlag != true) {
			System.out.print("\n1. Log In To The Application");
			System.out.print("\n2. Exit The Application\n");
			System.out.print("\nPlease Enter Your Choice : ");
			int choice = scn.nextInt();
			switch (choice) {
			case 1:
				UserController userController = new UserController();
				userController.viewSignUpLoginPage();
				break;
			case 2:
				System.out.print("\n<-----Exiting The Application----->\n");
				exitApplicationFlag = true;
				break;
			default:
				System.out.print("\nInvalid Choice, Please Select A Valid Choice\n");
				break;
			}
		}

	}

}
