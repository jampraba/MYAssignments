package assignments1;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		Scanner fib= new Scanner(System.in);
		System.out.println("Enter the input:");
		
		int num=fib.nextInt();
		fib.close();
		int out=0;
	    int out1=1;
	    int out2=0;
	    System.out.println("Fibonacci Series:"+ out+"\n"+"Fibonacci Series;"+out1);
	    for(int i=1;out<num;i++)
	    	out2= out+out1 ; 
	    out = out1;
	    out1= out2;
	    System.out.println("Fibonacciseries:"+out2);
	    
	    

	}

}
