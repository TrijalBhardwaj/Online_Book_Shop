package com.osttra.onlinebookshop.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.osttra.onlinebookshop.utils.DBUtils;
import com.osttra.onlinebookshop.DTO.BookDTO;
import com.osttra.onlinebookshop.DTO.UserDTO;

public class BookDAO {
	
	private Connection dbConnectionObject;
	private PreparedStatement mySQLQueryStatement;
	
	public BookDAO() throws Exception {
		dbConnectionObject = DBUtils.establishConnection();
	}
	
	public void addNewBook(BookDTO book) throws Exception {
		String bookID = book.getbookID();
		String bookName = book.getBookName();
		String authorName = book.getAuthorName();
		String description = book.getDescription();
		mySQLQueryStatement = dbConnectionObject.prepareStatement("INSERT INTO books_table VALUES(?, ?, ?, ?)");
		mySQLQueryStatement.setString(1, bookID);
		mySQLQueryStatement.setString(2, bookName);
		mySQLQueryStatement.setString(3, authorName);
		mySQLQueryStatement.setString(4, description);
		mySQLQueryStatement.executeUpdate();
	}
	
	public BookDTO getExisitingBookByBookID(String bookID) throws Exception {
		mySQLQueryStatement = dbConnectionObject.prepareStatement("SELECT * FROM books_table WHERE book_id = ?");
		mySQLQueryStatement.setString(1, bookID);
		ResultSet fetchQueryResultSet = mySQLQueryStatement.executeQuery();
		List<BookDTO> fetchQueryResultList = new ArrayList<>();
		BookDTO book = new BookDTO();
		while (fetchQueryResultSet.next()) {
			bookID = fetchQueryResultSet.getString(1);
			String bookName = fetchQueryResultSet.getString(2);
			String authorName = fetchQueryResultSet.getString(3);
			String description = fetchQueryResultSet.getString(4);
			book = new BookDTO(bookID, bookName, authorName, description);
		}
		return book;
	}
	
	public List<BookDTO> getAllBooks() throws Exception {
		mySQLQueryStatement = dbConnectionObject.prepareStatement("SELECT * FROM books_table");
		ResultSet fetchQueryResultSet = mySQLQueryStatement.executeQuery();
		List<BookDTO> fetchQueryResultList = new ArrayList<>();
		while (fetchQueryResultSet.next()) {
			String bookID = fetchQueryResultSet.getString(1);
			String bookName = fetchQueryResultSet.getString(2);
			String authorName = fetchQueryResultSet.getString(3);
			String description = fetchQueryResultSet.getString(4);
			BookDTO currentBookDTO = new BookDTO(bookID, bookName, authorName, description);
			fetchQueryResultList.add(currentBookDTO);
		}
		return fetchQueryResultList;
	}
	
//	public void removeExistingBook() {
//		
//	}
//	
//	public void removeAllBooks() {
//		
//	}
	
}