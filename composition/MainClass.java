package composition;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
        Book book1 = new Book("Complete Reference Java", "Herbert Schield");
        Book book2 = new Book("Under the Sea", "Daniel Dipo");
         
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(book1);
        bookList.add(book2);
        
        Library aLibrary = new Library(bookList);
         
        ArrayList<Book> allBooks = aLibrary.getAlllBooksFromLibrary();
        for(Book book : allBooks){
             
            System.out.println(book.getName() + " by " + book.getAuthor());
        }

	}

}
