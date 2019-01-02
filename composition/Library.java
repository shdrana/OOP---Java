package composition;

import java.awt.List;
import java.util.ArrayList;

public class Library {
	private ArrayList<Book> bookList;

	public Library(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	
	public ArrayList<Book> getAlllBooksFromLibrary(){
	       return bookList;  
	  }
	
	

}
