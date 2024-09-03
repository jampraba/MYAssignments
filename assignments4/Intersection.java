package assignments4;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
//Declare an array for {3, 2, 11, 4, 6, 7}
	int[]Array1 = {3,2,11,4,6,7};
// Declare another array for {1, 2, 8, 4, 9, 7} -
	int[]Array2 = {1,2,8,4,9,7};
//Compare both the arrays -
List<Integer> list1 = new ArrayList<>();
 for(int num : Array1) {
	 list1.add(num);
 }
//array 2
 List<Integer> list2 = new ArrayList<>();
 for(int num : Array2) {
	 list2.add(num);
 }
		
List<Integer> Intersection = new ArrayList<>(list1);
Intersection.retainAll(list2);
//Print the values if they
System.out.println("Common values in 2 arrays are intersected : "+ Intersection);
	}

}
