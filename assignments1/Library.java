package assignments1;

public class Library {

	public String addBook (String bookTitle) {
		 System.out.println("Book added succesfully");
		 return bookTitle;
		 }
		 public void issuebook() {
		 System.out.println("Book issued successfully");
		 }
		 public static void main(String[] args) {
			 Library Lib= new Library();
			 Lib.addBook("Science");
			 Lib.issuebook();
			 
		 }
		

	}
