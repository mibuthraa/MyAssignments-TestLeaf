package Week1.Day2;

public class Library {
	    // Method to add a book
	    public String addBook(String bookTitle) {
	        System.out.println("Book added successfully");
	        return bookTitle;
	    }

	    public void issueBook() {
	        System.out.println("Book issued successfully");
	    }

	    public static void main(String[] args) {
	        Library myLibrary = new Library();  // Creating an object
	        String title = myLibrary.addBook("TestLeaf - Learn Java");
	        System.out.println("Book Title: " + title);
	        myLibrary.issueBook();
	    }
}
