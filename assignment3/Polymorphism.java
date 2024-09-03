package assignment3;

public class Polymorphism {
public void reportmessage (String cell,String phone ) {
	System.out.println("Message in cell :" + phone);
	System.out.println("Message in phone :" + cell);
	
}
public void reportmessage (String cell,String phone,Boolean photo ) {
	System.out.println("message in cell :" + true);
	System.out.println("message in phone :" + true);
	System.out.println("it is phone :" + cell);
}
public static void main(String[] args) {
	Polymorphism pj = new Polymorphism();
	pj.reportmessage("jam" ,"praba");
	pj.reportmessage("iloveu", "aryan", true);
}
}
