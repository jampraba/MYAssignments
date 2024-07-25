package Assignments;

public class IsPrime {
	public static String IsPrimeNumber(int num) {
boolean b=false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				b=true;
			}
		}
		if(b) {
			return "non-prime";
		}else {
			return "prime";	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(IsPrimeNumber(91));
		System.out.println(IsPrimeNumber(35));
		System.out.println(IsPrimeNumber(13));
		System.out.println(IsPrimeNumber(11));
		System.out.println(IsPrimeNumber(18));
		

	}
	

}


