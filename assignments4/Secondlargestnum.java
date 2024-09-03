package assignments4;

public class Secondlargestnum {

	public static void main(String[] args) {
// Declare an array {3, 2, 11, 4, 6, 7}
		int[]array= {3,2,11,4,6,7};
	    Integer largest=null;
	    Integer secondlargest=null;
	    for (int i = 0; i < array.length; i++) {
			int num=array[i];
			if (largest == null || num > largest) {
				secondlargest=largest;
				largest=num;	
			}else if (num!=largest && (secondlargest == null || num > secondlargest)) {
				secondlargest = num;
			}
			
}
	    if (secondlargest == null) {
			System.out.println("there is no second large element because all element are same");
		} else {
System.out.println("the second large num is: "+ secondlargest);
		}
	}}
