package Week1.Day2;

public class libraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Library lib = new Library();  // Creating an object of Library class
		 String title = lib.addBook("TestLeaf - Learn Selenium");
	     System.out.println("Book Title: " + title);
	     lib.issueBook();
	}

}
