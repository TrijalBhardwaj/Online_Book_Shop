package com.osttra.onlinebookshop.services;

import java.util.List;
import java.util.Scanner;

import com.osttra.onlinebookshop.DAO.BookDAO;
import com.osttra.onlinebookshop.DTO.BookDTO;
import com.osttra.onlinebookshop.DTO.UserDTO;

public class BookService {
	
	private static Scanner scn = new Scanner(System.in);
	private BookDAO bookDAO = new BookDAO();
	
	public BookService() throws Exception {
		
	}
	
	public void normalUserGetAllBooks() throws Exception {
		List<BookDTO> allBooksList = bookDAO.getAllBooks();
		System.out.println(allBooksList);
	}
	
	public void normalUserGetBookByBookID() throws Exception {
		System.out.print("Enter Book ID : ");
		String bookID = scn.next();
		
		BookDTO book = bookDAO.getExisitingBookByBookID(bookID);
		System.out.println(book);
	}
	
	public void adminUserAddNewBook() throws Exception {
		System.out.print("Enter Book ID : ");
		String bookID = scn.next();
		
		System.out.print("\nEnter Book Name : ");
		String bookName = scn.next();
		
		System.out.print("\nEnter Author Name : ");
		String authorName = scn.next();
		
		System.out.print("\nEnter Book Description : ");
		String description = scn.next();
		
		BookDTO bookDTO = new BookDTO(bookID, bookName, authorName, description);
		
		bookDAO.addNewBook(bookDTO);
	}
	
}