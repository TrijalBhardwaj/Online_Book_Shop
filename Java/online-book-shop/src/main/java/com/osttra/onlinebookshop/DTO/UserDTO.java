package com.osttra.onlinebookshop.DTO;

import java.util.Arrays;

public class UserDTO {
	
	private String userName;
	private String emailID;
	private String firstName;
	private String lastName;
	private String password;
	private String userType;
	private BookDTO[] newBooks;
	private BookDTO[] favoriteBooks;
	private BookDTO[] completedBooks;
	
	public UserDTO() {
		
	}
	
	public UserDTO(String userName, String emailID, String firstName, String lastName, String password,
			String userType) {
		this.userName = userName;
		this.emailID = emailID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.userType = userType;
	}
	
	public UserDTO(String userName, String emailID, String password, String userType) {
		this.userName = userName;
		this.emailID = emailID;
		this.password = password;
		this.userType = userType;
	}

	public UserDTO(String userName, String emailID, String firstName, String lastName, String password, String userType, BookDTO[] newBooks, BookDTO[] favoriteBooks, BookDTO[] completedBooks) {
		this.userName = userName;
		this.emailID = emailID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.userType = userType;
		this.newBooks = newBooks;
		this.favoriteBooks = favoriteBooks;
		this.completedBooks = completedBooks;
	}

	public UserDTO(String userName, String emailID, String firstName, String lastName, String userType) {
		this.userName = userName;
		this.emailID = emailID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public BookDTO[] getNewBooks() {
		return newBooks;
	}

	public void setNewBooks(BookDTO[] newBooks) {
		this.newBooks = newBooks;
	}

	public BookDTO[] getFavoriteBooks() {
		return favoriteBooks;
	}

	public void setFavoriteBooks(BookDTO[] favoriteBooks) {
		this.favoriteBooks = favoriteBooks;
	}

	public BookDTO[] getCompletedBooks() {
		return completedBooks;
	}

	public void setCompletedBooks(BookDTO[] completedBooks) {
		this.completedBooks = completedBooks;
	}

	@Override
	public String toString() {
		return "UserDTO {" + "\n" + "userName = " + userName + "," + "\n" + "emailID = " + emailID + "," + "\n" + "firstName = " + firstName + "," + "\n" + "lastName = " + lastName + "," + "\n" + "password = " + password + "\n" + "}" + "\n";
	}
	
//	public String toString() {
//		return "UserDTO [userName=" + userName + ", emailID=" + emailID + ", firstName=" + firstName + ", lastName="
//				+ lastName + ", password=" + password + ", userType=" + userType + ", newBooks="
//				+ Arrays.toString(newBooks) + ", favoriteBooks=" + Arrays.toString(favoriteBooks) + ", completedBooks="
//				+ Arrays.toString(completedBooks) + "]" + "\n";
//	}
	
	
	
}
