package com.osttra.onlinebookshop.DTO;

public class BookDTO {
	
	private String bookID;
	private String bookName;
	private String authorName;
	private String description;
	
	public BookDTO() {
		
	}
	
	public BookDTO(String bookID, String bookName, String authorName, String description) {
		this.bookID = bookID;
		this.bookName = bookName;
		this.authorName = authorName;
		this.description = description;	
	}
	
	public String getbookID() {
		return bookID;
	}

	public void setbookID(String bookID) {
		this.bookID = bookID;
	}
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "BookDTO {" + "\n" + "bookID = " + bookID + "," + "\n" + "bookName = " + bookName + "," + "\n" + "authorName = " + authorName + "," + "\n" + "description = " + description + "\n" + "}" + "\n";
	}
	
	
	
}
