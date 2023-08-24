package com.osttra.onlinebookshop.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.osttra.onlinebookshop.utils.DBUtils;
import com.osttra.onlinebookshop.DTO.BookDTO;
import com.osttra.onlinebookshop.DTO.UserDTO;

public class UserDAO {
	
	private Connection dbConnectionObject;
	private PreparedStatement mySQLQueryStatement;
	
	public UserDAO() throws Exception {
		dbConnectionObject = DBUtils.establishConnection();
	}
	
	public void addNewUser(UserDTO user) throws Exception {		
		String userName = user.getUserName();
		String emailID = user.getEmailID();
		String firstName = user.getFirstName();
		String lastName = user.getLastName();
		String password = user.getPassword();
		String userType = user.getUserType();
		mySQLQueryStatement = dbConnectionObject.prepareStatement("INSERT INTO users_table VALUES(?, ?, ?, ?, ?, ?)");
		mySQLQueryStatement.setString(1, userName);
		mySQLQueryStatement.setString(2, emailID);
		mySQLQueryStatement.setString(3, firstName);
		mySQLQueryStatement.setString(4, lastName);
		mySQLQueryStatement.setString(5, password);
		mySQLQueryStatement.setString(6, userType);
		mySQLQueryStatement.executeUpdate();
	}
	
	public UserDTO getExisitingUser(UserDTO user) throws Exception {
		String userName = user.getUserName();
		String emailID = user.getEmailID();
		String firstName = user.getFirstName();
		String lastName = user.getLastName();
		String password = user.getPassword();
		String userType = user.getUserType();
		mySQLQueryStatement = dbConnectionObject.prepareStatement("SELECT * FROM users_table WHERE user_name = ? AND password = ?");
		mySQLQueryStatement.setString(1, userName);
		mySQLQueryStatement.setString(2, password);
		ResultSet fetchQueryResultSet = mySQLQueryStatement.executeQuery();
		while (fetchQueryResultSet.next()) {
			userName = fetchQueryResultSet.getString(1);
			emailID = fetchQueryResultSet.getString(2);
			firstName = fetchQueryResultSet.getString(3);
			lastName = fetchQueryResultSet.getString(4);
			userType = fetchQueryResultSet.getString(6);
			user = new UserDTO(userName, emailID, firstName, lastName, userType);
		}
		return user;
	}
	
	public List<UserDTO> getAllUsers() throws Exception {
		mySQLQueryStatement = dbConnectionObject.prepareStatement("SELECT * FROM users_table");
		ResultSet fetchQueryResultSet = mySQLQueryStatement.executeQuery();
		List<UserDTO> fetchQueryResultList = new ArrayList<>();
		while (fetchQueryResultSet.next()) {
			String userName = fetchQueryResultSet.getString(1);
			String emailID = fetchQueryResultSet.getString(2);
			String firstName = fetchQueryResultSet.getString(3);
			String lastName = fetchQueryResultSet.getString(4);
			String userType = fetchQueryResultSet.getString(6);
			UserDTO currentUserDTO = new UserDTO(userName, emailID, firstName, lastName, userType);
			fetchQueryResultList.add(currentUserDTO);
		}
		return fetchQueryResultList;
	}
//	
//	public void removeExistingUser() throws Exception {
//		
//	}
//	
//	public void removeAllUsers() throws Exception {
//		
//	}
	
}
